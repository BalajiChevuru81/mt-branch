package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dao.SectorsDataFieldRepository;
import com.example.demo.pojos.SectorDataFields;


@RestController

public class SectorDataFieldsController {

	@Autowired
	
	 private SectorsDataFieldRepository sectorDataFieldRespository;

	 @RequestMapping("/getAllUsers")

	 public Iterable<SectorDataFields> getAllUsers(){

	 return sectorDataFieldRespository.findAll();

	 }
	 @PostMapping("/saveuser")

	 public SectorDataFields sectorDataField(@RequestBody SectorDataFields sectorDataField)

	 {

	  System.out.println(sectorDataField);

	  sectorDataFieldRespository.save(sectorDataField);

	  return sectorDataField;
	  	 }
	
	 @PutMapping("/updateuser/{id2}")

	 public SectorDataFields updateUser(@RequestBody SectorDataFields sectorDataField,@PathVariable("id2") Integer id2) {

		 sectorDataField.setId(id2);
		 
	  System.out.println(id2);

	  sectorDataFieldRespository.save(id2);
	 
	  return sectorDataField;
	  	 }
	
}
