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

//we get a fruites list if there is information in db
    public ResponseEntity<?> getFruites(){
        List<Fruita> fruitaList = repository.findAll();
        if (!fruitaList.isEmpty()){
            return new ResponseEntity<>(fruitaList, HttpStatus.OK);
        }else{
            return new ResponseEntity<>("There is no information in fruites database", HttpStatus.NOT_FOUND);
        }
    }
// we take all the information from an existing fruita by ID if exist
    public ResponseEntity<?> getFruita(Integer id) {
        //Optional is used to represent Optional object or empty value instead null reference.
        Optional<Fruita> optionalFruita = repository.findById(id);
        if (optionalFruita.isPresent()){
            return new ResponseEntity<>(optionalFruita.get(), HttpStatus.OK);
        }else{
            return new ResponseEntity<>(String.format("ID %d not found in fruites database", id), HttpStatus.NOT_FOUND);
        }
    }

    // we add a fruita or show corresponding error message
    public ResponseEntity<?> addFruita(Fruita fruita) {
        if ((fruita.getName() != null) && (fruita.getqKilos() >= 0) && !repository.existsById(fruita.getId())){
            Fruita saveFruita = repository.save(fruita);
            //The HTTP headers are used to pass additional information between the clients and the server through the request and response header.
            HttpHeaders responseHeaders = new HttpHeaders();
            responseHeaders.setLocation(URI.create(String.format("/fruita/%d", saveFruita.getId())));
            return new ResponseEntity<>(String.format("Fruit added successfully on /fruita database/%d",
                    saveFruita.getId()), responseHeaders, HttpStatus.CREATED);
        }else{
            if (fruita.getName() == null && fruita.getqKilos() < 0){
                return new ResponseEntity<>("Name cannot be empty, quantity cannot be less than zero", HttpStatus.BAD_REQUEST);
            }else if (fruita.getName() == null) {
                return new ResponseEntity<>("Name cannot be empty", HttpStatus.BAD_REQUEST);
            }else if (fruita.getqKilos() < 0){
                return new ResponseEntity<>("Quantity cannot be less than zero", HttpStatus.BAD_REQUEST);
            }else{
                return new ResponseEntity<>("This ID already exists", HttpStatus.BAD_REQUEST);
            }
        }

    }
// Update a fruita or show corresponding error message
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
//delete fruita by ID or show error message
    public ResponseEntity<?> deleteFruita(Integer id) {
        if (repository.existsById(id)){
            repository.deleteById(id);
            return new ResponseEntity<>(String.format("ID " + id + " %d deleted", id), HttpStatus.OK);
        }else{
            return new ResponseEntity<>(String.format("ID " + id + " %d not found!", id), HttpStatus.NOT_FOUND);
        }
    }
}
