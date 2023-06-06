package ExFrom27_05_Ex1;
import java.util.ArrayList;

public  class CheckCar extends UnknownCar {

    public CheckCar() {
        super();
    }

    @Override
    public String getModel() {
        return super.getModel();
    }

    @Override
    public void setModel(String model) {
        super.setModel(model);
    }

    @Override
    public double getPower() {
        return super.getPower();
    }

    @Override
    public void setPower(double power) {
        super.setPower(power);
    }

    @Override
    public int getSpeed() {
        return super.getSpeed();
    }

    @Override
    public void setSpeed(int speed) {
        super.setSpeed(speed);
    }

    @Override
    public double getPrice() {
        return super.getPrice();
    }

    @Override
    public void setPrice(double price) {
        super.setPrice(price);
    }

    @Override
    public int getYearOfManufacture() {
        return super.getYearOfManufacture();
    }

    @Override
    public String toString() {
        return super.toString();
    }

    static ArrayList<UnknownCar> carList = new ArrayList<>();


    public static void add(UnknownCar unknownCar) {
        carList.add(unknownCar);
    }

    public static UnknownCar theMostFasterCar() {
        int maxSpeed = 0;
        for (UnknownCar obj : carList) {
            if (obj.getSpeed() >= maxSpeed) {
                maxSpeed= obj.getSpeed();
            }
        }
        UnknownCar result = new CheckCar() {
        };
        for (UnknownCar obj : carList) {
            if (obj.getSpeed() == maxSpeed) {
                return result = obj;
            }
        }
        return result;
    }
    public static UnknownCar theMostExpensiveCar() {
        double maxPrice = 0;
        for (UnknownCar obj : carList) {
            if (obj.getPrice() >= maxPrice) {
                maxPrice = obj.getPrice();
            }
        }
        UnknownCar result = new CheckCar();
        for (UnknownCar obj : carList) {
            if (obj.getPrice() == maxPrice) {
                return result = obj;
            }
        }
        return result;
    }
    public static UnknownCar theMostPowerfulCar() {
        double maxPower = 0;
        for (UnknownCar obj : carList) {
            if (obj.getPower() >= maxPower) {
                maxPower = obj.getPower();
            }
        }
        UnknownCar result = new CheckCar();
        for (UnknownCar obj : carList) {
            if (obj.getPower() == maxPower) {
                return result = obj;
            }
        }
        return result;
    }


    }

