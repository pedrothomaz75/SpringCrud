package com.example.crud.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController // Diz que a class ProductController é um controller da APIRest no padrão MVC
@RequestMapping("/product") // Especifica a URL que um método do controlador irá manipular
public class ProductController {
    @GetMapping // Diz pro Spring esse método embaixo, ele é responsável por chamar os gets de /product
    // ResponseEntity = É uma class que retorna um response de um request
    public ResponseEntity getAllProducts(){
        return ResponseEntity.ok("Response realizado com sucesso!");
    }
}
