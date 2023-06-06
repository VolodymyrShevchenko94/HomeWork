package Ex01x05;

//Опишіть метод PowerA234(A, B, C, D), який обчислює другий, третій і четвертий ступінь числа A і повертає ці ступені відповідно
// до змінних B, C і D (A – вхідний, B, C, D – вихідні параметри; усі параметри є дійсними).
// За допомогою цієї процедури знайдіть другий, третій і четвертий ступені п'яти зазначених чисел.

public class Ex12 {
    public static void main(String[] args) {
        String res = powerA234(2,0,0,0);
        String res2 = powerA234(4,0,0,0);
        String res3 = powerA234(5,0,0,0);
        String res4 = powerA234(6,0,0,0);
        String res5 = powerA234(10,0,0,0);
        System.out.println("первое число" + res);
        System.out.println("второе число " + res2);
        System.out.println("третье" + res3);
        System.out.println("четвертое" + res4);
        System.out.println("пятое" + res5);

    }

    public static String powerA234(double number , double b , double c , double d) {
        b = Math.pow(number,2);
        c = Math.pow(number,3);
        d = Math.pow(number,4);
        return " " + b + " " + c + " " + d;
    }
}
