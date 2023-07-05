
public class DistanceConverterQ1 {
    public static void main(String[] args) {
        // Declare the variables
        int miles,yards;
        double kilometers ;

        //assigned the value
        miles = 26;
        yards = 385; 

        kilometers = (miles * 1.609) + ((yards/1760.0)* 1.609);
        System.out.println("The distance of a marathon in kilometers is: " + kilometers);

    }

}