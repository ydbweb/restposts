package com.example.restpost.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.restpost.entity.Comment;
import com.example.restpost.entity.Post;
import com.example.restpost.entity.User;

@Repository
public interface CommentRepository extends CrudRepository<Comment, Integer> {
	
	@Query(value = "SELECT c,u FROM Comment c, User u WHERE c.user.id_user=u.id_user AND c.post.id_post= :id_post ")
			List<Comment> listing_comments(@Param("id_post") String id_post);

}
