package com.kumar.WishlistApp.DAO;

import org.springframework.data.jpa.repository.JpaRepository;
import com.kumar.WishlistApp.Objects.Wishlist;

public interface WishlistDAO extends JpaRepository<Wishlist, Integer> {
	
	
}
