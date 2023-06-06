package Ex14x04;

import java.util.Scanner;

public class Ex6_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Type n : ");
        final int n = sc.nextInt();
        double summ = 0;
        double factorial = 1;
        for (int i = 1; i < n; i++) {
            factorial *= i;
            summ += 1.0/factorial;


        }
        System.out.println(summ);
    }
}
