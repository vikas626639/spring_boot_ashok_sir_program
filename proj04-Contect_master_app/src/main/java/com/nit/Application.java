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
		Contect_master entity=new Contect_master();
		  entity.setContect_name("vikash");
		   entity.setContect_number(9630550198L);
		  bean.save(entity); 
		  System.out.println("Record saved");
	}
}
