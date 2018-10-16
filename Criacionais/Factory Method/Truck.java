public class Truck implements Vehicle {

    Truck() {

    }

    @Override
    public void design() {
        System.out.println("Designing truck");
    }

    @Override
    public void manufacture() {
        System.out.println("Manufacturing truck");
    }
}