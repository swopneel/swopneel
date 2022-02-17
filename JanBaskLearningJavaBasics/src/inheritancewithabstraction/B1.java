package inheritancewithabstraction;

public class B1 extends Base {

	@Override
	public void additon(int a, int b) {
		int sum = 2*a + 2*b;
		System.out.println("additon in class B1 is " + sum);
		System.out.println("===================================");
		
	}

}
