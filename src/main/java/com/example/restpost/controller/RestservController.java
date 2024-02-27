package com.example.restpost.controller;

import java.text.ParseException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.restpost.entity.Comment;
import com.example.restpost.entity.Post;
import com.example.restpost.service.Importdata;
import com.example.restpost.service.RestservService;

@RestController
public class RestservController {
	/*
	@Autowired Importdata impdata;
	
	@CrossOrigin(origins = "*")
	@GetMapping("/importdatausers")
	public String getCountries() throws ParseException {
		impdata.importusers();
		impdata.importposts();
		return "ok";
	}
	
	*/
	
	@Autowired RestservService restservService;
	
	@CrossOrigin(origins = "*")
	@GetMapping("/listing")
	public List<Post> getList() throws ParseException {
		
		return restservService.getList();

	}
	
	@CrossOrigin(origins = "*")
	@GetMapping("/listing_comments")
	public List<Comment> listing_comments(@RequestParam Integer id_post) throws ParseException {
		
		return restservService.listing_comments(id_post);

	}
	
	
}
