package com.example.restpost.entity;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;

import java.util.Date;

import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import jakarta.persistence.Column;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.Lob;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Comment {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id_comment;
	
    @Lob
    @Column( length=1500)
    private String txt;
    
    @ManyToOne
    @JoinColumn(name="post_id")
    private Post post;
    
    @ManyToOne
    @JoinColumn(name="user_id")
    private User user;
    
    @Column(name="datetime")
    @Temporal(TemporalType.TIMESTAMP)
    private java.util.Date dateCreated;
    
    

	public Comment() {
		super();
	}



	public Comment(long id_comment, String txt, Post post, User user, Date dateCreated) {
		super();
		this.id_comment = id_comment;
		this.txt = txt;
		this.post = post;
		this.user = user;
		this.dateCreated = dateCreated;
	}



	public long getId_comment() {
		return id_comment;
	}



	public void setId_comment(long id_comment) {
		this.id_comment = id_comment;
	}



	public String getTxt() {
		return txt;
	}



	public void setTxt(String txt) {
		this.txt = txt;
	}



	public Post getPost() {
		return post;
	}



	public void setPost(Post post) {
		this.post = post;
	}



	public User getUser() {
		return user;
	}



	public void setUser(User user) {
		this.user = user;
	}



	public java.util.Date getDateCreated() {
		return dateCreated;
	}



	public void setDateCreated(java.util.Date dateCreated) {
		this.dateCreated = dateCreated;
	}



}
