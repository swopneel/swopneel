package inheritancewithInterface;

public class Y implements Base{

	@Override
	public void addtion(int a, int b) {
		System.out.println(7*a+2*b);
		
	}

	@Override
	public void subtraction(int a, int b) {
		System.out.println(6*a-2*b);
		
	}

	@Override
	public void multiplication(int a, int b) {
		System.out.println(9*a*2*b);
		
	}

	@Override
	public void division(int a, int b) {
		System.out.println(9*a/2*b);
		
	}

}
