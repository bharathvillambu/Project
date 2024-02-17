package com.kumar.WishlistApp.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.kumar.WishlistApp.Objects.Wishlist;
import com.kumar.WishlistApp.Service.WishlistService;

@RestController
public class WishlistController {
	
	@Autowired
	private WishlistService wishlistService;
	
//	http://localhost:8080/wishlists - get request
	@GetMapping(value = "/wishlists")
	public List<Wishlist> getAllWishlists() {
		 return wishlistService.getAllWishlists();
	}
	
//	http://localhost:8080/wishlists - post request
//	payload :
//	{
//		"wish" : "do jogging"
//	}
	@PostMapping(value = "/wishlists")
	public void createWishlists(@RequestBody Wishlist w) {
		  wishlistService.createWishlist(w);
	}
	
//	http://localhost:8080/wishlists/1 - delete request
	
	@DeleteMapping("wishlists/{id}")
    public void deleteWishlist(@PathVariable int id) {
    	wishlistService.deleteWishlistById(id);
    }
	
//	http://localhost:8080/wishlists?id=1
//	@DeleteMapping("/wishlists")
//    public void deleteWishlist(@RequestParam int id) {
//    	System.out.println(id);
//    }

}
