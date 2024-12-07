public class SonyTV implements TV {
    SonyTV(){

    }

    @Override
    public void on(){
        System.out.println("Sony TV is on");
    }

    @Override
    public void off(){
        System.out.println("Sony TV is off");
    }

    @Override
    public void volumeUp(){
        System.out.println("Sony TV volume is up");
    }

    @Override
    public void volumeDown(){
        System.out.println("Sony TV volume is down");
    }
}