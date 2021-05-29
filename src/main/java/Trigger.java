public class Trigger {
    TheToy toy;
    private boolean trigger;

    public Trigger(TheToy toy) {
        this.toy = toy;
    }

    public boolean getTrigger() {
        return trigger;
    }

    public void setTrigger(boolean trigger) {
        this.trigger = trigger;
    }
}
