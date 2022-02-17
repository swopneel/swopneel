package methods;

public class MethodWihoutParameternAndReturnType {

	 
/*		public void printFullName(String fName, String lName)
		{
		String fullName = fName + lName;
			System.out.println("The full name of the person is :" + " " + fullName); 
	*/
		
	int num1; int num2; 

	public void addition() {
		int sum =num1+num2; 
		num1 = 4;
		num2 = 7; 
		System.out.println("The sum of num1 and num2 is" + sum);
	} 

	public void subtraction() 
	{ 
		int diff =num1-num2; 
		num1 =4; 
		num2 = 7;
		System.out.println("The sum of num1 and num2 is" + diff);
	}

	public void multiplication() 
	{ 
		int product =num1*num2; 
		num1 =4; 
		num2 = 7;
		System.out.println("The sum of num1 and num2 is" + product); 
	} 

}