package Ex01x05;

import java.util.Scanner;

public class Conversion_Ex9 {
    public static double myMethod(double euro , double course) {

        return euro * course;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите сумму и курс:");
        System.out.println(myMethod(scanner.nextDouble(), scanner.nextDouble()));

    }
}
