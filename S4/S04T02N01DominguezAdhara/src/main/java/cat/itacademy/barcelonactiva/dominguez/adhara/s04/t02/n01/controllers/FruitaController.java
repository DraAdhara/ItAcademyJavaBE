package cat.itacademy.barcelonactiva.dominguez.adhara.s04.t02.n01.controllers;


import cat.itacademy.barcelonactiva.dominguez.adhara.s04.t02.n01.model.domain.Fruita;
import cat.itacademy.barcelonactiva.dominguez.adhara.s04.t02.n01.model.services.FruitaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

//@RestController annotation is used at the class level and allows the class to handle the requests made by the client.
@RestController
//@RequestMapping Annotation is used to map HTTP requests to handler methods of MVC and REST controllers
@RequestMapping("/fruita")
public class FruitaController {
/*Spring @Autowired annotation is used for automatic dependency injection. Spring framework is built on dependency
injection and we inject the class dependencies through spring bean configuration file.
 */
    @Autowired
    private FruitaService service;
/*The GET HTTP request is used to get a single or multiple resources and @GetMapping annotation for mapping HTTP GET
requests onto specific handler methods.

 */
    @GetMapping("/getAll")
    public ResponseEntity<?> getFruites(){
        return service.getFruites();
    }
//@PathVariable annotation can be used to handle template variables in the request URI mapping, and set them as method parameters.
    @GetMapping("/getOne/{id}")
    public ResponseEntity<?> getFruita(@PathVariable Integer id){
        return service.getFruita(id);
    }
/*The POST HTTP method is used to create a resource and @PostMapping annotation for mapping HTTP POST requests onto
specific handler methods..

@RequestBody annotation is applicable to handler methods of Spring controllers. This annotation indicates that Spring
should deserialize a request body into an object. This object is passed as a handler method parameter.
    */
    @PostMapping("/add")
    public ResponseEntity<?> addFruita(@RequestBody Fruita fruita){
        return service.addFruita(fruita);
    }
/*he PUT HTTP method is used to update the resource and @PutMapping annotation for mapping HTTP PUT requests onto
specific handler methods.
 */
    @PutMapping("/update")
    public ResponseEntity<?> updateFruita(@RequestBody Fruita fruita){
        return service.updateFruita(fruita);
    }
/*The DELETE HTTP method is used to delete the resource and @DeleteMapping annotation for mapping HTTP DELETE requests
onto specific handler methods.
 */
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> deleteFruita(@PathVariable Integer id){
        return service.deleteFruita(id);
    }

}
