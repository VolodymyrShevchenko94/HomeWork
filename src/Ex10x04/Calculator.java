package Ex10x04;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double operand1 = 10;
        double operand2 = 0;
        double res = 0;
        char symbol;
        String sign;
        System.out.println("Hello");
        System.out.print("Enter an operator (+, -, *, /): ");
        symbol = scanner.next().charAt(0);

        switch (symbol) {
            case '+':
                res = operand1 + operand2;
                System.out.println(operand1 +" " + " + " + operand2 + " " + " = " + res);
                break;
            case '-':
                res = operand1 - operand2;
                System.out.println(operand1 +" " + " - " + operand2 + " " + " = " + res);
                break;
            case '*':
                res = operand1 * operand2;
                System.out.println(operand1 +" " + " * " + operand2 + " " + " = " + res);
                break;

            case '/':
                if (operand2 == 0) {
                    System.out.println("Error.Can not divide 0");
                }else {
                    res = operand1 / operand2;
                    System.out.println(operand1 +" " + " / " + operand2 + " " + " = " + res);
                }
                break;
            default:
                System.out.println("Wrong operator");


        }

    }
}
