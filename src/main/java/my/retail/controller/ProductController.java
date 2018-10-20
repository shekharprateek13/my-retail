/**
 * Author: Akhauri Prateek Shekhar 
 */
package my.retail.controller;

import java.util.Arrays;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import my.retail.model.Product;
import my.retail.service.ProductService;

@RestController
@RequestMapping("/products")
public class ProductController {
	
	private static final Logger logger = LoggerFactory.getLogger(ProductController.class);
	
	@Autowired
	ProductService productService;
	
	@GetMapping(value="/ids",produces={MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE})
	public List<Product> getProductList(@RequestParam("ids") Integer[] ids){
		logger.info("Recieved Get Request for Ids: "+Arrays.asList(ids));
		return productService.getProductList(ids);
	}
	
	
	/**
	 * The GET API end point http://localhost:port/products/id
	 * @param id: used to fetch data from the External API as well as MongoDB
	 * @return: An instance of Product where Name is fetched from External API and Current Price from MongoDB.
	 */
	@RequestMapping(value = "/{id}", method = RequestMethod.GET, 
			produces={MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE})
	public Product getProduct(@PathVariable("id") Integer id){
		logger.info("Recieved Get Request for Id: "+id);
		return productService.getProduct(id);
	}
	
	/**
	 * The PUT API end point http://localhost:port/products/id
	 * @param product: the instance of product which is passed as a Json request.
	 * @return: The Product instance with updated values of Current Price or Null if the Product is not present in the MongoDB.
	 */
	@RequestMapping(value = "/{id}", method = RequestMethod.PUT, consumes = MediaType.APPLICATION_JSON_VALUE)
	public Product updateProductPrice(@RequestBody Product product){
		logger.info("Recieved Put Request for Product: "+product);
		Product newProduct = productService.updatePrice(product);
		logger.info("New Product: "+newProduct);
		return newProduct;
	}
}