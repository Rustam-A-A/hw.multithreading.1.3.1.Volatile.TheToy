public class Main {
    public static void main(String[] args) {
        TheToy toy = new TheToy();
        User user = new User();
        Cat cat = new Cat();

        Runnable playing = user::play;
        Runnable reacting = cat::react;
        new Thread(null, playing,"Игрок").start();
        new Thread(null, reacting,"Кот").start();

    }
}
