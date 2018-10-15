public class PointControlAdapter extends PointControl {

    private NewPointControl newPointControl = new NewPointControl();

    public void registerEntry(Employee employee){
        this.newPointControl.register(employee, true);
    }

    public void registerExit(Employee employee){
        this.newPointControl.register(employee, false);
    }
}