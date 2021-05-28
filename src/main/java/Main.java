public class Main {
    public static void main(String[] args) {
        TheToy toy = new TheToy();

//        System.out.println(toy.play());
//        System.out.println(toy.react());
        toy.play();


//        Runnable playing = toy::play;
//        Runnable reacting = toy::react;

//        new Thread(null, playing,"Игрок").start();
//        new Thread(null, reacting,"Кот").start();
    }
}
