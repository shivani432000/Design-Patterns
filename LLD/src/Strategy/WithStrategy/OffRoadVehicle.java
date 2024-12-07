import DrivingStrategy.SportsStrategy;

public class OffRoadVehicle extends Vehicle{
    OffRoadVehicle() {
		// injecting Vehicle constructure with driveStrategy
		super(new SportsStrategy());
	  }
}
