public interface AtcMediator {

    public void registerRunway(Runway runway);
    public void registerGate(Gate gate);
    public boolean getLandingPermission(Flight flight);
    public boolean getTakeoffPermission(Flight flight);
    public void enterRunway(Runway runway);
    public void exitRunway(Runway runway);
    public void enterGate(Gate gate);
    public void exitGate(Gate gate);
    
}