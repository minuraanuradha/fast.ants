public class argumentsQ3 {
        public static void main(String[] args) {
            if (args.length != 2) {
                System.out.println("2 command line arguments and the length of the command");
                return;
            }
            
            String arg1 = args[0];
            String arg2 = args[1];
            int argCount = args.length;
            
            System.out.println("Command line argument 1: " + arg1);
            System.out.println("Command line argument 2: " + arg2);
            System.out.println("Number of command line arguments: " + argCount);
        }
    }
    
