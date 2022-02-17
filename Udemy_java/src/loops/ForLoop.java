package loops;

public class ForLoop {

	public static void main(String[] args) {
		
		// WAP to print prime numbers 
		
		int x;
		int y =2;
		
		for (x =1; x <20; x++)
		{
			if (x%y ==0) {
				y++;
			}else
			
			System.out.println(x);
			x++;
		}
		

	}

}
