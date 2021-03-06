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

import com.example.demo.dao.CompanyRepository;
import com.example.demo.pojos.Company;



@CrossOrigin(origins="http://localhost:4200")
@RestController
@RequestMapping("/getAllCompany")

public class CompanyController {

	@Autowired
	 private CompanyRepository companyRepository;

	 @RequestMapping("/getAllCompanies")

	 public Iterable<Company> getAllCompanies(){

	 return companyRepository.findAll();

	 }
	 @PostMapping("/saveCompany")

	 public Company saveCompany(@RequestBody Company company)

	 {

	  System.out.println(company);

	  companyRepository.save(company);

	  return company;
	  	 }
	 	 
	 @PutMapping("/updateCompany/{companyName}")

	 public Company updateCompany(@RequestBody Company company,@PathVariable("companyName") String companyName) {

		 company.setCompanyName(companyName);
	  System.out.println(company);

	  companyRepository.save(company);
	 
	  return company;
	  	 }
	 
	 
	 @DeleteMapping ("/deleteCompany/{companyName}")
	 
		 public Boolean deleteCompany(@PathVariable("companyName") String companyName) {
			 System.out.println(companyName);
			 Optional<Company> company = companyRepository.findById(companyName);
			 companyRepository.deleteById(companyName);
			 return true;
		 }
	 @GetMapping("/findOneAll2/{companyName}")
	 public Company findoneinall(@PathVariable("companyName") String companyName)

		{

			Optional<Company> company = companyRepository.findById(companyName);

			return company.get();

		}
	 

}
