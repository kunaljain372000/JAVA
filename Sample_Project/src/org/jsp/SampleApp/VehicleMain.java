package org.jsp.SampleApp;

public class VehicleMain {
    public static void main(String[] args) {
    	Vehicle v = new Vehicle();
    	v.start();
		bicycle b = new bicycle();
		b.start(1);
		car c = new car();
		c.stop();
		bus bs = new bus();
		bs.stop();
		
	}
}
