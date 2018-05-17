/**
 * 
 */
package controller;


import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import dao.ProductDAO;
import dao.ProductRepo;
import entity.Product;

/**
 * @author Yash
 *
 */

@RestController
@RequestMapping(value = "/product", produces = "application/json")
public class ProductController {
	
	public ProductRepo repository;
	
	@RequestMapping("/")
	public ApiResponse homepage() {
		return new ApiResponse("success", "200 OK");
	}
	
	@RequestMapping(value = "/products/{id}", method = RequestMethod.GET)
	public ApiResponse findProduct(@PathVariable int id) {
		//String uri = req.getRequestURI().toString();
		//String[] uri_split = uri.split(":");
		//int product_id = Integer.parseInt(uri_split[1]);		
		
		if(ProductDAO.getProduct(id) == null)
			return new ApiResponse("failure", "404 Not Found");
		else
			return new ApiResponse("success", "200 OK");
	}
	
	@RequestMapping(method = RequestMethod.POST, consumes = "application/json")
	public ApiResponse createProduct(@RequestBody Product product) {
		if(ProductDAO.addProduct(product) == null)
			return new ApiResponse("failure", "400 Bad Request");
		else
			return new ApiResponse(product.getId());
	}	
	
	@RequestMapping(value = "/products/{id}", method = RequestMethod.DELETE)
	public ApiResponse removeProduct(@PathVariable int id) {
		
		if(ProductDAO.deleteProduct(id))
			return new ApiResponse("success", "200 OK");
		else
			return new ApiResponse("failure", "404 Not Found");
		
		//original.setName(updated.getName());
		//original.setDescription(updated.getDescription());
		//original.setBuy_price(updated.getBuy_price());
		//original.setSell_price(updated.getSell_price());
		//original.setQuantity(updated.getQuantity());
	}
	
	@RequestMapping(value = "/products/{id}", method = RequestMethod.PUT, consumes = "application/json")
	public ApiResponse updateNewProduct(@PathVariable int id, @RequestBody Product new_product) {
		
		Product old_product = ProductDAO.getProduct(id);
		
		if(ProductDAO.updateProduct(old_product, new_product) == null)
			return new ApiResponse("failure", "400 Bad Request");
		else
			return new ApiResponse("success", "200 OK");
	}
	
	

}
