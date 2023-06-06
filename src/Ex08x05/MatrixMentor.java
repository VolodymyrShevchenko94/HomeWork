//package Ex08x05;
//import java.util.Arrays;
//
//public class MatrixMentor {
//    private static final int ROWS = 3;
//    private static final int COLUMNS = 5;
//
//    public static void main(String[] args) {
//        Matrix a = new Matrix(ROWS, COLUMNS);
//        Matrix b = new Matrix(ROWS, COLUMNS);
//        System.out.println("Display both Matrix");
//        System.out.println(a);
//        System.out.println(b);
//        System.out.println();
//
//        System.out.println("Display arrays in Matrix");
//        a.showMatrix();
//        System.out.println();
//        b.showMatrix();
//        System.out.println();
//
//        System.out.println("Add array from Matrix B to inner array in Matrix A");
//        a.addArrayFromMatrix(b);
//        a.showMatrix();
//        System.out.println();
//
//        System.out.println("Multiply array in Matrix A by number 2");
//        a.multiply(2);
//        a.showMatrix();
//        System.out.println();
//
//        System.out.println("Multiply array in Matrix A by array from Matrix B");
//        a.multiply(b);
//        a.showMatrix();
//
//
//    }
//}
//
//class Matrix {
//    protected int[][] matrix;
//    protected int rows;
//    protected int columns;
//
//    public Matrix(int rows, int columns) {
//        this.rows = rows;
//        this.columns = columns;
//        matrix = new int[rows][columns];
//        fillArray();
//    }
//
//    public void showMatrix() {
//        for (int[] rows : matrix) {
//            for (int i : rows) {
//                System.out.print(i + " ");
//            }
//            System.out.println();
//        }
//    }
//
//    public void addArrayFromMatrix(Matrix matrixToAdd) {
//        for (int i = 0; i < matrix.length; i++) {
//            for (int j = 0; j < matrix[i].length; j++) {
//                matrix[i][j] += matrixToAdd.matrix[i][j];
//            }
//        }
//    }
//
//    public void multiply(int pow) {
//        for (int i = 0; i < matrix.length; i++) {
//            for (int j = 0; j < matrix[i].length; j++) {
//                matrix[i][j] *= pow;
//            }
//        }
//    }
//
//    public void multiply(Matrix powMatrix) {
//        for (int i = 0; i < matrix.length; i++) {
//            for (int j = 0; j < matrix[i].length; j++) {
//                matrix[i][j] *= powMatrix.matrix[i][j];
//            }
//        }
//    }
//
//    private void fillArray() {
//        for (int i = 0; i < matrix.length; i++) {
//            for (int j = 0; j < matrix[i].length; j++) {
//                matrix[i][j] = 10 + (int) (Math.random() * 40);
//            }
//        }
//    }
//
//    @Override
//    public String toString() {
//        return "Matrix{matrix=" + Arrays.deepToString(matrix) +
//                ", rows=" + rows + ", columns=" + columns + "}";
//    }
//
//
//}
