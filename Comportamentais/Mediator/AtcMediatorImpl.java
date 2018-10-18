import java.util.List;
import java.util.ArrayList;

public class AtcMediatorImpl implements AtcMediator {

    private Runway runway;
    private List<Gate> gates;

    public AtcMediatorImpl() {
        gates = new ArrayList<Gate>();
    }

    public void registerRunway(Runway runway) {
        this.runway = runway;
    }

    public void registerGate(Gate gate) {
        gates.add(gate);
    }
    public boolean getLandingPermission(Flight flight) {
        if (runway.isInUse() == false) {
            for (Gate gate : gates) {
                if (gate.isInUse() == false) {
                    flight.allocateRunway(runway);
                    flight.allocateGate(gate);
                    return true;
                }
            }
            System.out.println("[ATC Mediator All gates in use]");
        } else {
            System.out.println("[ATC Mediator] Runway in use");
        }
        return false;
    }

    public boolean getTakeoffPermission(Flight flight) {
        return runway.isInUse() == false;
    }

    public void enterRunway(Runway runway) {
        runway.setInUse(true);
    }

    public void exitRunway(Runway runway) {
        runway.setInUse(false);
    }

    public void enterGate(Gate gate) {
        gate.setInUse(true);
    }

    public void exitGate(Gate gate) {
        gate.setInUse(false);
    }
}