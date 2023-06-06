package Ex01x05;

public class Ex5 {
    public static void main(String[] args) {

        int array[][] = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        int array2[][] = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        int summOfArrays[][] = new int[3][3];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                summOfArrays[i][j] = array[i][j] + array2[i][j];
                System.out.print(summOfArrays[i][j] + " ");

            }

        }

    }
}