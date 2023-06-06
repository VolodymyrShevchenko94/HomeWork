package Ex01x05;

public class Ex15 {
    public static void main(String[] args) {
        factorial(3);
    }

    static int factorial(int x){

        if (x == 1){

            return 1;
        }
        return x * factorial(x - 1);
    }
}
