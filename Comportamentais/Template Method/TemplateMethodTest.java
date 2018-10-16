public class TemplateMethodTest {

    public static void main(String[] args) {
        System.out.println("Preparing first pizza!");
        Pizza pizza1 = new CheesePizza();
        pizza1.preparePizza();
        
        System.out.println("\nPreparing second pizza!");
        Pizza pizza2 = new MeatPizza();
        pizza2.preparePizza();

    }
}