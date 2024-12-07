public abstract class AbstractRemote {
    private TV obj;
    private String remoteName;

    protected AbstractRemote(String remoteName, TV obj){
        this.remoteName = remoteName;
        this.obj = obj;
    }

    public void getRemoteName(){
        System.out.println(this.remoteName);
    }

    public void on(){
        obj.on();
    }

    public void off(){
        obj.off();
    }

    public void volumeUp(){
        obj.volumeUp();
    }

    public void volumeDown(){
        obj.volumeDown();
    }
}