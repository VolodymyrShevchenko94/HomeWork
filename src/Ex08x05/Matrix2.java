//package Ex08x05;
//
//import java.util.Arrays;
//
//public class Matrix2 {
//    private  double [][] array;
//    private int rows;
//    private int columns;
//
//    public Matrix2() {
//    }
//
//
//
//    public void setRows(int rows) {
//        this.rows = rows;
//    }
//
//    public void setColumns(int columns) {
//        this.columns = columns;
//    }
//
//    public double[][] getArray() {
//        return array;
//    }
//
//    public void setArray(double[][] array) {
//        this.array = array;
//    }
//
//    public int getRows() {
//        return rows;
//    }
//
//    public int getColumns() {
//        return columns;
//    }
//
//
//    public Matrix2(double[][] array, int rows, int columns) {
//        this.array = array;
//        this.rows = rows;
//        this.columns = columns;
//
//
//    }
//    public void add(Matrix2 matrix2) {
//        int sum = 0;
//        for (int i = 0; i < getRows(); i++) {
//            for (int j = 0; j < getRows(); j++) {
//                sum = (int) (this.getArray()[i][j] + Matrix2.this.getArray()[i][j]);
//
//            }
//            System.out.println(sum);
//
//
//        }
//
//    }
//    public void multiply(int a) {
//        for (int i = 0; i < this.getRows(); i++) {
//            for (int j = 0; j < this.getColumns(); j++) {
//                this.getArray()[i][j] *= a;
//            }
//        }
//    }
//    public void print() {
//
//        System.out.println(Arrays.deepToString(this.getArray()));
//    }
//
//    public Matrix multiply(Matrix matrix) {
//
//        Matrix result = new Matrix(this.getRows(), matrix.getColumns());
//        for (int i = 0; i < this.getRows(); i++) {
//            for (int j = 0; j < matrix.getColumns(); j++) {
//                for (int k = 0; k < this.getColumns(); k++) {
//                    result.getArray()[i][j] += this.getArray()[i][k] * matrix.getArray()[k][j];
//                }
//                System.out.println(result);
//            }
//        }
//        return result;
//    }
//
//    public static void main(String[] args) {
//        Matrix matrix1 = new Matrix(new double[][]{{1,2,3},{4,5,6},{7,8,9}});
//        Matrix matrix2 = new Matrix(new double[][]{{1,2,3},{4,5,6},{7,8,9}});
//        matrix1.add(matrix2);
//        matrix1.multiply(10);
//        matrix2.print(); //вывод матрицы
//
//        Matrix matrix5 = matrix1.multiply(matrix2);
//    }
//}
