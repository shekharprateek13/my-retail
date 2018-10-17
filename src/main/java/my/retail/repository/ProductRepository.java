/**
 * Author: Akhauri Prateek Shekhar 
 */
package my.retail.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.FindAndModifyOptions;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.stereotype.Repository;

import my.retail.model.Product;

@Repository
public class ProductRepository{
	private final MongoTemplate mongoTemplate;

	@Autowired
	public ProductRepository(MongoTemplate mongoTemplate) {
		this.mongoTemplate = mongoTemplate;
	}
	
	/**
	 * This method fetched a document from the MongoDB.
	 * @param id: used to query by id.
	 * @return: The Product instance fetched as from the MongoDb or Null if no such document is present. 
	 */
	public Product findById(Object id) {
		Query query = new Query();
		query.addCriteria(Criteria.where("_id").is(id));
		Product product = mongoTemplate.findOne(query, Product.class);
		return product;
	}
	
	
	/**
	 * This method updates the price of a product document in the MongoDB
	 * @param product: the instance of product which is passed as a Json request. 
	 * @return: The Product instance with updated values of Current Price or Null if the Product is not present in the MongoDB.
	 */
	public Product updatePrice(Product product) {
		Query query = new Query();
		query.addCriteria(Criteria.where("_id").is(product.getId()));
		
		Update update = new Update();
		update.set("current_price",product.getCurrent_price());
		
		Product modifiedProduct = mongoTemplate.findAndModify(query, update, new FindAndModifyOptions().returnNew(true), Product.class);
		
		if(modifiedProduct == null) {
			throw new NullPointerException();
		}
		
		return modifiedProduct;
	}
}