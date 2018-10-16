public class VehicleFactory {

    public Vehicle getVehicle(String vehicleType) {

        if (vehicleType == null) {
            return null;
        }

        Vehicle vehicle = null;

        switch(vehicleType) {
            case "car":
                vehicle = new Car();
                break;
            case "motorcycle":
                vehicle = new Motorcycle();
                break;
            case "truck":
                vehicle = new Truck();
                break;
        }

        return vehicle;
    }
}