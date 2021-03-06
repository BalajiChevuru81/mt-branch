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


import com.example.demo.dao.StockExchangeDataFieldRepository;
import com.example.demo.pojos.StockExchangeDataField;

@CrossOrigin(origins="http://localhost:4200")
@RestController
@RequestMapping("/getAllStockExchangeDataField")

public class StockExchangeDataFieldController {

	@Autowired
	
	 private StockExchangeDataFieldRepository stockExchangeDataFieldRepository;

	 @RequestMapping("/getAllStockExchangeDataField")

	 public Iterable<StockExchangeDataField> getAllStockExchangeDataField(){

	 return stockExchangeDataFieldRepository.findAll();

	 }
	 @PostMapping("/saveStockExchangeDataField")

	 public StockExchangeDataField stockExchangeDataField(@RequestBody StockExchangeDataField stockExchangeDataField)

	 {

	  System.out.println(stockExchangeDataField);

	  stockExchangeDataFieldRepository.save(stockExchangeDataField);

	  return stockExchangeDataField;
	  	 }
	 	 
	 @PutMapping("/updateStockExchangeDataField/{id3}")

	 public StockExchangeDataField updateStockExchangeDataField(@RequestBody StockExchangeDataField stockExchangeDataField,@PathVariable("id3") Integer id3) {

		 stockExchangeDataField.setId(id3);
	  System.out.println(id3);

	  stockExchangeDataFieldRepository.save(stockExchangeDataField);
	 
	  return stockExchangeDataField;
	  	 }
	
	 
	 @DeleteMapping("/deleteStockExchangeDataField/{id3}")
		public Boolean deleteStockExchangeDataField(@PathVariable("id3") Integer id3) {
			System.out.println(id3);
			Optional<StockExchangeDataField> stockExchangeDataField = stockExchangeDataFieldRepository.findById(id3);
			stockExchangeDataFieldRepository.delete(stockExchangeDataField.get());
			return true;
		}
		@GetMapping("/findOneInAll4/{id3}")
		public StockExchangeDataField findoneinall(@PathVariable("id3") Integer id3) {
			Optional<StockExchangeDataField> stockExchangeDataField = stockExchangeDataFieldRepository.findById(id3);
			return stockExchangeDataField.get();
		}
}
