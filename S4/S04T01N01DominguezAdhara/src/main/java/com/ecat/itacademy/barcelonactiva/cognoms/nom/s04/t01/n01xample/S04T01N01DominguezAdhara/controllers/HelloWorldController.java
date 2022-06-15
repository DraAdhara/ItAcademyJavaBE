package com.ecat.itacademy.barcelonactiva.cognoms.nom.s04.t01.n01xample.S04T01N01DominguezAdhara.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
//@RestController annotation is used at the class level and allows the class to handle the requests made by the client.
@RestController
public class HelloWorldController {
/*The @GetMapping annotated methods in the @Controller annotated classes handle the HTTP GET requests matched with given
 URI expression.
    */
    @GetMapping("/HelloWorld")
    public String saluda(@RequestParam(value = "nom", defaultValue = "UNKNOW") String nom) {
        return "Hola, " + nom + ". Estàs executant un projecte Maven.";
    }

    @GetMapping(value = {"/HelloWorld2", "/HelloWorld2/{nom}"})
    public String saluda2(@PathVariable(required = false) String nom) {
        return "Hola, " + nom + ". Estàs executan un projecte Maven.";
    }

}
