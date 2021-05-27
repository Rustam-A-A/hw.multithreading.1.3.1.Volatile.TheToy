public class User {
    private volatile boolean triger;
    private final int TIME_TO_OBSERVE = 1000;
    private final int TIME_TO_TURN_ON = 1500;
    private final int NUMBER_OF_TURNS = 10;


    TheToy toy = new TheToy();

    public boolean play() {
        for (int i = 0; i < NUMBER_OF_TURNS; i++) {
            try {
                if (!triger) {
                    Thread.sleep(TIME_TO_OBSERVE);
                    System.out.println("Игрок ждет, что произойдет дальше");
                    //return triger;
                } else {
                    Thread.sleep(TIME_TO_TURN_ON);
                    System.out.println("Игрок включает тумблер");
                    toy.on();
                }
                //return triger;
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        return triger;
    }
}
