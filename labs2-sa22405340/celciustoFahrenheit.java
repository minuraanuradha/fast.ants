import java.util.Scanner;

public class celciustoFahrenheit {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        int celcius = Integer.parseInt(args[0]);

        //System.out.println("Enter the celcius value: ");
        //int celcius = Integer.parseInt(args[0]);

        double fahrenheit = 1.8 * celcius + 32;

        System.out.println("The fahrenheit temperature is: " + fahrenheit);
    }
}
