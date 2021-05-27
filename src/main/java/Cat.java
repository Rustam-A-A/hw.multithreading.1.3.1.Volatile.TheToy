public class Cat {
    private volatile boolean triger;
    private final int PAUSE = 1000;
    private final int TIME_TO_TURN_OFF = 1500;

    TheToy toy = new TheToy();

    public boolean react(){
        try {
            if (triger){
                Thread.sleep(TIME_TO_TURN_OFF);
                System.out.println("Кот открыл крышку и выключил тумблер");
                toy.off();
                //return triger;
            } else {
                Thread.sleep(TIME_TO_TURN_OFF);
                System.out.println("Кот открыл крышку, огляделся и закрыл крышку, не трогая тумблер");
                //return triger;
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return triger;

    }


}
