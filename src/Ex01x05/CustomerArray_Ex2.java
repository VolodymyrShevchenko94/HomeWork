package Ex01x05;

import java.util.Scanner;

public class CustomerArray_Ex2 {
    public static void main(String[] args) {
        System.out.println("Введите размер массива: ");
        Scanner scanner = new Scanner(System.in);
        int sizeArray = scanner.nextInt();
        int[] array = new int[sizeArray];
        int max = array[0];
        int min = array[0];
        double summ = 0;
        double average = 0;
        for (int i = 0; i < array.length; i++) {
            array[i] = i * 1;
            System.out.print(array[i] + " ");
            summ += i;
            average = summ / array.length;
            if (array[i] > max) {
                max = array[i];

            }
            if (array[i] < min) {
                min = array[i];
            }



        }
        for (int i = 0; i < array.length; i++) {
            if (array[i]%2 != 0) {
                System.out.println(array[i]);
            }
            System.out.print(array[i]);

        }
        System.out.println();

            System.out.println("Максимальное число = " + max);
            System.out.println("Минимальное число = " + min);
            System.out.println("Сумма всех элементов = " + summ);
            System.out.println("Среднее арифметическое = " + average);


        }
    }
