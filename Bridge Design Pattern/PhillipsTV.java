public class PhillipsTV implements TV {
    PhillipsTV(){

    }

    @Override
    public void on(){
        System.out.println("Phillips TV is on");
    }

    @Override
    public void off(){
        System.out.println("Phillips TV is off");
    }

    @Override
    public void volumeUp(){
        System.out.println("Phillips TV volume is up");
    }

    @Override
    public void volumeDown(){
        System.out.println("Phillips TV volume is down");
    }
}