import java.util.Random;
import java.util.Scanner;

public class numberGame {
    public static void main(String[] args) {
        System.out.println("Number Game");
        Scanner input = new Scanner(System.in);
        int Attempt=1;
        boolean playGame=true;

        while(playGame){
            Random randomNum = new Random();
            int targetNum = randomNum.nextInt(100);
            while(Attempt<=5){
        System.out.print("Enter your guessed number: ");
        int guess = input.nextInt();
        if(guess==targetNum)
        {
            System.out.println("Yeahh...you guessed the correct number in " + Attempt + " attempts.");
            break;
        }
        else{
            System.out.println("Ohh sorry...you guessed the wrong number.");
            if(guess<targetNum){
                System.out.println("you guessed too low. Try Again!");
            }
            else{
                System.out.println("you guessed too high. Try Again!");
            }
        }
        Attempt++;
       
    if(Attempt>5){
        System.out.println("Sorry...you are out of attempts.\nThe target number is " + targetNum);
        break;
    }
}
System.out.print("\nDo you want to play this game: ");
String playAgain = input.next();
Attempt=1;
if(playAgain.equals("no")){
    System.out.println("Thanks for playing!!");
    break;

}
}
}
    
}
