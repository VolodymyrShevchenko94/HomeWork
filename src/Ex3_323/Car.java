package Ex3_323;

public class Car extends Vehicle {


    public Car(double coordinates, int price, int speed, int date) {
        super(coordinates, price, speed, date);
    }

    @Override
    public String toString() {
        return "Car{" +
                "coordinates=" + coordinates +
                ", price=" + price +
                ", speed=" + speed +
                ", date=" + date +
                '}';
    }
}
