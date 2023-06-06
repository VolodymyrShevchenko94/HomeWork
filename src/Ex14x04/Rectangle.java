package Ex14x04;

public class Rectangle {
    public static void main(String[] args) {
        final int power_number1 = 4;
        final int power_number2 = 15;
        for (int i = 0; i < power_number1; i++) {
            System.out.print("*");
            for (int j = 0; j < power_number2 -1; j++) {
                System.out.print("*");

            }
            System.out.println();

        }
    }
}
