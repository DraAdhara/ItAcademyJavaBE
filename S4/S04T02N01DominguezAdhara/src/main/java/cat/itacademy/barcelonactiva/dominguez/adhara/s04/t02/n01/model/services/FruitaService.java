package cat.itacademy.barcelonactiva.dominguez.adhara.s04.t02.n01.model.services;

import cat.itacademy.barcelonactiva.dominguez.adhara.s04.t02.n01.model.domain.Fruita;
import cat.itacademy.barcelonactiva.dominguez.adhara.s04.t02.n01.model.repository.IFruitaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.net.URI;
import java.util.List;
import java.util.Optional;

@Service
public class FruitaService {

    @Autowired
    private IFruitaRepository repository;
//PENDIENTE MIRAR
/*ResponseEntity represents the whole HTTP response: status code, headers, and body. As a result, we can use it to
fully configure the HTTP response.
*/

    public ResponseEntity<?> getFruites(){
        List<Fruita> fruitaList = repository.findAll();
        if (!fruitaList.isEmpty()){
            return new ResponseEntity<>(fruitaList, HttpStatus.OK);
        }else{
            return new ResponseEntity<>("There is no information in fruites database", HttpStatus.NOT_FOUND);
        }
    }
// we take all the information from an existing fruita
    public ResponseEntity<?> getFruita(Integer id) {
        Optional<Fruita> optionalFruita = repository.findById(id);
        if (optionalFruita.isPresent()){
            return new ResponseEntity<>(optionalFruita.get(), HttpStatus.OK);
        }else{
            return new ResponseEntity<>(String.format("ID %d not found in fruites database", id), HttpStatus.NOT_FOUND);
        }
    }

    // we add a fruita or show error message
    public ResponseEntity<?> addFruita(Fruita fruita) {
        if ((fruita.getName() != null) && (fruita.getqKilos() >= 0) && !repository.existsById(fruita.getId())){
            Fruita saveFruita = repository.save(fruita);
            HttpHeaders responseHeaders = new HttpHeaders();
            responseHeaders.setLocation(URI.create(String.format("/fruita/%d", saveFruita.getId())));
            return new ResponseEntity<>(String.format("Fruit added successfully on /fruita/%d",
                    saveFruita.getId()), responseHeaders, HttpStatus.CREATED);
        }else{
            if (fruita.getName() == null && fruita.getqKilos() < 0){
                return new ResponseEntity<>("Name cannot be empty, quantity cannot be less than zero", HttpStatus.BAD_REQUEST);
            }else if (fruita.getName() == null) {
                return new ResponseEntity<>("Name cannot be empty!", HttpStatus.BAD_REQUEST);
            }else if (fruita.getqKilos() < 0){
                return new ResponseEntity<>("Quantity cannot be less than zero", HttpStatus.BAD_REQUEST);
            }else{
                return new ResponseEntity<>("This ID already exists", HttpStatus.BAD_REQUEST);
            }
        }

    }
// Update a fruita or show error message
    public ResponseEntity<?> updateFruita(Fruita fruita) {
        if (repository.existsById(fruita.getId())){
            Fruita saveFruita = repository.getReferenceById(fruita.getId());
            if (fruita.getName() != null) {
                saveFruita.setName(fruita.getName());
            }
            if (fruita.getqKilos() >= 0){
                saveFruita.setqKilos(fruita.getqKilos());

            }
            repository.save(saveFruita);
            return new ResponseEntity<>(String.format("information updated successfully on /fruita/%d", saveFruita.getId()),HttpStatus.OK);
        } else {
            return new ResponseEntity<>(String.format("ID %d not found!", fruita.getId()), HttpStatus.NOT_FOUND);
        }
    }
//delete fuirta or show error message
    public ResponseEntity<?> deleteFruita(Integer id) {
        if (repository.existsById(id)){
            repository.deleteById(id);
            return new ResponseEntity<>(String.format("200 - ID %d deleted", id), HttpStatus.OK);
        }else{
            return new ResponseEntity<>(String.format("ID %d not found!", id), HttpStatus.NOT_FOUND);
        }
    }
}
