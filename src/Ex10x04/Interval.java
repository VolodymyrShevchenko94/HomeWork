package Ex10x04;

import java.util.Scanner;

public class Interval {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число от 0 до 100:");
        int number = sc.nextInt();
        if ( number >= 0 && number <= 14 ) {
            System.out.println("Вы ввели число в диапазоне 0 - 14");
        }else if (number >=15 && number <= 35) {
            System.out.println("Вы ввели число в диапазоне 15 - 35");
        } else if (number >= 36 && number <= 50) {
            System.out.println("Вы ввели число в диапазоне 36 - 50");

        } else if (number > 51 && number <= 100) {
            System.out.println("Вы ввели число в диапазоне 51 - 100");
            
        }else {
            System.out.println("Неизвестное число");

        }

    }
}


