package Ex01x05;
import java.util.Scanner;

public class Ex14_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введіте сумму");
        getPayment(sc.nextInt());
    }

    public static void getPayment(int payment) {
        int credit = 700;
        int debs = 0;
        int overpayment = 0;
        if (payment > credit) {
            overpayment = payment - credit;
            System.out.println("кредит погашен" + "Переплата составила " + overpayment + "грн");
        } else if (payment == credit) {
            System.out.println("кредит погашен");
        } else {
            debs = credit - payment;
            System.out.println("Задолженность составляет " + debs + "грн");
        }

    }
}
