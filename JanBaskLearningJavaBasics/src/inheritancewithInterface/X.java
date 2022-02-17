package inheritancewithInterface;

public class X  implements Base{

	@Override
	public void addtion(int a, int b) {
		System.out.println(a+b);
		
	}

	@Override
	public void subtraction(int a, int b) {
		System.out.println(a-b);
		
	}

	@Override
	public void multiplication(int a, int b) {
		System.out.println(a*b);
	}

	@Override
	public void division(int a, int b) {
		System.out.println(a/b);
		
	}

}
