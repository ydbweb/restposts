package com.example.restpost.service;

import java.text.ParseException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.restpost.entity.Comment;
import com.example.restpost.entity.Post;
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
	
	public List<Post> getList() throws ParseException {
		
		return postp.getPosts();

	}
	
	public List<Comment> listing_comments(Integer id_post){
		return commentp.listing_comments(id_post.toString());
		
	}
}
