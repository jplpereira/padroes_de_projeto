public class FactoryMethodTest {

    public static void main (String[] args) {

        VehicleFactory factory = new VehicleFactory();

        Vehicle vehicle = factory.getVehicle("car");
        vehicle.design();
        vehicle.manufacture();

    }
}