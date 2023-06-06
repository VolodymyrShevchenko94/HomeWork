package Ex01x05;

//Опишіть метод PowerA3(A, B), який обчислює третій ступінь числа A і повертає її до змінної B
// (A – вхідний, B – вихідний параметр; обидва параметри є дійсними).
// За допомогою цієї процедури знайдіть третій ступінь п'яти зазначених чисел.

public class Ex11 {
    public static void main(String[] args) {

        System.out.println(PowerA3(5,0));
        System.out.println(PowerA3(2,0));
        System.out.println(PowerA3(8,0));
        System.out.println(PowerA3(10,0));
        System.out.println(PowerA3(3,0));

    }

    public static double PowerA3(double number , double b) {
        b = Math.pow(number,3);
        return b;
    }





}
