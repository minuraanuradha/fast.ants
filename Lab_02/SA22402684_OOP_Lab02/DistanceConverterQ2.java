public class DistanceConverterQ2 {
    public static void main(String[] args) {
        final double MILES_TO_KILOMETERS = 1.609;
        final double YARDS_IN_A_MILE = 1760.0;
        
        int miles = 26;
        int yards = 385;
        double kilometers = miles * MILES_TO_KILOMETERS + (yards / YARDS_IN_A_MILE) * MILES_TO_KILOMETERS;
        
        System.out.println("The distance in kilometers is: " + kilometers);
    }
}
