package com.nit;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.data.domain.Sort;

import com.nit.Repository.EmployeeRepo;
import com.nit.entity.emp;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext run = SpringApplication.run(Application.class, args);
		EmployeeRepo bean = run.getBean(EmployeeRepo.class);
		List<emp> entity = bean.findAll(Sort.by("ENAME").descending());
		entity.forEach(System.out::println);
	}
}
