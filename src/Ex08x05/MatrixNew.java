//package Ex08x05;
//
//import java.util.Arrays;
//
//public class MatrixNew {
//    //Клас повинен мати такі змінні:
//    //
//    //1. двовимірний масив речових чисел;
//    //2. кількість рядків та стовпців у матриці.
//    //Клас повинен мати такі методи:
//    //1. додавання двовимірного масиву до двовимірного масиву;
//    //2. множення двовимірного масиву на число;
//    //3. виведення на друк обʼєкту Матриця;
//    //4. виведення на друк двовимірного масив після операцій над ним;
//    //5. множення двовимірного масиву на двовимірний масив.
//    int[][] array;
//    int rows;
//    int columns;
//
//    public int[][] getArray() {
//        return array;
//    }
//
//    public void setArray(int[][] array) {
//        this.array = array;
//    }
//
//    public int getRows() {
//        return rows;
//    }
//
//    public void setRows(int rows) {
//        this.rows = rows;
//    }
//
//    public int getColumns() {
//        return columns;
//    }
//
//    public void setColumns(int columns) {
//        this.columns = columns;
//    }
//    public void print() {
//        System.out.println(Arrays.toString(getArray()));
//    }
//
//    public MatrixNew(int[][] array, int rows, int columns) {
//        this.array = array;
//        this.rows = rows;
//        this.columns = columns;
//    }
//
//    public static int[][] addArrays() {
//        int[][] result = new int[3][3];
//        for (int i = 0; i < this.getRows(); i++) {
//            for (int j = 0; j < this.getColumns(); j++) {
//                result[i][j] = ge[i][j] + b[i][j];
//                System.out.print(result[i][j] + " ");
//
//            }
//
//        }
//        return result;
//
//    public void multiply(double multiplayer) {
//        for (int i = 0; i < getRows(); i++) {
//            for (int j = 0; j < getColumns(); j++) {
//                this.getArray()[i][j] *= multiplayer;
//
//            }
//
//        }
//
//
//            }
//
//
//            public static void main(String[] args) {
//                Matrix matrix = new Matrix(3,4);
//                matrix.print();
//                Matrix matrix1 = new Matrix(new double[][]{{1.0, 1.0, 1.0}, {2.0, 2.0, 2.0},{3.0,4.0,5.0}});
//                matrix1.print();
//
//                Matrix matrix2 = new Matrix(new double[][]{{1.0, 1.0, 1.0}, {2.0, 2.0, 2.0},{3.0,4.0,5.0}});
//                matrix2.
//
//
//
//}
//
//}
