package com.example.javaCrud.resource;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("cliente")
public class ClienteResource {
    //@Operation(summary = "Find all countries with pagination")
    @GetMapping
    public ResponseEntity<String> list() {
        return ResponseEntity.ok("Olá, pessoa!");
    }
}
