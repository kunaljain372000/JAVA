package org.jsp.SampleApp;

public class bus extends Vehicle{
	
	@Override
	public void start() {
		System.out.println("Bus is started");
	}
	@Override
	public void stop() {
		System.out.println("Bus is stopped");
	}
}
