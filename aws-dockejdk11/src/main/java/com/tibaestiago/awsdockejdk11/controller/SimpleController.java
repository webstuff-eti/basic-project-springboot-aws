package com.tibaestiago.awsdockejdk11.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api/test")
public class SimpleController {

    private final Logger LOG = LoggerFactory.getLogger(SimpleController.class);

    @GetMapping("/prod/{name}")
    public ResponseEntity<?> produtoTeste(@PathVariable String name){
        LOG.info("SimpleController - name: {}", name);

        return ResponseEntity.ok("Name: " + name);
    }

}
