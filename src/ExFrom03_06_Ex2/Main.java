package ExFrom03_06_Ex2;

import ExFrom03_06.ZooEx_1;

public class Main {
    public static void main(String[] args) {
        Zoo zoo = new Zoo();
        zoo.getZoo().add(0,"Lion");
        zoo.getZoo().add(1,"Cow");
        zoo.getZoo().add(2,"Bird");
        zoo.getZoo().add(3,"Bear");
        zoo.getZoo().add(4,"Fish");
        zoo.getZoo().add(5,"Cat");
        zoo.getZoo().add(6,"Goat");
        zoo.getZoo().add(7,"Monkey");
        zoo.getZoo().add(8,"Wolf");
        zoo.getZoo().add(9,"Dolphin");
        zoo.getZoo().add(10,"Crocodile");

        zoo.removeAnimal(3);
        zoo.removeAnimal(5);
        zoo.removeAnimal(7);
//        zoo.showInfo();
        zoo.getSize();


    }
}
