package methods;

public class ExecutingMethods {

	public static void main(String[] args) {
		
		
		/*
		 * MethodWithParametersAndWithoutReturnType obj1 = new
		 * MethodWithParametersAndWithoutReturnType();
		 * obj1.printFullName("Anusha","      Gautam");
		 */
		
		
		/*
		 * BasicsOfMethods abc = new BasicsOfMethods(); abc.x =10; abc.y =12;
		 * abc.addition(); abc.subtraction();
		 */
		
		// ClassName newObj = new ClassName;
		/*
		 * BasicsOfMethods name = new BasicsOfMethods(); name.fName = "Satrughan";
		 * name.lName = "Gautam"; name.printFullName();
		 */
		
		MethodWithParametersAndWithoutReturnType empDetails = new MethodWithParametersAndWithoutReturnType();
		empDetails.fName = "Amita";
		empDetails.lName = " Shrestha Gautam";
		empDetails.printFullName();
		empDetails.detailsOfEmployee("Parker Hospital");
		
		
	}
	

}
