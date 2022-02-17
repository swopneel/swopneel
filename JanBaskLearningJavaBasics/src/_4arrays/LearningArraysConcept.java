package _4arrays;

public class LearningArraysConcept {

	public static void main(String[] args) {
		
		
		
		// lets say we have 32,34,45,76,8,54,99,75,35, nine value, we can store these values using 9 variables
		// How to create arrays, there are two ways as well like variables
			// two ways of creating an Array
		// 1- DataType variableName = value; -- was how we created variable - first way
		//1- DataType arrayName [] = { value1, value2 , ...., valueN}
		//or DataType[] arrayName  = { value1, value2 , ...., valueN}
		// value1 = arrayName[0], value2 = arrrayName[1], .... valueN = arrayName[N-1]
		
		//2- DataType [] nameOfArray = new DataType[countOfItems] 
		
		int[] numbers = {32,34,45,76,8,54,99,75,35};
		String[] names = {"Satrughan", "Swopneel", "Swornim", "Amita", "Anusha"};
		
		System.out.println(names.length); // to print the size of the array, i.e; how many values do the array holds; arrayName.length
		System.out.println(numbers.length);
		// to print all the values in an array
		//System.out.println(names); --did not work, so we need to use the loop
		
		int i = 0;
		while(i<numbers.length)
		{
			System.out.println(numbers[i]);
			i++;
		}
		
		/*
		 * System.out.println(numbers[3]); System.out.println(names[1]);
		 */
	}

}
