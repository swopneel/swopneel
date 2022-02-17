package inheritancewithInterface;

public class Z implements Base{

	@Override
	public void addtion(int a, int b) {
		System.out.println(5*a+2*b);
		
	}

	@Override
	public void subtraction(int a, int b) {
		System.out.println(2*a-6*b);
		
	}

	@Override
	public void multiplication(int a, int b) {
		System.out.println(2.8*a*2*b);
	}

	@Override
	public void division(int a, int b) {
		System.out.println(2.3*a/2*b);
		
	}

}
