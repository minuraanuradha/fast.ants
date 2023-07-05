public class DistanceConverter {
    public static void main (String[] args){

        int miles = 26;
        int yards = 386;

        double kilometers = 0.0;

        //One mile is 1.609 kilometers and there are 1760.0 yards in a mile
        kilometers = miles * 1.609 + yards / 1760.0;

        System.out.println("The distance in kilometers: "+kilometers);
    }
}
