package classes;

public class Car {
	
	private String doors;
	private String engine;
	private String driver;
	private int speed;
	
	
	public Car() {
		doors ="opened";
		engine ="off";
		driver = "absent";
		speed = 0;
	}
	
	
	
	//state/behavior; properties/functionalities
	
	public Car(String doors, String engine, String driver, int speed) {
		//super();//super method call to the constructor of the parent class
		this.doors = doors;
		this.engine = engine;
		this.driver = driver;
		this.speed = speed;
	}



	public String getDoors() {
		return doors;
	}
	public void setDoors(String doors) {
		this.doors = doors;
	}
	public String getEngine() {
		return engine;
	}
	public void setEngine(String engine) {
		this.engine = engine;
	}
	public String getDriver() {
		return driver;
	}
	public void setDriver(String driver) {
		this.driver = driver;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}
	public int getSpeed() {
		return speed;
	}
	
	public String run() {
		if (doors.equals("clsoed") && engine.equals("on") && driver.equals("seated") && speed>0) {
			return "running";
		}else
			return "not running";
	}
}
