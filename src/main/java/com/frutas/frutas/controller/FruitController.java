package com.frutas.frutas.controller;

import com.frutas.frutas.model.Fruits;
import com.frutas.frutas.service.FruitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/fruits")
public class FruitController {

    @Autowired
    private FruitService fruitService;

    // Obtener todas las frutas
    @GetMapping
    public ResponseEntity<List<Fruits>> getAllFruits() {
        return new ResponseEntity<>(fruitService.getAllFruits(), HttpStatus.OK);
    }

    // Obtener una fruta por ID
    @GetMapping("/{id}")
    public ResponseEntity<Fruits> getFruitById(@PathVariable Integer id) {
        return new ResponseEntity<>(fruitService.getFruitById(id), HttpStatus.OK);
    }

    // Crear una nueva fruta
    @PostMapping("/save")
    public ResponseEntity<Fruits> createFruit(@RequestBody Fruits fruit) {
        return new ResponseEntity<>(fruitService.createFruit(fruit), HttpStatus.CREATED);
    }

    // Actualizar una fruta por ID
    @PutMapping("/{id}")
    public ResponseEntity<Fruits> updateFruit(@PathVariable Integer id, @RequestBody Fruits fruitDetails) {
        return new ResponseEntity<>(fruitService.updateFruit(id, fruitDetails), HttpStatus.OK);
    }

    // Eliminar una fruta por ID
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteFruit(@PathVariable Integer id) {
        fruitService.deleteFruit(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}

