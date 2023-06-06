package Ex22_05;

public class BadPupil extends Pupil {


    @Override
    public void study() {
        System.out.println("Study Bad");
    }

    @Override
    public void read() {
        System.out.println("Read Bad");
    }

    @Override
    public void write() {
        System.out.println("Write Bad");
    }

    @Override
    public void relax() {
        System.out.println("Relax Bad");
    }
}
