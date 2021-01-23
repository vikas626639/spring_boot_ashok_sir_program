package com.nit;

import org.springframework.stereotype.Component;

import com.nit.common.Engin;
@Component		//to tell to ioc container this is not a simple class it is spring bean class
public class Car{
	//car in a target class it will use engin class to start jurney
	private Engin eng;
	public Car(Engin eng) {
		System.err.println("Car class constructor");
		this.eng=eng;
	}
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
