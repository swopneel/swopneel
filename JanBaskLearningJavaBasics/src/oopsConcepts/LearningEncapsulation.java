package oopsConcepts;

public class LearningEncapsulation {

	//Encapsulation is defined as the wrapping up of data under a single unit. It is the mechanism that binds together 
	//code and the data it manipulates. Another way to think about encapsulation is, 
	//it is a protective shield that prevents the data from being accessed by the code outside this shield.
	//It is the mechanism of wrapping of variables(data) and methods together as a single unit (class)
	//In Encapsulation, the variables of a class will be hidden from other classes and can be accessed only 
	//through the methods of their current classes 

	private int x;
	//private boolean check;
	private String name;

	public void setX(int x) {
		this.x = x;

	}
	public int getX() {
		System.out.println("The value of x is " + x);
		return x;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		System.out.println("The name of the ogre is " + name);
		return name;
	}
	
	/*
	 * public void setTruth(boolean check);{ this.check =check; } public boolean
	 * getTruth() {
	 * 
	 * }
	 */
}


