package Ex08x05;

//public class Matrix {
    //Створити клас "Матриця".
    //Клас повинен мати такі змінні:
    //1. двовимірний масив речових чисел;
    //2. кількість рядків та стовпців у матриці.
    //Клас повинен мати такі методи:
    //1. додавання двовимірного масиву до двовимірного масиву;
    //2. множення двовимірного масиву на число;
    //3. виведення на друк обʼєкту Матриця;
    //4. виведення на друк двовимірного масив після операцій над ним;
    //5. множення двовимірного масиву на двовимірний масив.
//        private double[][] array;
//        private int rows;
//        private int columns;
//
//        public Matrix(double[][] array) {
//
//            setArray(array);
//        }
//
//        public Matrix(int rows, int columns) {
//            this.array = new double[rows][columns];
//            this.rows = rows;
//            this.columns = columns;
//        }
//
//        public double[][] getArray() {
//
//            return array.clone();
//        }
//
//        public void setArray(double[][] array) {
//            this.array = array.clone();
//            this.rows = array.length;
//            this.columns = array[0].length;
//        }
//
//        public int getRows() {
//
//            return rows;
//        }
//
//        public int getColumns() {
//
//            return columns;
//        }
//
//        public void add(Matrix matrix) {
////            if (this.getRows() != matrix.getRows() || this.getColumns() != matrix.getColumns()) {
////                System.out.println("Матрицы разного размера невозможно сложить.");
////                return;
////            }
//            for (int i = 0; i < this.getRows(); i++) {
//                for (int j = 0; j < this.getColumns(); j++) {
//                    this.getArray()[i][j] += matrix.getArray()[i][j];
//                }
//            }
//        }
//
//        public void multiply(int a) {
//            for (int i = 0; i < this.getRows(); i++) {
//                for (int j = 0; j < this.getColumns(); j++) {
//                    this.getArray()[i][j] *= a;
//                }
//            }
//        }
//
//        public Matrix multiply(Matrix matrix) {
////            if (this.getColumns() != matrix.getRows()) {
////                System.out.println("Матрицы невозможно умножить.");
////                return null;
////            }
//            Matrix result = new Matrix(this.getRows(), matrix.getColumns());
//            for (int i = 0; i < this.getRows(); i++) {
//                for (int j = 0; j < matrix.getColumns(); j++) {
//                    for (int k = 0; k < this.getColumns(); k++) {
//                        result.getArray()[i][j] += this.getArray()[i][k] * matrix.getArray()[k][j];
//                    }
//                }
//            }
//            return result;
//        }
//
//        public void print() {
//
//            System.out.println(Arrays.deepToString(this.getArray()));
//        }
//
//        public static void main(String[] args) {
//            Matrix matrix1 = new Matrix(new double[][]{{1.0, 1.0, 1.0}, {2.0, 2.0, 2.0}});
//            Matrix matrix2 = new Matrix(new double[][]{{3.0, 3.0, 1.0}, {2.0, 5.0, 6.0}});
//            Matrix matrix3 = new Matrix(new double[][]{{1.0, 1.0, 3.0}, {2.0, 0.0, 4.0}});
//            Matrix matrix4 = new Matrix(new double[][]{{1.0, 1.0, 4.0}, {2.0, 0.0, 3.0}});
//
//
//
//
//            matrix1.add(matrix2);
//            matrix2.multiply(2);
//            matrix2.print();
//
//            matrix2.add(matrix4);
//
//            Matrix matrix5 = matrix4.multiply(matrix3);
//            matrix4.multiply(matrix3);
//            matrix5.print();
//        }
//    }
