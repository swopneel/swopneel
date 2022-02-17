package inheritanceFirst;

public class Vehicles {
	
	private String engine;
	private int wheels;
	private int seats;
	private int fuel;
	private String lights;
	
	public Vehicles() {
		this.engine = "petrol";
		this.wheels = 4;
		this.seats = 4;
		this.fuel =35;
		this.lights ="LED";
	}
	
	public Vehicles(String engine, int wheels, int seats, int fuel, String lights) {
		super();
		this.engine = engine;
		this.wheels = wheels;
		this.seats = seats;
		this.fuel = fuel;
		this.lights = lights;
	}

	public String getEngine() {
		return engine;
	}

	public int getWheels() {
		return wheels;
	}

	public int getSeats() {
		return seats;
	}

	public int getFuel() {
		return fuel;
	}

	public String getLights() {
		return lights;
	}
	
	public void run() {
		System.out.println("Running Vehicle");
	}
}
