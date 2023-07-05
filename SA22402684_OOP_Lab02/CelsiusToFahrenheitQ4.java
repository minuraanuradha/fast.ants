public class CelsiusToFahrenheitQ4 {
        public static void main(String[] args) {
            if (args.length != 1) {
                System.out.println("Please enter a Celsius temperature");
                return;
            }
            
            int celsius = Integer.parseInt(args[0]);
            double fahrenheit = 1.8 * celsius + 32;
            
            System.out.println(celsius + " Degrees Celsius is equal to : " + fahrenheit + " degrees Fahrenheit.");
        }
    }
    
