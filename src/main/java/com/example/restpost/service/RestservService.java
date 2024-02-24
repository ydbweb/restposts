package com.example.restpost.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.restpost.repository.CommentRepository;
import com.example.restpost.repository.PostRepository;
import com.example.restpost.repository.UserRepository;

@Service
public class RestservService {
	@Autowired
	UserRepository usp;
	
	@Autowired
	PostRepository postp;
	
	@Autowired
	CommentRepository commentp;	
}
