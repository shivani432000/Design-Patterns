import DrivingStrategy.NormalStrategy;

public class PassengerVehicle extends Vehicle {
   // constructor
   PassengerVehicle() {
     // injecting into constructor of Vehicle
     super(new NormalStrategy());
   }
 }
