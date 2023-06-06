package ExFrom27_05_Ex5;


public class Realisation extends ConverterTemperature {
    @Override
    public void convert(double celsiy) {
        System.out.println("Цельсій в Фаренгейти = " + ((celsiy * 9) / 5 + 32));
        System.out.println("Цельсій в Кельвіни = "  + (celsiy + 273.15));

    }


    }

