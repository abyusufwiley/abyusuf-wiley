import java.util.Scanner;
//Factorizer by Abdullahi Yusuf
public class Factorizer {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); //Create a new scanner for users input
        System.out.println("Enter a number"); //Ask user for a number
        int userNum = Integer.parseInt(input.nextLine()); //Store user input with a variable
        int sum = 0; //Running sum variable
        int totalFactors = 0; //Counting number of factors

        for(int i = 1; i < userNum; i++){ //Loop using i from 1, to user's number
            if(userNum % i == 0){ //If user's number is divisible by i with no remainders
                System.out.println(i); //It is a factor
                sum += i; //Increment i with running sum, until user's number
                totalFactors++; //Increment variable to find total number of factors
            }

        }
        System.out.println(userNum + " has: " + totalFactors + " factors");

        //condition for perfect number
        if(sum == userNum){ //If running sum is the same as user's number
            System.out.println(userNum + " is a perfect Number"); //It is a perfect Number
        }else{
            System.out.println("It is not a perfect number");
        }

        //condition for prime number
        if(totalFactors != 1){
            System.out.println("This is Not Prime Number");
        }else{
            System.out.println("This is a prime number!");
        }

    }
    
}
