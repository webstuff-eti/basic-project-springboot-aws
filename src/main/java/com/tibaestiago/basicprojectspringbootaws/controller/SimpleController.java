package com.tibaestiago.basicprojectspringbootaws.controller;

import lombok.extern.java.Log;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Log
@RestController
@RequestMapping("/api/test")
public class SimpleController {

    @GetMapping("/product/{name}")
    public ResponseEntity<?> getProductName(@PathVariable String name) {
        log.info("Test SimpleController - name: {}" + name);
        return ResponseEntity.ok("Name: " + name);
    }

    @GetMapping("/product/type")
    public ResponseEntity<?> getTypeProduct() {
        log.info("Test SimpleController - Always electronic!");
        return ResponseEntity.ok("Always electronic!");
    }
}
