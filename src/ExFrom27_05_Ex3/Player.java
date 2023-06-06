package ExFrom27_05_Ex3;

public class Player implements Playable , Recordable {
    @Override
    public void play() {
        System.out.println("Play music");

    }

    @Override
    public void record() {
        System.out.println("RECORD music");
    }

    @Override
    public void pause() {
        System.out.println("Pause Music");

    }

    @Override
    public void stop() {
        System.out.println("STOP Music");

    }

    //Використовуючи IntelliJ IDEA, створіть проект. Потрібно: Створіть 2 інтерфейси Playable та Recodable.
    // У кожному з інтерфейсів створіть по 3 методи void play() / void pause() / void stop() та void record()
    // / void pause() / void stop() відповідно. Створіть похідний клас Player від базових інтерфейсів Playable
    // та Recodable. Написати програму, яка виконує програвання та запис.
    public static void main(String[] args) {
        Player player = new Player();
        player.pause();
        player.play();
        player.record();

        Player player1 = new Player();
        player1.record();
        player1.stop();
        player1.pause();

    }
}
