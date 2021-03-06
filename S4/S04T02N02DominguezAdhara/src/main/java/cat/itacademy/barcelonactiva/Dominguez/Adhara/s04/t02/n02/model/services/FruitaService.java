package cat.itacademy.barcelonactiva.Dominguez.Adhara.s04.t02.n02.model.services;

import cat.itacademy.barcelonactiva.Dominguez.Adhara.s04.t02.n02.model.domain.Fruita;
import cat.itacademy.barcelonactiva.Dominguez.Adhara.s04.t02.n02.model.repository.IFruitaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.net.URI;
import java.util.List;
import java.util.Optional;

/*@Service annotation is used with classes that provide some business functionalities. Spring context will autodetect
these classes when annotation-based configuration and classpath scanning is used.
*/
@Service
public class FruitaService {
/*@Autowired annotation is used for automatic dependency injection. Spring framework is built on dependency injection
and we inject the class dependencies through spring bean configuration file.
 */
     @Autowired
     private IFruitaRepository repository;

/*ResponseEntity represents the whole HTTP response: status code, headers, and body. As a result, we can use it to
fully configure the HTTP response.
*/

    //we get a fruites list if there is information in db
    public ResponseEntity<?> getFruites(){
        List<Fruita> fruitaList = repository.findAll();
        if (!fruitaList.isEmpty()){
            return new ResponseEntity<>(fruitaList, HttpStatus.OK);
        }else{
            return new ResponseEntity<>("There is no information in 'fruites' database", HttpStatus.NOT_FOUND);
        }
    }
    // we take all the information from an existing fruita by ID if exist
    public ResponseEntity<?> getFruita(Integer id) {
        //Optional is used to represent Optional object or empty value instead null reference.
        Optional<Fruita> optionalFruita = repository.findById(id);
        if (optionalFruita.isPresent()){
            return new ResponseEntity<>(optionalFruita.get(), HttpStatus.OK);
        }else{
            return new ResponseEntity<>(String.format("ID %d not found in 'fruites' database", id), HttpStatus.NOT_FOUND);
        }
    }

    // we add a fruita or show corresponding error message
    public ResponseEntity<?> addFruita(Fruita fruita) {
        if ((fruita.getName() != null) && (fruita.getqKilos() > 0) && !repository.existsById(fruita.getId())){
            Fruita saveFruita = repository.save(fruita);
            //The HTTP headers are used to pass additional information between the clients and the server through the request and response header.
            HttpHeaders responseHeaders = new HttpHeaders();
            responseHeaders.setLocation(URI.create(String.format("/fruita/%d", saveFruita.getId())));
            return new ResponseEntity<>(String.format("Fruit %d added successfully on 'fruites' database",
                    saveFruita.getId()), responseHeaders, HttpStatus.CREATED);
        }else{
            if (fruita.getName() == null && fruita.getqKilos() <= 0){
                return new ResponseEntity<>("Name cannot be empty, quantity cannot be less than one", HttpStatus.BAD_REQUEST);
            }else if (fruita.getName() == null) {
                return new ResponseEntity<>("Name cannot be empty", HttpStatus.BAD_REQUEST);
            }else if (fruita.getqKilos() <= 0){
                return new ResponseEntity<>("Quantity cannot be less than one", HttpStatus.BAD_REQUEST);
            }else{
                return new ResponseEntity<>("This ID already exists in 'fruites' database", HttpStatus.BAD_REQUEST);
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
            if (fruita.getqKilos() > 0){
                saveFruita.setqKilos(fruita.getqKilos());

            }
            repository.save(saveFruita);
            return new ResponseEntity<>(String.format("information updated successfully on 'fruites' database with ID %d", saveFruita.getId()),HttpStatus.OK);
        } else {
            return new ResponseEntity<>(String.format("ID %d not found in 'fruites' database", fruita.getId()), HttpStatus.NOT_FOUND);
        }
    }
    //delete fruita by ID or show error message
    public ResponseEntity<?> deleteFruita(Integer id) {
        if (repository.existsById(id)){
            repository.deleteById(id);
            return new ResponseEntity<>(String.format("ID %d deleted from 'fruites' database", id), HttpStatus.OK);
        }else{
            return new ResponseEntity<>(String.format("ID %d not found in 'fruites' database", id), HttpStatus.NOT_FOUND);
        }
    }
}

