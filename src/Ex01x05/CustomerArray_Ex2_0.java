package Ex01x05;

import java.util.Arrays;
import java.util.Scanner;

public class CustomerArray_Ex2_0 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите длину массива");
        int length = sc.nextInt();
        int[] array = new int[length];
        for (int i = 0; i < array.length ; i++) {
            array[i] = i * 1;


        }
        System.out.println(Arrays.toString(array));

        int min = array[0];
        int max = array[0];
        double sum = 0;
        double average = 0;

        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];

            }
            if (array[i] < min) {
                min = array[i];
            }
            sum +=i;
            average = sum / array.length;

        }
        System.out.println("Нечетные числа = ");
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                System.out.println(array[i]);
            }

        }

        System.out.println("Минимальное число " + min);
        System.out.println("Максимальное число " + max);
        System.out.println("Среднее арефметическое "+ average);

    }

}
