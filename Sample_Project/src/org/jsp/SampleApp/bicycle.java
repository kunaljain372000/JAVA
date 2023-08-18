package org.jsp.SampleApp;

public class bicycle extends Vehicle{
	
	 @Override
		public void start() {
			System.out.println("bicycle is started");
		}
    @Override
	public void start(int a) {
		System.out.println("bicycle is again started");
	}
    
	@Override
	public void stop() {
		System.out.println("bicycle is stopped");
		
	}
	
	
}
