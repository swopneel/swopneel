package polymorphism;

public class PolymorphismWithOverloading {
	
	public void addition(int a, int b) {
		int sum = a + b;
		System.out.println("The sum is " + sum);

	}

	public void addition(double d, double e) {
		double sum = d + e;
		System.out.println( "The additon of double numbers is " + sum);
		//System.out.println();

	}
	
	public void addition(double d, int e) {
		double sum = d + e;
		System.out.println( "The additon of double integer numbers is " + sum);
		
	}
		
	public void addition(int d, double e) {
		double sum = d + e;
		System.out.println( "The additon of double integer numbers is " + sum);
		
	}
	
	public void addition(int d, int e, int f) {
		double sum = d + e + f;
		System.out.println( "The additon of three integer numbers is " + sum);
	}

}
