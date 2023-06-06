package ExFrom27_05_Ex2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("//Який варіант набору Ви хотіли б придбати ?\n" +
                "    1 -> Ар-деко\n" +
                "    2 -> Вікторіанській\n" +
                "    3 -> Модерн");

        Scanner scanner = new Scanner(System.in);
        int type = scanner.nextInt();
        switch (type) {
            case 1:
               Art_deko art_deko1 = new Art_deko();
                art_deko1.method();
            case 2:
                Victorianskiy victorianskiy = new Victorianskiy();
                victorianskiy.method();




            }
        }
    }
