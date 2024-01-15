package com.ione.spjpaex;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import com.ione.spjpaex.entity.Fruits;
import com.ione.spjpaex.service.FruitsService;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Component
//@Order(value = 1)
public class AppInitializer implements CommandLineRunner{
	@Autowired
	private FruitsService fruitsService;

	@Override
	public void run(String... args) throws Exception {
		log.info("App Initalizer started.............................................................................");
		
		log.info("fruits count: " + fruitsService.getAllFruits().size());
		
		
		for(int i=1; i<=50000;i++) {
			
		 fruitsService.saveFruit(new Fruits("fruit"+i,"color"+i));	
		 
		 if(i % 10000 == 0)
		 log.info("i:"+ i);
			
		}
		
		log.info("fruits count: " + fruitsService.getAllFruits().size());
//		log.info();
		
	}

}
