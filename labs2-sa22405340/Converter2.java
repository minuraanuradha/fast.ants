public class Converter2 {

    private static final double MILES_TO_KM = 1.609;
    private static final double YARDS_TO_KM = 1760.0;
    
    public static void main(String[] args){

        double kilometers = 0.0;
        kilometers = MILES_TO_KM * 26 + YARDS_TO_KM * 385 / 1760.0;

        System.out.println("The distance in kilimeters is: " + kilometers);
    }
}
