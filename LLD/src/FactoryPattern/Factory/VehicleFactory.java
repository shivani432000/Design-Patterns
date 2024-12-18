package FactoryPattern.Factory;

public class VehicleFactory {

    public Vehicle getVehicle(String vehicleType)
    {
        if(vehicleType==null) return null;

        if (vehicleType.equals("CAR")) {
            return new Car();
        } else if (vehicleType.equals("BIKE")) {
            return new Bike();
        } else if (vehicleType.equals("TRUCK")) {
            return new Truck();
        }

        return null;

    }

}
