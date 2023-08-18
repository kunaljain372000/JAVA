package org.jsp.SampleApp;

public class car extends Vehicle {
	
	@Override
	public void start() {
		System.out.println("Car is started");	
	}
	@Override
	public void stop() {
		System.out.println("Car is stopped");
	}
}
