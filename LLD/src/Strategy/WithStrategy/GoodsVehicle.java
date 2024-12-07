import DrivingStrategy.GoodsStrategy;

public class GoodsVehicle extends Vehicle{
    // constructor
  GoodsVehicle() {
    // injecting into constructor of Vehicle
    super(new GoodsStrategy());
  }
}
