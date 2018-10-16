public class Car implements Vehicle {

    Car() {

    }

    @Override
    public void design() {
        System.out.println("Designing car");
    }

    @Override
    public void manufacture() {
        System.out.println("Manufacturing car");
    }
}