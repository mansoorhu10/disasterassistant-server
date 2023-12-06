package com.mansoorsyed.disasterassistant;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;

import com.mansoorsyed.disasterassistant.model.flood.Flood;
import com.mansoorsyed.disasterassistant.model.flood.FloodDao;

@SpringBootTest
class DisasterassistantApplicationTests {
	@Test
	void testName() {
		
	}

	@Autowired
	private FloodDao floodDao;

	@Autowired
	private UserDetailsService userDetailsService;

	@Test
	void addFloodTest() {
		Flood flood = new Flood();
		flood.setName("Red River");
		flood.setLocation("Manitoba");
		flood.setMagnitude(6);
		floodDao.save(flood);
	}
	
	@Test
	void getUserTest() {
		UserDetails userDetails = this.userDetailsService.loadUserByUsername("mario@gmail.com");
		System.out.println("Got user details");
	}

}
