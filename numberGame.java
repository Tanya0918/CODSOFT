import java.util.Random;
import java.util.Scanner;

public class numberGame {
    public static void main(String[] args) {
        System.out.println("Number Game");
        Random randomNum = new Random();
        Scanner input = new Scanner(System.in);
        int targetNum = randomNum.nextInt(100);
        int Attempt=0;
        boolean playGame=true;

        while(playGame && Attempt<5){
        System.out.print("Enter your guessed number: ");
        int guess = input.nextInt();
        if(guess==targetNum)
        {
            System.out.println("Yeahh...you guessed the correct number.");
            break;
        }
        else{
            System.out.println("Ohh sorry...you guessed the wrong.");
            if(guess<targetNum){
                System.out.println("you guessed the lower number. Try Again!" + targetNum);
            }
            else{
                System.out.println("you guessed the upper number. Try Again!");
            }
        }
        System.out.print("Do you want to play this game: ");
        String playAgain = input.next();
        if(playAgain.equals("no")){
            System.out.println("Thanks for playing!!");
            break;
        }
        Attempt++;
       
    if(Attempt==5){
        System.out.println("Sorry...you are out of attempts.\nThe target number is " + targetNum);
        break;
    }
}
    }
}
