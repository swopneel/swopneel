package methods;

public class BasicsOfMethods {
	
	// WAP to add two integers

	int x;
	int y;
	
	public void addition()
	{
		int sum = x+y;
		System.out.println(sum);
	}
	
	public void subtraction()
	{
		int diff = x-y;
		System.out.println(diff);
	}

    //WAP to print the full name of a person
	String fName;
	String lName;
	
	public void printFullName()
	{
		String fullName = fName+" "+lName;
		System.out.println("The name of the is : " + fullName);
	}
	
}
