package com.frutas.frutas.service;

import com.frutas.frutas.exception.FruitNotFoundException;
import com.frutas.frutas.model.Fruits;
import com.frutas.frutas.repository.FruitRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FruitService {

    @Autowired
    private FruitRepository fruitRepository;

    public List<Fruits> getAllFruits() {
        return fruitRepository.findAll();
    }

    public Fruits getFruitById(Integer id) {
        return fruitRepository.findById(id)
                .orElseThrow(() -> new FruitNotFoundException("Fruta no encontrada"));
    }

    public Fruits createFruit(Fruits fruit) {
        return fruitRepository.save(fruit);
    }

    public Fruits updateFruit(Integer id, Fruits fruitDetails) {
        Fruits fruit = getFruitById(id);
        fruit.setNombre(fruitDetails.getNombre());
        return fruitRepository.save(fruit);
    }

    public void deleteFruit(Integer id) {
        Fruits fruit = getFruitById(id);
        fruitRepository.delete(fruit);
    }
}
