package Ex01x05;

//Створіть три перевантажені методи для пошуку середнього арифметичного числа з 3, 4, 5 змінних,
// створіть метод для пошуку мінімального, максимального та середнього значень серед цих трьох методів.

public class Ex16 {

    public static void main(String[] args) {
        System.out.println(getResult(1, 2, 3));
        System.out.println(getResult(1, 2, 3, 4));
        System.out.println(getResult(1,2,3,4,5));



    }


    public static String getResult(int a, int b, int c) {
        return "Max: " + getMax(a, b, c) + " Min: " + getMin(a , b ,c) + " Average: " + getAverage(a,b,c)  ;

    }

    public static String getResult(int a, int b, int c, int d) {

        return "Max: " + getMax(a, b, c, d) + " Min: " + getMin(a,b,c,d) + " Average: "+ getAverage(a , b, c , d);
    }

    public static String getResult(int a , int b , int c , int d , int e) {

        return "Max: " + getMax(a , b , c , d , e) + " Min: " + getMin(a , b , c ,d , e) + " Average: "+ getAverage(a , b , c , d , e);
    }

    public static int getMax(int... args) {
        int max = args[0];
        for (int i = 1; i < args.length; i++) {
            if (args[i] > args[i - 1]) {
                max = args[i];
            }

        }
        return max;
    }
    public static int getMin(int... args) {
        int min = args[0];
        for (int i = 1; i < args.length; i++) {
            if (args[i] < min) {
                min = args[i];
            }

        }
        return min;
    }

    public static double getAverage(int... args) {
        double result = 0;
        if (args.length>0) {
            for (int arg : args) {
                result += arg;
            }
            result /= args.length;
        }
        return result;
    }


    }
