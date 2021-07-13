package com.antxon;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.List;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import com.antxon.controller.UnicornController;
import com.antxon.model.Unicorn;

@SpringBootTest
public class UnicornControllerTest {

	@Autowired
	private UnicornController controller;

	@Test
	public void getOffersTestOk() {
		ResponseEntity<List<Unicorn>> response = controller.getOffers();
		assertEquals(HttpStatus.OK, response.getStatusCode());
		assertThat(response.getBody()).isInstanceOf(List.class);
		assertThat(response.getBody().get(0)).isInstanceOf(Unicorn.class);
	}

}
