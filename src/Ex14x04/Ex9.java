package Ex14x04;

import java.util.Scanner;

public class Ex9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n0 = 1;
        int n1 = 1;
        int n2;
        System.out.println("Type number:");
        int power_number = scanner.nextInt();
        System.out.print(n0+" "+n1+" ");
        for(int i = 3; i <= power_number; i++){
            n2=n0+n1;
            System.out.print(n2+" ");
            n0=n1;
            n1=n2;
        }
        System.out.println();
    }
}
