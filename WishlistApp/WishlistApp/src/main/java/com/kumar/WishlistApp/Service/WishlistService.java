package com.kumar.WishlistApp.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kumar.WishlistApp.DAO.WishlistDAO;
import com.kumar.WishlistApp.Objects.Wishlist;

@Service
public class WishlistService {
	
	@Autowired
	private WishlistDAO dao;
	
	
	public List<Wishlist> getAllWishlists() {
		return dao.findAll();
	}
	
	public void createWishlist(Wishlist w) {
			dao.save(w);
	}
	
	public void deleteWishlistById(int id) {
		    dao.deleteById(id);
	}

}
