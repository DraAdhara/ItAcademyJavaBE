package controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @GetMapping("/HelloWorld")
    public String saluda(@RequestParam(value = "nom", defaultValue = "UNKNOW") String nom) {
        return "Hola" + nom + ". Estàs executant un projecte Maven.";
    }

    @GetMapping(value = {"/HelloWorld2", "/HelloWolrd2/{nom}"})
    public String saluda2(@PathVariable(required = false) String nom) {
        return "Hola " + nom + ". Estàs executan un projecte Maven";
    }

}
