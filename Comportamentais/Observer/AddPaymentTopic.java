import java.util.List;
import java.util.ArrayList;

public class AddPaymentTopic implements Topic {

    List<Observer> addPaymentObservers = new ArrayList<Observer>();

    public void notifyObservers(String line) {
        for (Observer o : addPaymentObservers) {
            o.update(line);
        }
    }

    public void register(Observer o) {
        addPaymentObservers.add(o);
    }

}