package com.ram.SpringJPATutorial;

import com.ram.SpringJPATutorial.entities.ProductEntity;
import com.ram.SpringJPATutorial.repositories.ProductRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;

@SpringBootTest
class SpringJpaTutorialApplicationTests {
	@Autowired
	ProductRepository productRepository;
	@Test
	void contextLoads() {
	}
	@Test
	void testRepo(){
		ProductEntity productEntity= ProductEntity.builder()
				.sku("tetley")
				.title("tetley tea")
				.price(BigDecimal.valueOf(80.99))
				.quantity(12)
				.build();
		ProductEntity savedProductEntity=productRepository.save(productEntity);
		System.out.println(savedProductEntity);
	}
	@Test
	void getRepo(){
		Optional<ProductEntity> products=productRepository.findByTitle("Almonds");
		System.out.println(products);
	}

}