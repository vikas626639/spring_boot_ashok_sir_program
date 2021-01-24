package com.nit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.nit.Repointerface.ContectMaster;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext run = SpringApplication.run(Application.class, args);
		ContectMaster bean = run.getBean(ContectMaster.class);	//contect master is a interface internally implementation class object got created by proxy object
		long count = bean.count();
		System.out.println(count);
	}
}

/*if(bean.existsById(1)) {
	bean.deleteById(1);
	System.out.println("record deleted");
}else {
	System.out.println("Record not found to delete");
}*/
/*//save operation
		//create entity class object 
		  Contect_master entity=new Contect_master();
		  entity.setContect_name("vikash");
		   entity.setContect_number(9630550198L);
		  bean.save(entity); 
		  System.out.println("Record saved");*/


//getting all the record from the db table using findAll method
/*	Iterable<Contect_master> entity = bean.findAll();
	entity.forEach(System.out::println);
 */

//find more record 
/*		Iterable<Contect_master> entities = bean.findAllById(List.of(1, 7));
		entities.forEach(System.out::println);
 */

//get record from db by id
/*Optional<Contect_master> opt = bean.findById(7);	
if(opt.isPresent()) {
	Contect_master cm = opt.get();
	System.err.println(cm);
}else {
	System.err.println("Record not available");
}
 */

