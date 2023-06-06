//package Ex08x05;
//
//import java.util.Arrays;
//
//public class Matrix3 {
//     //Створити клас "Матриця".
//     //Клас повинен мати такі змінні:
//     //
//     //1. двовимірний масив речових чисел;
//     //2. кількість рядків та стовпців у матриці.
//     //Клас повинен мати такі методи:
//     //1. додавання двовимірного масиву до двовимірного масиву;
//     //2. множення двовимірного масиву на число;
//     //3. виведення на друк обʼєкту Матриця;
//     //4. виведення на друк двовимірного масив після операцій над ним;
//     //5. множення двовимірного масиву на двовимірний масив.
//     double[][] array;
//     int rows;
//     int columns;
//
//     public Matrix3(double[][] array, int rows, int columns) {
//          this.array = array;
//          this.rows = rows;
//          this.columns = columns;
//     }
//
//     public static void print(int[][]a) {
//          System.out.println(Arrays.toString(a));
//     }
//
//     public static int[][] addArrays(int[][]a , int[][] b) {
//          int[][] result = new int[3][3];
//          for (int i = 0; i < a.length; i++) {
//               for (int j = 0; j < a.length; j++) {
//                    result[i][j] = a[i][j] + b[i][j];
//                    System.out.print(result[i][j] + " ");
//
//               }
//
//          }
//          return result;
//
//     }
//
//
//
//     public static int multiplyArray(int[][]a , int multiplayer) {
//          int result = 0;
//          for (int i = 0; i < a.length; i++) {
//               for (int j = 0; j < a.length; j++) {
//                   result = a[i][j] * multiplayer;
//                    System.out.print(result + " ");
//
//               }
//
//
//          }
//          return result;
//     }
//     public static int multyplyArrayOnArray(int[][]a , int[][]b) {
//          int result = 0;
//          for (int i = 0; i < a.length; i++) {
//               for (int j = 0; j < a.length; j++) {
//                    result = a[i][j] * b[i][j];
//                    System.out.print(result + " ");
//
//               }
//
//          }
//          return result;
//     }
//
//     public static void main(String[] args) {
//          int[][] array = {
//                  {1,2,3},
//                  {4,5,6},
//                  {7,8,9}
//          };
//          int[][] array2 = {
//                  {1,2,3},
//                  {4,5,6},
//                  {7,8,9}
//          };
//          Matrix matrix1 = new Matrix(new double[][]{{1.0, 1.0, 1.0}, {2.0, 2.0, 2.0},{1.0,2.0,3.0}});
//          matrix1.print();
//
//
//          addArrays(array,array2);
//          System.out.println("");
//          multiplyArray(array,4);
//          System.out.println("");
//          multyplyArrayOnArray(array,array2);
//
//          Matrix matrix = new Matrix(3,5);
//          System.out.println();
//
//          matrix.print();
//
//
//
//
//
//
//
//     }
//
//}
