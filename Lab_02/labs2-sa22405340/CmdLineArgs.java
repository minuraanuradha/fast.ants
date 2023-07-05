import java.util.Scanner;

public class CmdLineArgs {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter first cmdline arg: ");
        String arg1 = scanner.next();
        System.out.println("Enter the second cmdline arg: ");
        String arg2 = scanner.next();

        System.out.println("The first cmdline arg is: "+ arg1);
        System.out.println("The second cmdline arg is: "+ arg2);

        System.out.println("The length of the cmdline arg array is: "+args.length);
    }
}
