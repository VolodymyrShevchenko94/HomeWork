package Ex14x04;

import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Type number:");
        int number = sc.nextInt();
        int factorial = 1;
        int i = 1;
        do {
            factorial = factorial * i;
            i++;

        }while (i <= number);
        System.out.println("Факториал числа: " + number +  " = " + factorial  );
    }
}
