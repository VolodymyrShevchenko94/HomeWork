package ExFrom27_05_Ex1;

public abstract class UnknownCar  {
    private String model;
    private double power;

    private int speed;
    private double price;
    private final int yearOfManufacture = 1967;

    public UnknownCar() {
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getPower() {
        return power;
    }

    public void setPower(double power) {
        this.power = power;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getYearOfManufacture() {
        return yearOfManufacture;
    }

    @Override
    public String toString() {
        return "UnknownCar{" +
                "model='" + model + '\'' +
                ", power=" + power +
                ", speed=" + speed +
                ", price=" + price +
                ", yearOfManufacture=" + yearOfManufacture +
                '}';
    }

    //Створити клас - якась невідома машина
    //Клас має поля
    //model - назва машини
    //power - від 0.0 до 200.0
    //speed - від 0 до 320
    //price - від 0.0 до 50000.0
    //yearOfManufacture - для всіх один рік 1967
    //
    //Створити 4 екземляри машин
    //Ford
    //Mitsubishi
    //Toyota
    //KIA
    //
    //Створити клас - CheckCar
    //Цей клас повинен:
    //- мати список машин які які будуть передавати на перевірку
    //- мати метод який отримує якусь машину і додає її в свій список
    //- мати метод який повертає найшвидшу машину
    //- мати метод який повертає найдорожчу машину
    //- мати метод який повертає найпотужнішу машину
    //- всі методи які повертають машини - найшвидшу/найдорожчу/найпотужнішу - мають вивести про неї всю інформацію у форматі
    //Brand: KIA Rio
    //Power: 600
    //Speed: 189
    //Price: 3458.90
    //Year:  1967
    //
    //* Статичні змінні використовувати заборонено


}
