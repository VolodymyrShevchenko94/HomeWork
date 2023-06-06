package Ex01x05;

import java.util.Scanner;

public class Ex8 {

    public static void add(double a, double b) {
        double res = a + b;
        System.out.println(res);
    }

    public static void sub(double a, double b) {
        double res = a - b;
        System.out.println(res);

    }

    public static void div(double a, double b) {
        Scanner sc = new Scanner(System.in);
        double res = a / b;
        System.out.println(res);

    }

    public static void mul(double a, double b) {
        double res = a * b;
        System.out.println(res);

    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите знак арефметической операции");
//        System.out.println("Введите числа А и Б");
        char symbol = sc.next().charAt(0);
        switch (symbol) {
            case '+': {
                System.out.println("Введите числа А и Б");
                add(sc.nextInt(), sc.nextInt());
            }
            break;
            case '-': {
                System.out.println("Введите числа А и Б");
                sub(sc.nextInt(), sc.nextInt());

            }
            break;
            case '*': {
                System.out.println("Введите числа А и Б");
                mul(sc.nextInt(), sc.nextInt());

            }
            break;
            case '/': {
                System.out.println("Введите числа А и Б");
                int a = sc.nextInt();
                int b = sc.nextInt();
                if (b == 0 ) {
                    System.out.println("На ноль делить нельзя");
                } else  {
                    div(a,b);
                }



            }
        }
    }
}

