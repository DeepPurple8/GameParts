package com.poc.one.repository;

import org.springframework.data.repository.CrudRepository;

import com.poc.one.model.Hand;

public interface HandRepository extends CrudRepository<Hand, Integer> {

}