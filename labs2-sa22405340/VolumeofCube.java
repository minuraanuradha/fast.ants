import  java.util.Scanner;

public class VolumeofCube {
    public static void main(String[] args){
        
        //new scanner object to read user input
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the height of the cube: ");
        double height = scanner.nextDouble();

        System.out.println("Enter the width of the cube: ");
        double width = scanner.nextDouble();

        System.out.println("Enter the length of the cube: ");
        double length = scanner.nextDouble();

        double volume = height * width * length;

        System.out.println("The volume of the cube is: " + volume);
    }
}
