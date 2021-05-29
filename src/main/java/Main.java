public class Main {
    public static void main(String[] args) {
        TheToy toy = new TheToy();

        Runnable playing = toy::play;
        Runnable reacting = toy::react;

        Thread cat = new Thread(null, reacting,"Кот");
        Thread player = new Thread(null, playing,"Игрок");
        cat.setDaemon(true);
        player.start();
        cat.start();
    }
}
