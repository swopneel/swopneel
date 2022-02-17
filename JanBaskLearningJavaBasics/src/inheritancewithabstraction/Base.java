package inheritancewithabstraction;

public abstract class Base {
	
	public abstract void additon(int a, int b);

	public void subtraction(int a, int b) {
		int diff = a - b;
		System.out.println("difference of numbers " + diff);
	}

	public void multiplication(int a, int b) {
		int product = a * b;
		System.out.println("the product is " + product);
	}

	public void divison(int a, int b) {
		double quotient = a / b;
		System.out.println("the quotient is " + quotient);
	}
	
}

