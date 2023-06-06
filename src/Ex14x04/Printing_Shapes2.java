package Ex14x04;

public class Printing_Shapes2 {
    public static void main(String[] args) {

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print("*");
            }
            System.out.println("*");
        }
        System.out.println();


        for (int i = 1; i <= 5; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");

            }
            System.out.println();


        }

        for (int i = 0; i <= 6; i++) {

            for (int j = 1; j <= 6 - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }
            System.out.println();



        }




        for (int i = 1; i < 10; i += 2) {
            for (int j = 0; j < 9 - i / 2; j++)
                System.out.print(" ");

            for (int j = 0; j < i; j++)
                System.out.print("*");

            System.out.print("\n");
        }


        for (int i = 7; i > 0; i -= 2) {
            for (int j = 0; j < 9 - i / 2; j++)
                System.out.print(" ");

            for (int j = 0; j < i; j++)
                System.out.print("*");

            System.out.print("\n");
        }
    }
}