package Ex22_05;

public class GoodPupil extends Pupil {



    public GoodPupil() {
    }

    @Override
    public void study() {
        System.out.println("Study Good");
    }

    @Override
    public void read() {
        System.out.println("Read Good");
    }

    @Override
    public void write() {
        System.out.println("Write Good");
    }

    @Override
    public void relax() {
        System.out.println("Relax Good");
    }
}
