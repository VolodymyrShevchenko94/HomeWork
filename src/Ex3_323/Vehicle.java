package Ex3_323;

public class Vehicle {
    protected double coordinates;
    protected int price;
    protected int speed;
    protected int date;

    public Vehicle(double coordinates, int price, int speed, int date) {
        this.coordinates = coordinates;
        this.price = price;
        this.speed = speed;
        this.date = date;
    }

    //Створити клас Vehicle. У тілі класу створіть поля:
    // координати та параметри суден (ціна, швидкість, рік випуску). Створіть 3 похідних класи Plane, Саг та Ship.
    // Для класу Plane має бути визначена висота та кількість пасажирів. Для класу Ship – кількість пасажирів
    // та порт приписки. Написати програму, яка виводить на екран інформацію про кожен засіб пересування.
}
