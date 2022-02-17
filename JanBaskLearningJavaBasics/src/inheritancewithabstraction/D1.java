package inheritancewithabstraction;

public class D1  extends Base{

	@Override
	public void additon(int a, int b) {
		int sum = 4*a + 4*b;
		System.out.println("additon in class D1 is " + sum);
		System.out.println("===================================");
	}

}
