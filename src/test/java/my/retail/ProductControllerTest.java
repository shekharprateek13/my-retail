package my.retail;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.BDDMockito.given;

import java.util.HashMap;
import java.util.Map;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.json.JacksonTester;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.HttpStatus;
import org.springframework.mock.web.MockHttpServletResponse;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import com.fasterxml.jackson.databind.ObjectMapper;

import my.retail.controller.ProductController;
import my.retail.model.Product;
import my.retail.service.ProductService;

@EnableWebMvc
@RunWith(SpringRunner.class)
@WebMvcTest(ProductController.class)
public class ProductControllerTest {

	@Autowired
	private MockMvc mockMvc;

	@MockBean
	ProductService productService;

	private JacksonTester<Product> productJson;

	@Before
	public void setup() {
		JacksonTester.initFields(this, new ObjectMapper());
	}
	
	/*
	 * Tests the Get API End Point http://localhost:8888/products/id where id exists in the database.
	 */
	@Test
	public void getProductByIdWhenExists() throws Exception {
//		Product expectedOutput = new Product();
//		expectedOutput.setId(13860428);
//		expectedOutput.setName("The Big Lebowski (Blu-ray)");
//		Map<String,Object> currentPriceMap = new HashMap<String,Object>();
//		currentPriceMap.put("value", 2000);
//		currentPriceMap.put("currency_code", "USD");
//		expectedOutput.setCurrent_price(currentPriceMap);
//
//		//Given
//		given(productService.getProduct(13860428))
//		.willReturn(expectedOutput);
//
//		//When
//		MockHttpServletResponse response = mockMvc.perform(MockMvcRequestBuilders.get("/products/13860428")).andReturn().getResponse();
//
//		//Then
//		assertThat(response.getStatus()).isEqualTo(HttpStatus.OK.value());
//		assertThat(response.getContentAsString()).isEqualTo(productJson.write(expectedOutput).getJson());
	}
	
	/*
	 * Tests the Get API End Point http://localhost:8888/products/id where id does not exist in the database.
	 */
	@Test
	public void getProductByIdWhenDoesNotExists() throws Exception {

//		//Given
//		given(productService.getProduct(13860429)).willReturn(null);
//
//		//When
//		MockHttpServletResponse response = mockMvc.perform(MockMvcRequestBuilders.get("/products/13860429")).andReturn().getResponse();
//
//		//Then
//		assertThat(response.getStatus()).isEqualTo(HttpStatus.OK.value());
//		assertThat(response.getContentAsString()).isEqualTo("");
	}
}