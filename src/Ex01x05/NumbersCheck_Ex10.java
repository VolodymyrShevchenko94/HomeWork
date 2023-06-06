package Ex01x05;

public class NumbersCheck_Ex10 {
    public static void main(String[] args) {
        //Використовуючи IntelliJ IDEA, створіть клас NumbersCheck. Напишіть метод, який визначатиме:
        //1)      чи є введене число позитивним, чи негативним;
        //2)      чи є воно простим (використовуйте техніку перебору значень).
        //Просте число – це натуральне число, яке ділиться на 1 й саме на себе. Щоби визначити просте число чи ні, варто знайти всі його цілі дільники. Якщо дільників більше 2-х, то воно не просте;
        //3)      чи ділиться воно на 2, 5, 3, 6, 9 без залишку.
        System.out.println(isNegative(10));
        System.out.println(isPositive(-10));
        System.out.println(isPrime(3));


    }


    public static boolean isPositive(int n)
    {
        return n>0;
    }
    public static boolean isNegative(int n)
    {
        return n<0;
    }
    public static boolean isPrime(int n)
    {
        int k=2;
        while (k*k <= n)
        {
            if (n%k==0) return false;
            k++;
        }
        return true;
    }

}
