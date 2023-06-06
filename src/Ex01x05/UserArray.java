package Ex01x05;

public class UserArray {
    //Використовуючи IntelliJ IDEA, створіть клас UserArray. Створити метод, який виконуватиме збільшення довжини масиву,
    // переданого як аргумент, на 1 елемент. Елементи масиву мають зберегти своє значення та порядок індексів.
    // Створити метод, який приймає два аргументи, перший аргумент типу int [] array, другий аргумент типу int value.
    // У тілі методу реалізуйте можливість додавання другого аргументу методу в масив за індексом 0,
    // водночас довжина нового масиву має збільшитися на 1 елемент, а елементи одержуваного масиву як перший аргумент
    // мають скопіюватися в новий масив починаючи з індексу 1.

        public static int[] increaseArray(int[] array) {
            int[] updated = new int[array.length + 1];
            for (int i = 0; i < array.length; i++) {
                updated[i] = array[i];
                System.out.print(updated[i] + " ");
            }
            return updated;
        }


        public static int[] addValueToArray(int[] array, int value) {
            int[] updated = new int[array.length + 1];
            updated[0] = value;
            for (int i = 0; i < array.length; i++) {
                updated[i + 1] = array[i];
                System.out.print(updated[i] + " ");
            }
            return updated;
        }

    public static void main(String[] args) {
            int [] newArray = {1,2,3,4,5,6,7,8,9,10};
            increaseArray(newArray);
            addValueToArray(newArray,8);


    }
    }
