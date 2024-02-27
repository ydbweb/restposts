package com.example.restpost.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.restpost.entity.Post;
import com.example.restpost.entity.User;

@Repository
public interface PostRepository extends CrudRepository<Post, Integer> {
	@Query(value = "SELECT p,u FROM Post p, User u WHERE p.id_post=u.id_user")
	List<Post> getPosts();

}
