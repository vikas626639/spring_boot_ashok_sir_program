package com.nit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.nit.Repointerface.ContectMaster;
import com.nit.bean.ContectmasterEntity;


@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext run = SpringApplication.run(Application.class, args);
		ContectMaster bean = run.getBean(ContectMaster.class);
		//ContectmasterEntity entity = bean.findByContectNumber(8871662081l);
		ContectmasterEntity entity = bean.findByContectName("vikas");
		//long count = bean.count();
		System.out.println(entity);
	}
}
