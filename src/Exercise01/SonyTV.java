package Exercise01;

public class SonyTV implements TV{
    @Override
    public void on() {
        System.out.println("Switch On Sony TV");
    }

    @Override
    public void off() {
        System.out.println("Switch Off Sony TV");
    }

    @Override
    public void tune(int channel) {
        System.out.println("Switch On Channel in Sony TV is : "+channel);
    }
}
