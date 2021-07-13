package com.antxon;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import com.antxon.controller.MarketController;
import com.antxon.services.PricingService;

@SpringBootTest
public class MarketControllerTest {

	@Autowired
	private MarketController controller;

	@MockBean
	private PricingService pricingService;

	@Test
	public void getMarketPriceTestOk() {
		Mockito.when(pricingService.getPrice(Mockito.anyString())).thenReturn(Mockito.anyLong());
		ResponseEntity<Integer> response = controller.getMarketPrice("anyTestString");
		assertEquals(HttpStatus.OK, response.getStatusCode());
		assertThat(response.getBody()).isInstanceOf(Integer.class);
	}

}
