package Ex01x05;

public class Test {
    public static void main(String[] args) {
        int [] array = {1,2,3,4,5,6};
        double summ = 0;
        double average = 0;
        for (int i = 0; i < array.length; i++) {
            summ += array[i];

        }
        average = summ / array.length;
        System.out.println(average);
    }
}
