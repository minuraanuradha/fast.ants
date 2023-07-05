public class CelciustoFahrenheit {
    public static void main(String[] args) {
        
        int celsius = Integer.parseInt(args[0]);
        double fahrenheit = 1.8 * celsius + 32  ;

        

        System.out.println(celsius + " `C = "+ fahrenheit + " `F");
    }
    
}