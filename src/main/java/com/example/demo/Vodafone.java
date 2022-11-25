package com.example.demo;
public class Vodafone implements Sim {
	

	@Override
	public void calling() {
		System.out.println("calling using Vodafone");
		
	}

	@Override
	public void data() {
		System.out.println("Using 5g internet using Vodafone");
		
	}

}
