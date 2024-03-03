package Exercise03;

public interface Subject {
    void registerObserver(Observer observer);
    void removeObserver(Observer observer);
    void setStatus(String status);
    String getStatus();
    void notifyObservers();
}
