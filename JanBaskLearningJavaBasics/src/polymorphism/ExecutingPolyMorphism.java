package polymorphism;

public class ExecutingPolyMorphism {

	public static void main(String[] args) {
		

		PolymorphismWithOverloading po = new PolymorphismWithOverloading();
		po.addition(12, 0);
		po.addition(12.5, 8.5);
		po.addition(12.5, 8);
		po.addition(12, 8, 10);

	}

}
