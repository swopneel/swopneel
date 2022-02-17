package oopsConcepts;

public class ExecutingOops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * LearningEncapsulation le = new LearningEncapsulation(); le.setX(12);
		 * le.setName("Satrughan"); //le.setTruth(false); System.out.println(le.getX());
		 * System.out.println(le.getName());
		 */
		EncapsulationRealTimeExamples ee = new EncapsulationRealTimeExamples();
		ee.setName("Suniti");
		ee.setAllowance(1200);
		ee.setBasicSalary(5000);
		
		System.out.println("Pay the employee " + ee.getName() + " a basic salary of $" + ee.getBasicSalary() + " plus an allowance of $" + ee.getAllowance() + " and the gross salary of $" + ee.calcSalary() );
	}

}
