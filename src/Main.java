import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        double meter = 0;
        double feet = 0;
        double inches = 0;
        double miles = 0;
        String trash = "";

        System.out.println("enter your values in meters - ");

        if (in.hasNextDouble())
        {
            meter = in.nextDouble();

            feet = meter * 3.28084;
            System.out.println("your value in feet is " + feet + " feet");

            inches = meter * 39.3700787402;
            System.out.println("your value in inches is " + inches + " inch");

            miles = meter / 1609.344;
            System.out.println("your value in miles is " + miles + " mile");

        }

        else
        {
            trash = in.nextLine();

            System.out.println("you have entered an incorrect value");
        }




    }
}