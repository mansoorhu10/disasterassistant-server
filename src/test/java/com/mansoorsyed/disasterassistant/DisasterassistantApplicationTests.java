package com.mansoorsyed.disasterassistant;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;
import com.mansoorsyed.disasterassistant.model.flood.Flood;
import com.mansoorsyed.disasterassistant.model.flood.FloodDao;

@SpringBootTest
class DisasterassistantApplicationTests {
	@Test
	void testName() {
		
	}

	@Autowired
	private FloodDao floodDao;

	@Test
	void addFloodTest() {
		Flood flood = new Flood();
		flood.setName("Red River");
		flood.setLocation("Manitoba");
		flood.setMagnitude(6);
		floodDao.save(flood);
	}
	
	// @Test
	void getAllFloodsAndDeleteThem() {
		List<Flood> floods = floodDao.getAllFloods();
		for (Flood flood : floods){
			floodDao.delete(flood.getId());
		}
	}

}
