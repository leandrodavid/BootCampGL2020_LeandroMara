package com.globallogic.bootcampgl.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.globallogic.bootcampgl.dto.ProductDTO;
import com.globallogic.bootcampgl.service.ProductService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
/**
 * Product Service Controller
 */
@RestController
public class ProductServiceController {

	@Autowired
	ProductService productService;
	
	@RequestMapping(value = "/products")
	public ResponseEntity<Object> getProduct() {

	return new ResponseEntity<>(productService.getProducts(), HttpStatus.OK);
	}
	
	@RequestMapping(value = "/products", method=RequestMethod.POST)
	public ResponseEntity<Object> createProduct(@RequestBody ProductDTO productDTO) {
		productService.createProducto(productDTO);
		return new ResponseEntity<>( HttpStatus.CREATED);
	}
	
	@RequestMapping(value = "/products/{id}", method=RequestMethod.PUT)
	public ResponseEntity<Object> updateProduct(@PathVariable("id") String
			id , @RequestBody ProductDTO productDTO) {
		productService.updateProducto(id, productDTO);
		return new ResponseEntity<>("Product is updated successfully", HttpStatus.OK);
	}
	@RequestMapping(value = "/products/{id}", method=RequestMethod.DELETE)
	public ResponseEntity<Object> deleteProduct(@PathVariable("id") String id) {
		productService.deleteProducto(id);
		return new ResponseEntity<>("Product is deleted successfully", HttpStatus.OK);
	}
}
