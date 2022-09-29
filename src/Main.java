import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        double tank = 0;
        double mpg = 0;
        double price = 0;
        String Trash = "";


        System.out.print("\n How many gallons of gas can you store in your tank: ");
        if(in.hasNextDouble()) {
            tank = in.nextDouble();
        }
        else {
            Trash = in.nextLine();
            System.out.println("Error, please enter a valid number");
        }

        System.out.print("\n How many miles per gallon does your car get: ");
        if(in.hasNextDouble()) {
            mpg = in.nextDouble();
        }
        else {
            Trash = in.nextLine();
            System.out.println("Error, please enter a valid number");
        }

        System.out.print("\n What is the price of gas: ");
        if(in.hasNextDouble()) {
            price = in.nextDouble();
        }
        else {
            Trash = in.nextLine();
            System.out.println("Error, please enter a valid number");
        }
        System.out.println("The cost for you to drive 100 miles is: " + ((100/mpg) * price)  + " dollars");

        System.out.println("You can drive " + (tank * mpg) + " with a full tank");
    }
}