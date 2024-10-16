public class TestDrive {
    public static void main(String arr[]){
        ChannelRepository c1 = new ChannelRepository();
       
        Iterator i = c1.getIterator();
        while(i.hasNext()){
            String channelname = (String)i.next();
            System.out.println("Name: " + channelname);
        }
    }
}