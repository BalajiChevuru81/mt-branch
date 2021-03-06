package com.example.demo.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;


import com.example.demo.dao.IposRepository;

import com.example.demo.pojos.IposPlanned;

@CrossOrigin(origins="http://localhost:4200")
@RestController
@RequestMapping("/getAllIpoaPlanned")
public class IposController {
	@Autowired
	 private IposRepository iposRepository;
	 @RequestMapping

	 public Iterable<IposPlanned> getAllIpos(){

	 return iposRepository.findAll();

	 }
	 @PostMapping("/saveIposPlanned")

	 public IposPlanned saveIpos(@RequestBody IposPlanned iposplanned)

	 {

	  System.out.println(iposplanned);

	  iposRepository.save(iposplanned);

	  return iposplanned;
	  	 }
	 	 
	 @PutMapping("/updateIpos/{id1}")

	 public IposPlanned updateIpos(@RequestBody IposPlanned iposplanned,@PathVariable("id1") Integer id1 ) {

		 iposplanned.setId1(id1);
	  System.out.println(iposplanned);

	  iposRepository.save(iposplanned);
	 
	  return iposplanned;
	  	 }
	 
	 
 @DeleteMapping("/deleteIposPlanned/{id1}")
	 
		 public Boolean deleteIposr(@PathVariable("id1") Integer id1) {
			 System.out.println(id1);
			 Optional<IposPlanned> iposplanned = iposRepository.findById(id1);
			 iposRepository.delete(iposplanned.get());
			 return true;
		 }
 @GetMapping("/findOneAll2/{id1}")
 public IposPlanned findoneinall(@PathVariable("id1") Integer id1)

	{

		Optional<IposPlanned> iposplanned = iposRepository.findById(id1);

		return iposplanned.get();

	}
 
	 	
}
