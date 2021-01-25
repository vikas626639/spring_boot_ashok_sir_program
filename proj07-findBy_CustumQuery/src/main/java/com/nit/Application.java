package com.nit;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.nit.Repository.EmployeeRepo;
import com.nit.entity.emp;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext run = SpringApplication.run(Application.class, args);
		EmployeeRepo bean = run.getBean(EmployeeRepo.class);
		//Iterable<emp> entity = bean.findAll();
		List<String> entity = bean.findENAMEByJOB("JAMES");
		System.out.println("Query="+"select ENAME,JOB from emp where ENAME=:ename");
		if(entity!=null) {
		entity.forEach(System.err::println);
		}else {
			System.out.println("Record not found");
		}
	}
}
