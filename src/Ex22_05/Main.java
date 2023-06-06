package Ex22_05;

public class Main {
    public static void main(String[] args) {
        ExxelentPupil pupil = new ExxelentPupil();
        BadPupil pupil1 = new BadPupil();
        GoodPupil pupil2 = new GoodPupil();
        BadPupil pupil3 = new BadPupil();


        ClassRoom classRoom = new ClassRoom(pupil,pupil1,pupil2);

        pupil1.read();
        pupil1.write();
        pupil1.relax();
        pupil1.study();

        System.out.println();

        pupil.read();
        pupil.write();
        pupil.relax();
        pupil.study();

        System.out.println();

        pupil2.read();
        pupil2.write();
        pupil2.relax();
        pupil2.study();

        System.out.println();

        pupil3.relax();
        pupil3.study();
        pupil3.read();
        pupil3.write();



        ////Створити клас, який представляє навчальний клас ClassRoom. Створіть клас учень Pupil.
        //    // У тілі класу створіть методи void study(), void read(), void write(), void relax().
        //    // Створіть 3 похідні класу ExcelentPupil, GoodPupil, BadPupil від класу базового класу Pupil
        //    // і перевизначте кожен із методів, залежно від успішності учня. Конструктор класу ClassRoom приймає
        //    // аргументи типу Pupil, клас має складатися із 4 учнів. Передбачте можливість, що користувач може передати
        //    // 2 або 3 аргументи. Виведіть інформацію про те, як усі учні екземпляра класу ClassRoom вміють
        //    // навчатися, читати, писати, відпочивати.






    }
}
