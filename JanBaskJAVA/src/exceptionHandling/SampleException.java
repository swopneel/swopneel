package exceptionHandling;

public class SampleException {

	public static void main(String[] args) {
		try {
			//code that may raise an exception
			int a =20, b=0;
			int c =a/b;
			
			System.out.println("result =" +c);
		}
		catch (ArithmeticException e) {
			//rest of the program
			System.out.println("Can't divide a number by zero!");
		}
		System.out.println("Out of try catch");

	}

}
