import java.util.List;
import java.util.ArrayList;

public class CompleteOrderTopic implements Topic {

    List<Observer> orderCompletedObservers = new ArrayList<Observer>();

    public void notifyObservers(String line) {
        for (Observer o : orderCompletedObservers) {
            o.update(line);
        }
    }

    public void register(Observer o) {
        orderCompletedObservers.add(o);
    }

}