package com.globallogic.bootcampgl;

import org.springframework.stereotype.Component;

@Component
public class Order {

	private String product = "C-00221";
	private Long count = 234567890L;
	private Long customer = 12342L;
	
	
	public Order() {
	}
	
	public Order(String product, Long count, Long customer) {
		this.product = product;
		this.count = count;
		this.customer = customer;
	}

	public String getProduct() {
		return product;
	}
	public void setProduct(String product) {
		this.product = product;
	}
	public Long getCount() {
		return count;
	}
	public void setCount(Long count) {
		this.count = count;
	}
	public Long getCustomer() {
		return customer;
	}
	public void setCustomer(Long customer) {
		this.customer = customer;
	}
	
	
	
	@Override
	public String toString() {
		return "\n    product:" + product + "\n    count:" + count + "\n    customer:" + customer;
	}
}
