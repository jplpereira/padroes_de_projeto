public class NewPointControl{

    public void register(Employee employee, boolean isEntry){

        if (isEntry == true){
            System.out.println(employee.getName() + " entrou!!!");
        } else {
            System.out.println(employee.getName() + " saiu!!!");
        }
    }
}