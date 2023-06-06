package Ex14x04;

public class SumMin {
    public static void main(String[] args) {

        // Часть 1
//        int a = 10 , b = 15;
//        int summ = 0;
//        for (int i = (a+1); i < b; i++) {
//             summ +=i;
//        }
//        System.out.println(summ);

        //Часть 2
        int a = 8 , b = 30;
        for (int i = a; i < b ; i++) {
            if (i % 2 == 0) {
                continue;
            }
            System.out.println(i);

        }
    }
}
