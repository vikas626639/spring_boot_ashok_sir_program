package com.nit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Proj01SiInjecctionApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext run = SpringApplication.run(Proj01SiInjecctionApplication.class, args);
				Car bean = run.getBean(Car.class);
				bean.drive();
	}
}
