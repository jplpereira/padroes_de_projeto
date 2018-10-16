public class StrategyTest {

    public static void main (String[] args) {

        Order order = new Order();
        order.addItem(new Item("Italian Pizza", 6.99));
        order.addItem(new Item("Wine", 9.99));

        order.makePayment(new CashPayment(10));
        order.makePayment(new CardPayment("CREDIT", "VISA", 6.98));
    }
}