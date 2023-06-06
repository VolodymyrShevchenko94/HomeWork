package ExFrom22_05_Ex6;

public class ThirdName extends Printer {
    public static final String ANSI_WHITE = "\u001B[37m";
    @Override
    public void print(String value) {
        System.out.println(ANSI_WHITE + value);
    }
}
