package Ex3_323;

public class Plane extends Vehicle {
    int height;
    int amountOfPassengers;


    public Plane(double coordinates, int price, int speed, int date) {
        super(coordinates, price, speed, date);
    }

    public Plane(double coordinates, int price, int speed, int date, int height, int amountOfPassengers) {
        super(coordinates, price, speed, date);
        this.height = height;
        this.amountOfPassengers = amountOfPassengers;
    }

    @Override
    public String toString() {
        return "Plane{" +
                "height=" + height +
                ", amountOfPassengers=" + amountOfPassengers +
                ", coordinates=" + coordinates +
                ", price=" + price +
                ", speed=" + speed +
                ", date=" + date +
                '}';
    }
}
