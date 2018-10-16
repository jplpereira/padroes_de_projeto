public abstract class Pizza {

    public final void preparePizza() {
        selectCrust();
        addIngredients();
        addToppings();
        cook();
    }

    protected abstract void addToppings();
    protected abstract void addIngredients();   
    
    protected void selectCrust() {
        System.out.println("Selected default crust");
    }

    protected void cook() {
        System.out.println("Cooked for 5 minutes");
    }
}