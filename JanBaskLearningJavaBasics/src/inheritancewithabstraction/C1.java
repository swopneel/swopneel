package inheritancewithabstraction;

public class C1 extends Base{

	@Override
	public void additon(int a, int b) {
		int sum = 3*a + 3*b;
		System.out.println("additon in class C1 is " + sum);
		System.out.println("===================================");
		
	}

}
