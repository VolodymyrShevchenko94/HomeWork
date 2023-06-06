package Ex08x05;

public class Person {
    //Створити клас Person, який містить:
    //1. змінні fullName, age;
    //2. методи move() і talk(), у яких просто вивести на консоль повідомлення - "Який Person говорить".
    //3. Додайте два конструктори - Person() та Person(fullName, age).
    //4. Створіть два об'єкти цього класу. Один об'єкт ініціалізується конструктором Person (), інший – Person (fullName, age).
    //
    //5. Викличте методи move() та talk().
    String fullName;
    int age;

    public void talk() {
        System.out.println(fullName + " Говорит");
    }
    public void move() {
        System.out.println(fullName + " Двигается");
    }

    public Person(String fullName, int age) {
        this.fullName = fullName;
        this.age = age;
    }

    public Person() {
    }

    public String getFullName() {

        return fullName;
    }

    public void setFullName(String fullName) {

        this.fullName = fullName;
    }

    public int getAge() {

        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public static void main(String[] args) {
        Person person = new Person("Volodymyr",18);
        Person person1 = new Person();
        person1.setFullName("Alina");
        person1.setAge(18);
        System.out.println(person.fullName + " " + person.age);
        System.out.println(person1.fullName+ " " + person1.age);



        person.talk();
        person.move();
        person1.move();
        person1.talk();



    }
}
