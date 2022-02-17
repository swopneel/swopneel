package methodswithreturns;

public class MethodsWithParametersAndWithReturnType {

	public void addition1(int a, int b) {

		int sum = a + b;
		System.out.println(sum);

	}

	public int addition2(int a, int b) {

		int sum = a + b;
		System.out.println("additon 2 result is " + sum);
		return a;
		

	}
	//WAp to add Medma to whatever your name is 
	
	public String printName(String fName, String lName) {
		String fullName = fName+lName;
		String aliasL = " Medma";
		System.out.println("Full name of the employee :" + fullName);
		System.out.println("desired name is :" +fName + aliasL);
		return aliasL;
		
	}
	
	//WAP to add $1000 bonus to the salary assignment
	

}
