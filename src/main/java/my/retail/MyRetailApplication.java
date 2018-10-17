/**
 * Author: Akhauri Prateek Shekhar 
 */
package my.retail;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

import my.retail.repository.ProductRepository;

@SpringBootApplication
@EnableMongoRepositories(basePackageClasses = ProductRepository.class)
public class MyRetailApplication {

	public static void main(String[] args) {
		SpringApplication.run(MyRetailApplication.class, args);
	}
}
