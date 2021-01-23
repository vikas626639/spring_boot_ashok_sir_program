package com.nit;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.nit.common.Engin;
@Component		//to tell to ioc container this is not a simple class it is spring bean class
public class Car{
	//car in a target class it will use engin class to start jurney
	public Car() {
		System.err.println("Car class constructor");
	}
	
	private Engin eng;
	
	@Autowired	//to tell to ioc container inject dependent bean for this target class
	public void setEng(Engin eng) {
		this.eng = eng;
	}
	
	//business method
	public void drive() {
		int status=0;
		if(status==0) {
			eng.start();
			System.out.println("Car started for jurnery");
		}
	}
}
