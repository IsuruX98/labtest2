package Exercise03;

import java.util.ArrayList;
import java.util.List;

public class SubjectImpl implements Subject{
    private List<Observer> observers = new ArrayList<>();
    private String status;

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void setStatus(String status) {
        this.status = status;
        notifyObservers();
    }

    @Override
    public String getStatus() {
        return status;
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(status);
        }
    }
}
