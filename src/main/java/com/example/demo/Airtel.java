package com.example.demo;
public class Airtel implements Sim {
	

	@Override
	public void calling() {
		System.out.println("calling using Airtel");
		
	}

	@Override
	public void data() {
		System.out.println("Using 5g internet using Jio Airtel");
		
	}

}
