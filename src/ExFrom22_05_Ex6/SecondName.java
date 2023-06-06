package ExFrom22_05_Ex6;

public class SecondName extends Printer {
    public static String ANSI_PURPLE = "\u001B[35m";
    @Override
    public void print(String value) {
        System.out.println(ANSI_PURPLE + value);
    }


}
