package com.mansoorsyed.disasterassistant;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;

import com.mansoorsyed.disasterassistant.controller.auth.AuthenticationRequest;
import com.mansoorsyed.disasterassistant.model.flood.Flood;
import com.mansoorsyed.disasterassistant.model.flood.FloodDao;
import com.mansoorsyed.disasterassistant.model.user.User;
import com.mansoorsyed.disasterassistant.model.user.UserRepository;

import io.jsonwebtoken.io.Decoders;
import net.minidev.json.JSONArray;
import net.minidev.json.JSONObject;
import net.minidev.json.parser.JSONParser;

@SpringBootTest
class DisasterassistantApplicationTests {
	@Autowired
	private FloodDao floodDao;

	@Autowired
	private UserRepository repository;

	@Autowired
    private AuthenticationManager authenticationManager;

	@Test
	void addFloodTest() {
		Flood flood = new Flood();
		flood.setName("Red River");
		flood.setLocation("Manitoba");
		flood.setMagnitude(6);
		floodDao.save(flood);
	}
	
	// @Test
	void getUserTest() {
		// AuthenticationRequest request;
		// String jsonString = "{'email': 'mario@gmail.com', 'password': '1243'}";
		// JSONParser parser = new JSONParser(JSONParser.MODE_JSON_SIMPLE);
		// JSONObject jsonObject = (JSONObject) parser.parse(jsonString);

		User user = this.repository.findByEmail("mario@gmail.com")
			.orElseThrow();
		System.out.println(user);
		authenticationManager.authenticate(   
            new UsernamePasswordAuthenticationToken(
                user.getEmail(),
                "1234"
            )
        );
	}

}
