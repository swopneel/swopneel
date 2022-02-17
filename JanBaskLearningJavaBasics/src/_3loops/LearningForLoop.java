package _3loops;

public class LearningForLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * for (int x = 1; x<11; x++) { System.out.println(x*2); }
		 */
		
		//WAP to print numbers from 1 to 10 except 6(loops  -- variables -- statements
		int i =1;
		
		/*
		 * do { System.out.println(a); a++;
		 * 
		 * } while (a<11) {
		 * 
		 * { System.out.println(a); a++;
		 * 
		 * if (a == 6) continue;
		 * 
		 * } System.out.println(a); a++; }
		 */
		do{    
	        System.out.println(i);    
	        i++;    
	    }while(i<11 || i!=6) ;  
		
		{
			System.out.println(i); 
			i++;
		}
		 
		
/*	     int i;
         for(i=1;i<=10;i++)
         {
                     if(i==5) continue;
                     System.out.print(i +" ");
         */
		  
	}

}
