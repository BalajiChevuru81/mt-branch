package com.example.demo.dao;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.pojos.User;

	public interface UserRepository extends CrudRepository <User, String> {

		User findByUsernameAndPassword(String username, String password);

	}

