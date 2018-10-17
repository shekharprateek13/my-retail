/**
 * Author: Akhauri Prateek Shekhar 
 */
package my.retail.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import my.retail.model.Item;
import my.retail.model.Product;
import my.retail.model.ProductMap;
import my.retail.repository.ProductRepository;

@Service
public class ProductService {

	@Autowired
	ProductRepository repository;
	
	public List<Product> getProductList(Integer[] productIds) {
		List<Product> productList = new ArrayList<Product>();
		
		for(Integer pId:productIds){
			Product product = new Product();
			product.setId(pId);
			try{
				ProductMap productMap = this.getProductDetailsFromExternalAPI(pId);
				Item item = productMap.getProduct().get("item");
				product.setName(item.getProduct_description().get("title").toString());

				Product temp = repository.findById(Integer.parseInt(pId.toString()));
				product.setCurrent_price(temp.getCurrent_price());
			}catch(Exception e){
				e.printStackTrace();
			}
			productList.add(product);
		}
		return productList;
	}
	
	/**
	 * This method fetches data from the External API as well as the MongoDB and combines the result.
	 * @param id: used to fetch data from the External API as well as MongoDB
	 * @return: An instance of Product where Name is fetched from External API and Current Price from MongoDB.
	 */
	public Product getProduct(Integer id) {
		Product product = new Product();
		product.setId(id);

		ProductMap productMap = this.getProductDetailsFromExternalAPI(id);
		Item item = productMap.getProduct().get("item");
		product.setName(item.getProduct_description().get("title").toString());

		Product temp = repository.findById(Integer.parseInt(id.toString()));
		product.setCurrent_price(temp.getCurrent_price());

		return product;
	}
	
	/**
	 * This method updated the price of an existing product in the MongoDB.
	 * @param product: the instance of product which is passed as a Json request.
	 * @return: The Product instance with updated values of Current Price or Null if the Product is not present in the MongoDB.
	 */
	public Product updatePrice(Product product) {
		return repository.updatePrice(product);
	}

	/**
	 * Uses Rest Template to fetch data from External API
	 * @param id: used to fetch data from External API. 
	 * @return: ProductMap -> the class containing all the fields mapped into it from the External API.
	 */
	private ProductMap getProductDetailsFromExternalAPI(Object id) {
		RestTemplate restTemplate = new RestTemplate();
		ProductMap productMap = null;
		UriComponentsBuilder builder = UriComponentsBuilder.fromHttpUrl("https://redsky.target.com/v2/pdp/tcin/"+id)
				.queryParam("excludes", "available_to_promise_network,deep_red_labels,taxonomy,price,promotion,bulk_ship,"
						+ "rating_and_review_reviews,rating_and_review_statistics,question_answer_statistics");
		productMap = restTemplate.getForObject(builder.toUriString(),ProductMap.class);
		return productMap;
	}
}