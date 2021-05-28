public class TheToy {
    volatile Trigger trigger;
    //Trigger  trigger;
    private final int TIME_TO_OBSERVE = 1000;
    private final int TIME_TO_TURN_ON = 1500;
    private final int NUMBER_OF_TURNS = 10;
    private final int PAUSE = 1000;
    private final int TIME_TO_TURN_OFF = 1500;

    public boolean play() {
        for (int i = 0; i < NUMBER_OF_TURNS; i++) {
            try {
                boolean t = trigger.getTrigger();
                if (t) {
                    System.out.println("тумблер включен");
                    Thread.sleep(TIME_TO_OBSERVE);
                    System.out.println("Игрок ждет, что произойдет дальше");
                } else {
                    System.out.println("тумблер выключен");
                    Thread.sleep(TIME_TO_TURN_ON);
                    System.out.println("Игрок включает тумблер");

                    trigger.setTrigger(true);
                    //user.on();
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        return trigger.getTrigger();
    }

    public boolean react(){
        for(int j = 0; j < 10; j++){
            try {
                if (trigger.getTrigger()){
                    System.out.println("тумблер включен");
                    Thread.sleep(TIME_TO_TURN_OFF);
                    System.out.println("Кот открыл крышку и выключил тумблер");
                    trigger.setTrigger(false);
                    //cat.off();
                } else {
                    System.out.println("тумблер выключен");
                    Thread.sleep(PAUSE);
                    System.out.println("Кот открыл крышку, огляделся и закрыл крышку, не трогая тумблер");
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        return trigger.getTrigger();
    }

}
