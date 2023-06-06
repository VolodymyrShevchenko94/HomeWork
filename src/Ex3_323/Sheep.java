package Ex3_323;

public class Sheep extends  Vehicle {

    int amountOfPassengers;
    String port;


    public Sheep(double coordinates, int price, int speed, int date) {
        super(coordinates, price, speed, date);
    }

    public Sheep(double coordinates, int price, int speed, int date, int amountOfPassengers, String port) {
        super(coordinates, price, speed, date);
        this.amountOfPassengers = amountOfPassengers;
        this.port = port;
    }

    @Override
    public String toString() {
        return "Sheep{" +
                "amountOfPassengers=" + amountOfPassengers +
                ", port='" + port + '\'' +
                ", coordinates=" + coordinates +
                ", price=" + price +
                ", speed=" + speed +
                ", date=" + date +
                '}';
    }
}