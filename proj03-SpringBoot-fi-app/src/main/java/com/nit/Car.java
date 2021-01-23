package com.nit;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.nit.common.Engin;
@Component		//to tell to ioc container this is not a simple class it is spring bean class
public class Car{
	//car in a target class it will use engin class to start jurney
	@Autowired						
	private Engin eng;				
	//business method
	public void drive() {
		//use eng
		int status = eng.start();
		if(status==0)
			System.out.println("Jurney started");
		else
			System.out.println("Engin failed to start");
	}
}
/*
 * when we specyfi the autowired at filed level then ioc container inject
 * dependent bean class at target bean by using reflection api which break the
 * oop principle so better to use constructor injection if having one filed other wise use setter injection
 */


