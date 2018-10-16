public interface Topic {

    public void register(Observer obs);
    public void notifyObservers(String line);
    
}