import java.util.List;
import java.util.ArrayList;

public class AddItemTopic implements Topic {

    List<Observer> addItemObservers = new ArrayList<Observer>();

    public void notifyObservers(String line) {
        for (Observer o : addItemObservers) {
            o.update(line);
        }
    }

    public void register(Observer o) {
        addItemObservers.add(o);
    }

}