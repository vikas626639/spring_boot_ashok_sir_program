package com.nit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.nit.Repointerface.ContectMaster;
import com.nit.bean.Contect_master;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext run = SpringApplication.run(Application.class, args);
		ContectMaster bean = run.getBean(ContectMaster.class);	//contect master is a interface internally implementation class object got created by proxy object
		
		//create entity class object
		Contect_master entity=new Contect_master();
		entity.setContect_name("vikas");
		entity.setContect_number(8871662081l);
		bean.save(entity);
		System.out.println("Record saved");
	}

}
