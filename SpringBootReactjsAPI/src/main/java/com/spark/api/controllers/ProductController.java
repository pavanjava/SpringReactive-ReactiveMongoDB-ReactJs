package com.spark.api.controllers;

import com.spark.api.pojo.Product;
import com.spark.api.repos.ReactiveProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping(value = "/api/v1")
public class ProductController {

    @Autowired
    ReactiveProductRepository reactiveProductRepository;

    @PostMapping(value = "/product",consumes = MediaType.APPLICATION_JSON_VALUE,produces = MediaType.APPLICATION_JSON_VALUE)
    public Mono<Product> saveProduct(@RequestBody Product product){
        Mono<Product> mono = null;
        try {
            mono = reactiveProductRepository.save(product);
        }catch (Exception e){
            e.printStackTrace();
        }
        return mono;
    }

    @CrossOrigin(origins = "http://localhost:3000")
    @GetMapping(value = "/product",produces = MediaType.APPLICATION_JSON_VALUE)
    public Flux<Product> getAllProducts(){
        Flux<Product> flux = null;
        try {
            flux = reactiveProductRepository.findAll();
        }catch (Exception e){
            e.printStackTrace();
        }
        return flux;
    }

}
