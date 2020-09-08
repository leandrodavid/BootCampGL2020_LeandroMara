package com.globallogic.bootcampgl.service.impl;

import com.globallogic.bootcampgl.dto.ProductDTO;
import com.globallogic.bootcampgl.service.ProductService;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/**
 * Product Service Implementation
 */
@Service
public class ProductServiceImpl implements ProductService {
	
	@Override 
	public Collection<ProductDTO> getProducts() {
		return productRepo.values();
	}
	@Override
	public void createProducto(ProductDTO product) {
		productRepo.put(product.getId(), product);
	}
	@Override
	public void updateProducto(String id, ProductDTO product) {
		productRepo.remove(id);
		productRepo.put(product.getId(), product);
	}
	
	public  void deleteProducto(String id) {
		productRepo.remove(id);
	}
    private static Map<String, ProductDTO> productRepo = new HashMap<>();
    static {
        ProductDTO honey = new ProductDTO();
        honey.setId("1");
        honey.setName("Honey");
        productRepo.put(honey.getId(), honey);

        ProductDTO almond = new ProductDTO();
        almond.setId("2");
        almond.setName("Almond");
        productRepo.put(almond.getId(), almond);
    }

}
