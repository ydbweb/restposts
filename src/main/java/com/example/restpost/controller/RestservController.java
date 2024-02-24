package com.example.restpost.controller;

import java.text.ParseException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.restpost.service.Importdata;

@RestController
public class RestservController {
	@Autowired Importdata impdata;
	
	@CrossOrigin(origins = "*")
	@GetMapping("/importdatausers")
	public String getCountries() throws ParseException {
		//impdata.importusers();
		//impdata.importposts();
		return "ok";
	}
}
