public class PointControl {

    public void registerEntry(Employee employee){
        System.out.println(employee.getName() + " entrou!");
    }

    public void registerExit(Employee employee){
        System.out.println(employee.getName() + " saiu!");
    }
    
}