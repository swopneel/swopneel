package inheritanceFirst;

public class Bike extends Vehicles {
	private String handle;

	public Bike() {
		super();
		this.handle = "short";

	}

	public Bike(String handle, String engine, int wheels, int seats, int fuel, String lights) {
		super(engine, wheels, seats, fuel, lights);
		this.handle = handle;
	}

	public String getHandle() {
		return handle;
	}

	@Override
	public String toString() {
		return "Bike [getHandle()=" + getHandle() + ", getEngine()=" + getEngine() + ", getWheels()=" + getWheels()
				+ ", getSeats()=" + getSeats() + ", getFuel()=" + getFuel() + ", getLights()=" + getLights() + "]";
	}

	public void run() {
		System.out.println("Running Bike");
		System.out.println(toString());
	}
}
