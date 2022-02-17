package inheritance;

public class Animal {
	
	private float heightInFeet;
	private float weightInKgs;
	private String animalType;
	private String bloodType;
	
	public Animal() {
		this.heightInFeet = 0;
		this.weightInKgs = 0;
		this.animalType = "unknown";
		this.bloodType = "unkknown";
	}
	
	public String ShowInfo() {
		return "Animal [heightInFeet=" + heightInFeet + ", weightInKgs=" + weightInKgs + ", "
				+ "animalType=" + animalType + ", bloodType=" + bloodType + "]";
	}

}
