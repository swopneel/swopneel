package oopsConcepts;

public class EncapsulationRealTimeExamples {

	private String name;
	private int basicSalary;
	private int allowance;

	public int calcSalary() {
		int grossSalary = basicSalary + allowance;
		return grossSalary;
	}

	public void setName(String name) {
		if (name.equals("kerrie")) {
			System.out.println("not an employee of the company");
		} else {
			this.name = name;
		}

	}

	public String getName() {
		return name;
	}

	public int getBasicSalary() {
		return basicSalary;
	}

	public void setBasicSalary(int basicSalary) {
		if (basicSalary < 1000 || basicSalary > 10000) {
			System.out.println("Pls check the salary again");
		} else {
			this.basicSalary = basicSalary;
		}
	}

	public int getAllowance() {
		return allowance;
	}

	public void setAllowance(int allowance) {
		this.allowance = allowance;
	}

}
