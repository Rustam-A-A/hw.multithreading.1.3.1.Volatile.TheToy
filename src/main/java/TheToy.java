public class TheToy {

    private final int TIME_TO_OBSERVE = 2100;
    private final int TIME_TO_TURN_ON = 1500;
    private final int NUMBER_OF_TURNS = 10;
    private final int PAUSE = 2100;
    private final int TIME_TO_TURN_OFF = 3500;

    private volatile Trigger trigger = new Trigger(this);

    public void play() {
        for (int i = 0; i < NUMBER_OF_TURNS; i++) {
            try {
                if (trigger.getTrigger()) {
                    System.out.println("тумблер включен");
                    System.out.println("Игрок ждет, что произойдет дальше");
                    Thread.sleep(TIME_TO_OBSERVE);
                } else {
                    System.out.println("тумблер выключен");
                    System.out.println("Игрок включает тумблер");
                    trigger.setTrigger(true);
                    Thread.sleep(TIME_TO_TURN_ON);
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

        public void react(){
        while (true){
            try {
                if (trigger.getTrigger()){
                    System.out.println("тумблер включен");
                    System.out.println("Кот открыл крышку и выключил тумблер");
                    trigger.setTrigger(false);
                    Thread.sleep(TIME_TO_TURN_OFF);
                } else {
                    System.out.println("тумблер выключен");
                    System.out.println("Кот открыл крышку, огляделся и закрыл крышку, не трогая тумблер");
                    Thread.sleep(PAUSE);
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
