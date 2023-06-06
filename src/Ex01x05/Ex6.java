package Ex01x05;
import java.util.Random;

public class Ex6 {
    public static void main(String[] args) {
        int[][] matrix1 = new int[3][3];
        int[][] matrix2 = new int[3][3];
        int[][] matrix3 = new int[3][3];
        System.out.println("Перший масив:");
        fillArray(matrix1);
        System.out.println("Другий масив:");
        fillArray(matrix2);
        System.out.println("Третій масив - результат додавання:");
        matrix3 = addArrays(matrix1, matrix2);
        showArray(matrix3);
    }

    static void fillArray(int[][] array) {
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = random.nextInt(10); // заповнюємо масив цілими числами від 0 до 10
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }

    static int[][] addArrays(int[][] array1, int[][] array2) {
        int[][] result = new int[array1.length][array1.length];
        for (int n = 0; n < result.length; n++) {
            for (int m = 0; m < result[n].length; m++) {
                result[n][m] = array1[n][m] + array2[n][m];
            }
        }
        return result;
    }

    static void showArray(int[][] array1) {
        for (int n = 0; n < array1.length; n++) {
            for (int m = 0; m < array1[n].length; m++) {
                System.out.print(array1[n][m] + " ");
            }
            System.out.println();
        }
    }
}


