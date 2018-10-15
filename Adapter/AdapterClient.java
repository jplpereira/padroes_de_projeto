public class AdapterClient {
    public static void main(String[] args) {
        PointControl pointControl = new PointControlAdapter(); 
        Employee employee = new Employee("João Pedro");
        pointControl.registerEntry(employee);
        System.out.println("Em trabalho!");
        pointControl.registerExit(employee);
    }
}