package Exercise01;

public class Test {
    public static void main(String args[]){
        TV lgTV=new LGTV();
        TV sonyTV=new SonyTV();

        new RemoteControllerImpl(lgTV).on();
        new RemoteControllerImpl(lgTV).tune(10);
        new RemoteControllerImpl(lgTV).off();

        new RemoteControllerImpl(sonyTV).on();
        new RemoteControllerImpl(sonyTV).tune(10);
        new RemoteControllerImpl(sonyTV).off();

    }
}
