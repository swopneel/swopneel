package _2statements;

public class LearningStatements {

	public static void main(String[] args) {
		
		//WAP to check if the names are same or not- Jason and Kari
		
		String hisName = "Jason";
		String herName = "Kari";
		hisName = herName;
		
		if (hisName == herName)
		{
			System.out.println("The names match");	
		}
		else
		{
			System.out.println("The names don't match");
		}
		System.out.println(hisName);
		
		// WAP to check the larger number -- If statement
		
		/*
		 * int x = 5; int y = 8;
		 * 
		 * if(x>y) { System.out.println("true"); } else { System.out.println(false);//
		 * is it false being boolean " not required? }
		 */
	}

}
