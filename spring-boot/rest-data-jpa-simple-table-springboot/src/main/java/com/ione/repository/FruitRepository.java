package com.ione.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ione.entity.Fruit;

public interface FruitRepository extends JpaRepository<Fruit, Long> {

}
