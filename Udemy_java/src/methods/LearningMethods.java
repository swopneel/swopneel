package methods;

public class LearningMethods {

	public static void main(String[] args) {
		
		//int i = 1;
		//int j = 20;
		loop();
		System.out.println("==========");
		loop2();
		
		/*
		 * while (i <=10) { System.out.println(i); i++; }
		 */
		System.out.println("==========");
		/*
		 * while (j<=40) { System.out.println(j); j++; }
		 */

	}
public static void loop() {
	int i = 1;
	while (i <=10)
	{
		System.out.println(i);
		i++;
	}
}
public static void loop2() {
	int j = 20;
	while (j <=40)
	{
		System.out.println(j);
		j++;
	}
}
}
