package com.example.restpost.entity;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;

import java.util.Date;

import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class User {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id_user;
	
	private String name_user;
	
	@Temporal(TemporalType.DATE)	  
	private Date date;

	public User(long id_user, String name_user, Date date) {
		super();
		this.id_user = id_user;
		this.name_user = name_user;
		this.date = date;
	}
	
	public User() {
	}

	public long getId_user() {
		return id_user;
	}

	public void setId_user(long id_user) {
		this.id_user = id_user;
	}

	public String getName_user() {
		return name_user;
	}

	public void setName_user(String name_user) {
		this.name_user = name_user;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	@Override
	public String toString() {
		return "Users [id_user=" + id_user + ", name_user=" + name_user + ", date=" + date + "]";
	}
}
