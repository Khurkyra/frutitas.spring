package com.frutas.frutas.repository;

import com.frutas.frutas.model.Fruits;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FruitRepository extends JpaRepository<Fruits, Integer> {
}

