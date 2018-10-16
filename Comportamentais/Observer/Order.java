import java.util.ArrayList;
import java.util.List;

public class Order {

    List cart = new ArrayList();
    List payments = new ArrayList();

    private Topic addItemTopic;
    private Topic addPaymentTopic;
    private Topic completeOrderTopic;

    public Order() {

        Observer cashierDisplay = new CashierDisplay();
        Observer customerDisplay = new CustomerDisplay();
        
        addItemTopic = new AddItemTopic();
        addPaymentTopic = new AddPaymentTopic();
        completeOrderTopic = new CompleteOrderTopic();

        addItemTopic.register(cashierDisplay);
        addPaymentTopic.register(cashierDisplay);
        completeOrderTopic.register(cashierDisplay);

        addItemTopic.register(customerDisplay);
        addPaymentTopic.register(customerDisplay);
        completeOrderTopic.register(customerDisplay);

    }

    public void addItem(Item item) {
        cart.add(item);
        String line = item.name + " $" + item.price;
        addItemTopic.notifyObservers(line);
    }

    public void makePayment(Payment payment) {
        payments.add(payment);
        String line = payment.type + " $" + payment.amount;
        addPaymentTopic.notifyObservers(line);
    }

    public void completeOrder() {
        String line = "Order Completed";
        completeOrderTopic.notifyObservers(line);
    }

}