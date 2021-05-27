public class TheToy {
    volatile boolean  triger;

    public boolean on(){
        triger = true;
        return triger;
    }
    public boolean off(){
        triger = false;
        return triger;
    }

}
