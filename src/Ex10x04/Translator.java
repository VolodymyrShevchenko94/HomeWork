package Ex10x04;

import java.util.Scanner;

public class Translator {
    public static void main(String[] args) {
        System.out.println("Добро пожаловать в Русско-Английский переводчик!");
        System.out.println("Перечень слов : \"Зима\",\"Весна\",\"Лето\",\"Осень\",\"Дождь\",\"Снег\",\"Солнце\",\"Ветер\",\"Небо\",\"Облака\" ");
        System.out.println("Введите ваше слово :");
        String res;
        Scanner sc = new Scanner(System.in);
        String enter = sc.next();
        switch (enter) {
            case "Зима" :
                res = "Winter";
                System.out.println("Перевод слова :" + " " + res);
            break;
            case "Весна":
                res = "Spring";
                System.out.println("Перевод слова :" + " " + res);
                break;
            case "Лето" :
                res = "Summer";
                System.out.println("Перевод слова :" + " " + res);
                break;
            case "Осень":
                res = "Outamn";
                System.out.println("Перевод слова :" + " " + res);
                break;
            case "Дождь":
                res = "Rain";
                System.out.println("Перевод слова :" + " " + res);
                break;
            case "Снег":
                res = "Snow";
                System.out.println("Перевод слова :" + " " + res);
                break;
            case "Солнце":
                res = "Sun";
                System.out.println("Перевод слова :" + " " + res);
                break;
            case "Ветер":
                res = "Wind";
                System.out.println("Перевод слова :" + " " + res);
                break;
            case "Небо":
                res = "Sky";
                System.out.println("Перевод слова :" + " " + res);
                break;
            case "Облака":
                res =  "Clouds";
                System.out.println("Перевод слова :" + " " + res);
                break;
            default:
                System.out.println("Неверное слово");

        }

    }
            }