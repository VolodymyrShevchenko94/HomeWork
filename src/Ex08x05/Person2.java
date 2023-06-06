package Ex08x05;

public class Person2 {
    //Клас Person
    //Створити клас Person, який містить:
    //1. змінні fullName, age;
    //2. методи move() і talk(), у яких просто вивести на консоль повідомлення - "Який Person говорить".
    //3. Додайте два конструктори - Person() та Person(fullName, age).
    //4. Створіть два об'єкти цього класу. Один об'єкт ініціалізується конструктором Person (), інший – Person (fullName, age).
    //
    //5. Викличте методи move() та talk().

    int age;
    String fullName;

    public void move() {
        System.out.println(this.fullName + "Двигается");
    }
    public void talk() {
        System.out.println(this.fullName + "Говорит");
    }

    public Person2(int age, String fullName) {
        this.age = age;
        this.fullName = fullName;
    }

    public Person2() {
    }

    public static void main(String[] args) {
        Person2 person = new Person2(18,"Volodymyr");
        Person2 person2 = new Person2();
        person2.age = 18;
        person2.fullName = "Alina";
        System.out.println(person2.fullName + person2.age);

        person.move();
        person.talk();

        person2.move();
        person2.talk();


    }
}
