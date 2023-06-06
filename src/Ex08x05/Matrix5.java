//package Ex08x05;
//
//import java.util.Arrays;
//
//public class Matrix5 {
//    //Клас повинен мати такі змінні:
//    //1. двовимірний масив речових чисел;
//    //2. кількість рядків та стовпців у матриці.
//    //Клас повинен мати такі методи:
//    //1. додавання двовимірного масиву до двовимірного масиву;
//    //2. множення двовимірного масиву на число;
//    //3. виведення на друк обʼєкту Матриця;
//    //4. виведення на друк двовимірного масив після операцій над ним;
//    //5. множення двовимірного масиву на двовимірний масив.
//    protected int[][] array;
//    protected int rows;
//    protected int columns;
//
//    public Matrix5() {
//        this.array = array;
//        this.rows = rows;
//        this.columns = columns;
//    }
//
//
//    public  void addArray(int[][]array) {
//        for (int i = 0; i < this.array.length; i++) {
//            for (int j = 0; j < this.array.length; j++) {
//                this.array[i][j] += array[i][j];
//
//
//            }
//
//        }
//
//    }
//
//    public static void print(int[][]array) {
//          System.out.println(Arrays.toString(this.array));
//     }
//
//    public void mult(int[][]array) {
//        for (int i = 0; i < this.array.length; i++) {
//            for (int j = 0; j < this.array.length; j++) {
//                this.array[i][j] *= array[i][j];
//
//            }
//
//        }
//    }
//
//
//
//    public static void main(String[] args) {
//        int[][] matrix1 =  {{1,2,3}, {4,5,6},{7,8,9}};
//        int[][] matrix2 = new int[3][3];
//        Matrix5 matrix = new Matrix5();
//        matrix.addArray(matrix1);
//
//
//
//
//
//
//
//
//
//
//    }
//}
