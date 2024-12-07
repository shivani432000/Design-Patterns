import DrivingStrategy.DriveStrategy;

public class Vehicle {
	
	private DriveStrategy driveStrategy;
	
	// constructor injection
	public Vehicle(DriveStrategy driveStrategy) {
		this.driveStrategy = driveStrategy;
	}
	
	public void driveIt() {
		// drive method will be called based on driveStrategy
		driveStrategy.drive();
	}
}

