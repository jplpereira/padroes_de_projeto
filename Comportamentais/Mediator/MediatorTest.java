public class MediatorTest {

    public static void main (String[] args) throws InterruptedException {

        AtcMediator atcMediator = new AtcMediatorImpl();

        atcMediator.registerRunway(new Runway("RW1", false));

        atcMediator.registerGate(new Gate("GT1", false));
        atcMediator.registerGate(new Gate("GT2", false));
        atcMediator.registerGate(new Gate("GT3", false));

        for (int i=10; i<20; i++) {
            Flight flight = new Flight(atcMediator, "F00"+ i);
            flight.landAndTakeOff();
        }

    }
}