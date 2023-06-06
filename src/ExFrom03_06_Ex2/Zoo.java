package ExFrom03_06_Ex2;

import java.util.ArrayList;

public class Zoo {
    ArrayList<String> zoo = new ArrayList<>();

    public ArrayList<String> getZoo() {
        return zoo;

    }

    public void removeAnimal(int index) {
        zoo.remove(index);
    }

    public void showInfo() {
        for (String i: zoo) {
            System.out.println(i);

        }
    }

    public void getSize() {
//        for (int i = 0; i < zoo.size(); i++) {
//            System.out.println(zoo.get(i));
//
//        }
        System.out.println(zoo.size());
    }



}
