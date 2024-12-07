import DrivingStrategy.SportsStrategy;

public class SportsVehicle extends Vehicle {
  // constructor
  public SportsVehicle(){
    // injecting into constructor of Vehicle
    super(new SportsStrategy());
  }
}