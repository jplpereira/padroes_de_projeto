public class ObserverTest {

    public static void main(String[] args) {
        
        Order order = new Order();
        order.addItem(new Item("Pizza", 6.99));
        order.addItem(new Item("Wine", 9.99));

        order.makePayment(new Payment("CASH", 10));
        order.makePayment(new Payment("CREDIT", 6.98));

        order.completeOrder();
    }
}