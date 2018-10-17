/**
 * Author: Akhauri Prateek Shekhar 
 */
package my.retail.model;

import java.util.Map;

public class ProductMap {

	private Map<String,Item> product;
	
	public ProductMap() {}

	public ProductMap(Map<String, Item> product) {
		super();
		this.product = product;
	}

	public Map<String,Item> getProduct() {
		return product;
	}

	public void setProduct(Map<String, Item> product) {
		this.product = product;
	}
}
