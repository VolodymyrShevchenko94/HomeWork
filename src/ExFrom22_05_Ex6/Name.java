package ExFrom22_05_Ex6;

public class Name extends Printer {
    public static String ANSI_RED = "\u001B[31m";
    @Override
    public void print(String value) {
        System.out.println(ANSI_RED + value);
    }
}
