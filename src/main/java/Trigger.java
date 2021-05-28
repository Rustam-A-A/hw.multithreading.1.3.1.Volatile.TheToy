public class Trigger {
    //final TheToy toy;
    //volatile boolean trigger;
    boolean trigger;

//    public Trigger(TheToy toy) {
//        this.toy = toy;
//    }

    public Trigger(boolean trigger) {
        this.trigger = trigger;
    }

    public Trigger(){
    }

    public boolean getTrigger() {
        return trigger;
    }

    public void setTrigger(boolean trigger) {
        this.trigger = trigger;
    }

}
