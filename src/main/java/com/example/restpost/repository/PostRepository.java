package com.example.restpost.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.restpost.entity.Post;
import com.example.restpost.entity.User;

@Repository
public interface PostRepository extends CrudRepository<Post, Integer> {

}
