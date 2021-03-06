package com.example.demo.dao;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.pojos.SectorDataFields;


public interface SectorsDataFieldRepository extends CrudRepository<SectorDataFields, Integer> {

	Iterable<SectorDataFields> findAll();
}
