import java.util.Random;
import java.util.Scanner;
//DogGenetics by Abdullahi Yusuf
public class DogGenetics {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); //Create scanner for users input
        System.out.println("What is your dog's name");
        String userDog = input.nextLine(); //Store user's input in this string
        System.out.println("Here is your dog: " + userDog +  "'s genetics report");
        //Hold names of animals
        String [] dogs = {"St. Benard", "Chihuahua", "Dramatic RedNosed Asian Pug", "Common Cur", "King Doberman"};
        double percentageTotal = 0; //Tracker for total percentages of dogs
        double percentageMax = 1; //Max threshold for percentage total

        for(int i = 0; i < dogs.length; i++){ //go through each index of dogs
            if(percentageTotal <= percentageMax){ //if the total percentage is less than the threshold
                //Create a new percentage, where it is a number from 0 to 1 multiplied by the threshold - the total percentage
                //This ensures that new percentages will be in range and not exceed 1 :)
                double percentage = Math.random() * (percentageMax - percentageTotal);
                percentageTotal += percentage; //increment new percentage to total percentage
                String formattedValue = String.format("%.2f", (percentage * 100)); //to remove long decimals
                System.out.println(dogs[i] + " " + formattedValue + "%"); //show report to users
            }

        }

    }



}
