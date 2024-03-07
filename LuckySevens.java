import java.util.Random;
import java.util.Scanner;
public class LuckySevens {
    //LuckySevens by Abdullahi Yusuf
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); //Creates new scanner for users input
        System.out.println("How much money you want to bet");
        int userRoll= input.nextInt(); //Integer to store user's numberr
        Random randomDice = new Random(); //create new instance of random
        int[] dice1 = {1,2,3,4,5,6}; //to hold numbers of first dice
        int[] dice2 = {1,2,3,4,5,6}; //to hold numbers of second dice
        int Rolls = 0; //count how many rolls user takes
        int maxMoney = 0; //tracks max money made by users during game
        int maxRoll = 0;

        while(userRoll > 0) { //whilst their bet is more than 0
            int randomDice1 = randomDice.nextInt(dice1.length); //finds a random index of dice array
            int randomDice2 = randomDice.nextInt(dice2.length); //^
            int randomChoice1 = dice1[randomDice1]; //finds the actual number of chosen random index
            int randomChoice2 = dice2[randomDice2]; //^
            Rolls += 1; //rolls is incremented each time while loop is run
            if (randomChoice1 + randomChoice2 == 7) { //condition for lucky 7
                userRoll += 4; //user's bet increases by 4 if both dices add up to 7
            }else{
                userRoll -= 1; //user's bet decreases by 1 if not
            }
            maxMoney = Math.max(maxMoney, userRoll); //use the math.max method, to find the maximum money made
            System.out.println(userRoll); //print out the users bet each roll
        }
        //print the results!
        System.out.println("Ur broke, after : " + Rolls + " Rolls");
        System.out.println("here is how much you would have had : £" + maxMoney);
    }
}
