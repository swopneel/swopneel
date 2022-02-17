package inheritancewithInterface;

public class P implements Base{

	@Override
	public void addtion(int a, int b) {
		System.out.println(2*a+2*b);
		
	}

	@Override
	public void subtraction(int a, int b) {
		System.out.println(2*a-2*b);
		
	}

	@Override
	public void multiplication(int a, int b) {
		System.out.println(2*a*2*b);
		
	}

	@Override
	public void division(int a, int b) {
		System.out.println(3*a/2*b);
		
	}

}
