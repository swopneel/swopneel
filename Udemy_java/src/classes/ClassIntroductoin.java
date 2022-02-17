package classes;

public class ClassIntroductoin {
	
	public static void main (String args[]) {
		//Class is nothing but blueprint or template of object
		Car c = new Car("closed", "on", "seated", 10);
		
		/*
		 * c.setDoors("clsoed"); c.setDriver("seated"); c.setEngine("on");
		 * c.setSpeed(10);
		 */
		System.out.println(c.run());
		
	}

}
