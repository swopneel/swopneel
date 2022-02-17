package inheritancewithInterface;

public class ExecutingInterface {

	public static void main(String[] args) {
		
		P p = new P();
		p.addtion(12, 8);
		p.subtraction(12, 8);
		p.multiplication(12, 8);
		p.division(12, 8);
		System.out.println("============");
		
		X x = new X();
		x.addtion(12, 8);
		x.subtraction(12, 8);
		x.multiplication(12, 8);
		x.division(12, 8);
		System.out.println("===============");
		
		Y y = new Y();
		y.addtion(12, 8);
		y.subtraction(12, 8);
		y.multiplication(12, 8);
		y.division(12, 8);
		System.out.println("===============");
		
		Z z = new Z();
		z.addtion(12, 8);
		z.subtraction(12, 8);
		z.multiplication(12, 8);
		z.division(12, 8);
		
		

	}

}
