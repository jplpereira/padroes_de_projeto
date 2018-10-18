public class DoubleCheese extends PizzaDecorator {

    public DoubleCheese(Item inner) {
        super(inner);
    }

    public void prepare() {
        super.prepare();
        System.out.print(" + Double Cheese");
    }
    
}