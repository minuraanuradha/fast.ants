public class CubeVolumeQ5 {
        public static void main(String[] args) {
            if (args.length < 3) {
                System.out.println("Please enter height, width and length of the cube");
                return;
            }
            
            double height = Double.parseDouble(args[0]);
            double width = Double.parseDouble(args[1]);
            double length = Double.parseDouble(args[2]);
            
            double volume = height * width * length;
            
            System.out.println("The volume of the cube is " + volume);
        }
    }
    