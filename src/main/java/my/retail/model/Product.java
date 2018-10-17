/**
 * Author: Akhauri Prateek Shekhar 
 */
package my.retail.model;

import java.util.Map;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "product")
public class Product {

	@Id
	private Integer id;
	private String name;
	private Map<String,Object> current_price;

	public Product(){}

	public Product(Integer id, String name, Map<String,Object> current_price){
		super();
		this.id = id;
		this.name = name;
		this.current_price = current_price;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Map<String,Object> getCurrent_price() {
		return current_price;
	}

	public void setCurrent_price(Map<String,Object> current_price) {
		this.current_price = current_price;
	}

	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", productDescription=" + ", current_price=" + current_price + "]";
	}
}