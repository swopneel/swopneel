package methods;

public class MethodWithParametersAndWithoutReturnType {

	// this is the best practice when the variables can be used by many methods
	String fName;
	String lName;
	public void printFullName()
	{

		String fullName = fName + lName;
		System.out.println("The full name of the person is : " + " " + fullName); 
		
		/*
		 * int num1; int num2; public void addition() { int sum =num1+num2; num1 =4;
		 * num2 = 7; System.out.println("The sum of num1 and num2 is" + sum); } public
		 * void subtraction() { int diff =num1-num2; num1 =4; num2 = 7;
		 * System.out.println("The sum of num1 and num2 is" + diff); } public void
		 * multiplication() { int product =num1*num2; num1 =4; num2 = 7;
		 * System.out.println("The sum of num1 and num2 is" + product); } }
		 */
	}
	
	//WAP to print the fullName of person and company he works with
	
	public void detailsOfEmployee(String companyName) {
		String fullName = fName + lName;
		System.out.println("The name of the person is " + fullName);
		System.out.println("The name of the company is " + companyName);
	}
	
}
	
