package _2statements;

public class LearningMultipleIfElseIfStatement {

	public static void main(String[] args) {
		// multiple if else if are used when we must make multiple decisions
		// WAP that depending upon the age of the child, decides what class should a child go
		//depending upon day of the week, plan your to dos'
		
		int age = 10;
		if (age<2)
		{
			System.out.println("the child goes to no school");
		}
		else if (age <5)
		{
			System.out.println("the child goes to primary school");
		}
		else if (age<10)
		{
			System.out.println("the child goes to middle school"); 
		}
		else
		{
			System.out.println("the child goes to high school");
		}
	}

}
