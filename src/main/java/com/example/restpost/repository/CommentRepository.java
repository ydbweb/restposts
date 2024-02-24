package com.example.restpost.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.restpost.entity.Comment;
import com.example.restpost.entity.User;

@Repository
public interface CommentRepository extends CrudRepository<Comment, Integer> {

}
