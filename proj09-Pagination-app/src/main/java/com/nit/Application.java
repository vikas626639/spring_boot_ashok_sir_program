package com.nit;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

import com.nit.Repository.EmployeeRepo;
import com.nit.entity.emp;
@SpringBootApplication
public class Application {
	public static void main(String[] args) {
		ConfigurableApplicationContext run = SpringApplication.run(Application.class, args);
		EmployeeRepo bean = run.getBean(EmployeeRepo.class);
		PageRequest p=PageRequest.of(1, 3);
		Page<emp> entity = bean.findAll(p);
		entity.forEach(System.out::println);
	}
}
