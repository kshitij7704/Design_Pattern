public class ChannelRepository implements Container {
    private String Channelnames[] = {"A", "B", "C", "D", "E", "F"};
   
    @Override
    public Iterator getIterator(){
        return new ChannelIterator();
    }
   
    private class ChannelIterator implements Iterator {
        private int ind;
       
        @Override
        public boolean hasNext(){
            if(ind < Channelnames.length){
                return true;
            }
            return false;
        }
       
        @Override
        public Object next(){
            if(this.hasNext()){
                return Channelnames[ind++];
            }
            return null;
        }
    }
}