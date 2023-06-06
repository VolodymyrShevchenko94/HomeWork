package Ex01x05;

public class Ex16_2 {

        public static void main(String[] args) {
            double firstResult = getAvg(2, 4, 4);
            double secondResult = getAvg(2, 2, 20, 2);
            double thirdResult = getAvg(3, 3, 3, 3, 3);
            double min = getMin(firstResult, secondResult, thirdResult);
            double max = getMax(firstResult, secondResult, thirdResult);
            double avg = getAvg(firstResult, secondResult, thirdResult);

            System.out.println("min: " + min);
            System.out.println("max: " + max);
            System.out.println("avg: " + avg);
        }

        public static double getAvg(double... args) {
            double result = 0;
            if (args.length > 0) {
                for (double arg : args) {
                    result += arg;
                }
                result /= args.length;
            }

            return result;
        }

        public static double getMin(double... args) {
            double min = args[0];
            if (args.length > 0) {
                for (int i = 1; i < args.length; i++) {
                    if (min > args[i]) {
                        min = args[i];
                    }
                }
            }
            return min;
        }

        public static double getMax(double... args) {
            double max = args[0];
            if (args.length > 0) {
                for (int i = 1; i < args.length; i++) {
                    if (max < args[i]) {
                        max = args[i];
                    }
                }
            }
            return max;
        }

    }
