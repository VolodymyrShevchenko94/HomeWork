package Ex01x05;

import java.util.Scanner;

public class Ex10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число : ");
        posOrNeg(scanner.nextInt());
    }



    public static int posOrNeg(int a) {
        if (a > 0) {
            System.out.println("Число положительное");
        }else {
            System.out.println("Число негативное");
        }return a;



    }
    public static boolean isSimple(Integer number) {
        if(number < 2) return false;
        for(int i = 2; i < number / 2; i++) {
            if(number % i == 0) {
                return false;
            }
        }
        return true;
    }

}
