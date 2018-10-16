public class Motorcycle implements Vehicle {

    Motorcycle() {

    }

    @Override
    public void design() {
        System.out.println("Designing motorcycle");
    }

    @Override
    public void manufacture() {
        System.out.println("Manufacturing motorcycle");
    }
}