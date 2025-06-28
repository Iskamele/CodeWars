package Kyu8.T04_WillYouMakeIt;

public class NewKata {

    public static boolean zeroFuel(double distanceToPump, double mpg, double fuelLeft) {
        return distanceToPump - mpg * fuelLeft <= 0;
    }
}
