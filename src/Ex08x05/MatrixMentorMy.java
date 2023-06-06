package Ex08x05;

public class MatrixMentorMy {
    public static void main(String[] args) {
        MatrixMentorMy a = new MatrixMentorMy(3,5);
        MatrixMentorMy b = new MatrixMentorMy(new int[][] {{3,4,5},{6,7,8},{4,5,6}});
//        System.out.println(a);
//        a.fillArray();
//        a.showMatrix();
        b.showMatrix2();



    }

    public MatrixMentorMy(int[][] ints) {
    }

    int[][] matrix;
    int rows;
    int col;

    public MatrixMentorMy(int rows, int col) {
        this.matrix = matrix;
        this.rows = rows;
        this.col = col;
        matrix = new int[rows][col];

    }


//    public void fillArray() {
//        for (int i = 0; i < matrix.length; i++) {
//            for (int j = 0; j < matrix[i].length; j++) {
//                matrix[i][j] = 10 + (int) (Math.random() * 40);
//            }
//        }
//    }
public void fillArray() {
    for (int i = 0; i < matrix.length; i++) {
        for (int j = 0; j < matrix[i].length; j++) {
            matrix[i][j] *= 1;
        }
    }
}
    public void showMatrix() {
        for (int[] rows : matrix) {
            for (int i : rows) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }

    public void showMatrix2() {
        for (int i = 0; i < this.matrix.length; i++) {
            for (int j = 0; j < this.matrix.length; j++) {
                System.out.println(matrix[i][j]);

            }

        }
    }
}
