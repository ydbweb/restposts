package com.example.restpost.entity;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;

import java.util.Date;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import jakarta.persistence.Column;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.Lob;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Post {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id_post;
	
	@Lob 
	@Column( length=1500)
    private String txt;
    
    @ManyToOne
    @JoinColumn(name="user_id")
    private User user;
    
	@JsonIgnore
    @OneToMany
    @JoinColumn(name="post_id")
    private List<Comment> comments;    
    
    @Column(name="datetime")
    @Temporal(TemporalType.TIMESTAMP)
    private java.util.Date dateCreated;
    
    

	public Post() {
		super();
	}



	public Post(long id_post, String txt, User user, List<Comment> comments, Date dateCreated) {
		super();
		this.id_post = id_post;
		this.txt = txt;
		this.user = user;
		this.comments = comments;
		this.dateCreated = dateCreated;
	}



	public long getId_post() {
		return id_post;
	}



	public void setId_post(long id_post) {
		this.id_post = id_post;
	}



	public String getTxt() {
		return txt;
	}



	public void setTxt(String txt) {
		this.txt = txt;
	}



	public User getUser() {
		return user;
	}



	public void setUser(User user) {
		this.user = user;
	}



	public List<Comment> getComments() {
		return comments;
	}



	public void setComments(List<Comment> comments) {
		this.comments = comments;
	}



	public java.util.Date getDateCreated() {
		return dateCreated;
	}



	public void setDateCreated(java.util.Date dateCreated) {
		this.dateCreated = dateCreated;
	}
	
	





	

}
