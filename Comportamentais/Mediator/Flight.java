public class Flight {

    private AtcMediator atc;
    private String flightNum;
    private Runway runway;
    private Gate gate;

    public Flight(AtcMediator atc, String flightNum) {
        this.atc = atc;
        this.flightNum = flightNum;
    }

    public String getFlightNum() {
        return flightNum;
    }

    public Runway getRunway() {
        return runway;
    }

    public Gate getGate() {
        return gate;
    }

    public void allocateGate(Gate gate) {
        this.gate = gate;
    }

    public void allocateRunway(Runway runway) {
        this.runway = runway;
    }

    public void landAndTakeOff() throws InterruptedException {
        System.out.println(flightNum + " is requesting landing permission");

        while (atc.getLandingPermission(this) == false) {
            Thread.sleep(1000);
        }

        land();

        while (atc.getTakeoffPermission(this) == false) {
            Thread.sleep(1000);
        }
        
        takeOff();
    }

    public void land() {
        atc.enterRunway(runway);
        System.out.println(this.flightNum + " is landing in Gate " + gate.getGateNum());

        new java.util.Timer().schedule(new java.util.TimerTask() {
            @Override
            public void run() {
                atc.exitRunway(runway);
                atc.enterGate(gate);
            }
        }, 1000);
    }

    public void takeOff(){
        new java.util.Timer().schedule(new java.util.TimerTask() {
            @Override
            public void run() {
                System.out.println(flightNum + " is taking off");
                atc.exitGate(gate);
                atc.enterRunway(runway);

                new java.util.Timer().schedule(new java.util.TimerTask() {
                    @Override
                    public void run() {
                        atc.exitRunway(runway);
                    }
                }, 1000);
            }
        }, 5000);

    }
}