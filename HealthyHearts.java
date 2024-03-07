import java.util.Scanner;
//HealthyHears by Abdullahi Yusuf
public class HealthyHearts {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); //Create input for user
        System.out.println("What is your age"); //Asks for their age

        int age = input.nextInt(); //Stores user's input as integer
        int maxRate = 220 - age; //Equation for max heart rate
        int hrZone1 = (int) (0.85 * maxRate); //equation for higher zone of healthy heart rate
        int hrZone2 = (int) (0.5 * maxRate); //equation for lower zone of healthy heart rate

        //outputs for users
        System.out.println("Your max heart rate should be: " + maxRate + " beats per minute");
        System.out.println("Your target heart rate zone is: " + hrZone2 + " - " + hrZone1 + " beats per minute");

    }
}
