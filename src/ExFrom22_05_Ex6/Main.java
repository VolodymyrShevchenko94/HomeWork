package ExFrom22_05_Ex6;

public class Main {
    public static void main(String[] args) {
        Name name = new Name();
        SecondName name1 = new SecondName();
        ThirdName name2 = new ThirdName();

        Printer printer = (Printer) name;
        name.print("Volodymyr");
        Printer printer1 = (Printer) name1;
        name1.print("John");
        Printer printer2 = (Printer) name2;
        name2.print("Alina");





    }

}
