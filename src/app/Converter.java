package app;

public class Converter {
    public static double milesToKilometers(double miles) {
        return miles * 1.60934;
    }

    public static void main(String[] args) {
        double miles = 10;
        double kilometers = milesToKilometers(miles);
        System.out.println(miles + " миль = " + kilometers + " кілометрів");
    }
}