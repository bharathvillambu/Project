package com.kumar.WishlistApp.Objects;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Wishlist {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String wish;
	
	public Wishlist() {
	}
	
   //	Constructor
	public Wishlist(int id, String wish) {
		super();
		this.id = id;
		this.wish = wish;
	}
	
	//setters n getters
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getWish() {
		return wish;
	}
	public void setWish(String wish) {
		this.wish = wish;
	}
}
