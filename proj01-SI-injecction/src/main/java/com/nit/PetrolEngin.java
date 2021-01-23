package com.nit;

import org.springframework.stereotype.Component;

import com.nit.common.Engin;
@Component
public class PetrolEngin implements Engin{
	public PetrolEngin() {
		System.err.println("Calling petrol engin");
	}
	@Override
	public int start() {
		System.out.println("PetrolEngin.start()");
		System.out.println("Petrol Engin Started");
		return 0;
	}

}
