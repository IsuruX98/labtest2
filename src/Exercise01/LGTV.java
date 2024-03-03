package Exercise01;

public class LGTV implements TV{
    @Override
    public void on() {
        System.out.println("Switch On LG TV");
    }

    @Override
    public void off() {
        System.out.println("Switch Off LG TV");
    }

    @Override
    public void tune(int channel) {
        System.out.println("Switch On Channel in LG TV is : "+channel);
    }
}
