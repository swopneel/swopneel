package methods;

public class ParametersInMethods {
	public static void loop(int step, int finalValue) {
		// int i = 1;
		while (step <= finalValue) {
			System.out.println(step);
			step++;
		}

	}

	public static void main(String[] args) {
		loop(1, 10);
		System.out.println("************");
		loop(20, 40);
		System.out.println("************");

	}

}
