package _3loops;

public class LearningWhileLoop {

	public static void main(String[] args) {
		// program to print numbers 1 to 10
		/*
		 * int x; x = 10;
		 * 
		 * System.out.println(x);
		 * 
		 * x++; //x + 1, x++ increments the value of x by 1, ++ is increment operator
		 * 
		 * System.out.println(x);
		 * 
		 * x--; // x - 1
		 * 
		 * System.out.println(x);
		 */

		
		/*
		 * int x = 1; while(x<11) { System.out.println(x); x++; }
		 */
		
		/*
		 * int y = 10; while(y>0) { System.out.println(y); y--; }
		 */
		
		//WAP to print time table of 2
		/*
		 * int x =1;
		 * 
		 * 
		 * while(x<11) { System.out.println(2*x); x++;
		 * 
		 * }
		 */
		// WAP to print 1 to 10 excluding 6
		int i = 1;
		while (i<11)
		{
			if (i==6)
			{
				i++;
			}
			
			else
			{
				System.out.println(i);
				i++;
			
			}
		}
		
	}

}
