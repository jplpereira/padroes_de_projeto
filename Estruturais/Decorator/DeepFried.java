public class DeepFried extends PizzaDecorator {

    public DeepFried(Item inner) {
        super(inner);
    }

    public void prepare() {
        super.prepare();
        System.out.print(" + Deep Fried");
    }
    
}