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

import com.example.demo.dao.IposRepository;
import com.example.demo.pojos.IposPlanned;


@RestController

public class IposController {

	@Autowired
	 private IposRepository iposRepository;

	 @RequestMapping("/getAllUsers")

	 public Iterable<IposPlanned> getAllUsers(){

	 return iposRepository.findAll();

	 }
	 @PostMapping("/saveuser")

	 public IposPlanned iposPlanned(@RequestBody IposPlanned iposPlanned)

	 {

	  System.out.println(iposPlanned);

	  iposRepository.save(iposPlanned);

	  return iposPlanned;
	  	 }
	 	 
	 @PutMapping("/updateuser/{id1}")

	 public IposPlanned updateUser(@RequestBody IposPlanned iposPlanned,@PathVariable("id1") Integer id1) {

		 iposPlanned.setId1(id1);
	  System.out.println(id1);

	  iposRepository.save(id1);
	 
	  return iposPlanned;
	  	 }
	
	
	
}
