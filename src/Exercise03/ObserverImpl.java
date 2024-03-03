package Exercise03;

public class ObserverImpl implements Observer {
    private String observerID;

    public ObserverImpl(String observerID) {
        this.observerID = observerID;
    }

    public void update(String status) {
        System.out.println("Observer received state change of subject ID is - " + observerID + " Status - " + status);
    }
}
