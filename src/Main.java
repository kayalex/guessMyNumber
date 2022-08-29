import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to guess my number!!! Take a guess, and I'll give you clues. All the best!");
        Scanner readInput = new Scanner(System.in);
        int randomNum = ThreadLocalRandom.current().nextInt(1, 100 + 1);
        int count = 0;
        while (count < 8){

            System.out.println("Guess my number: ");
            int number = readInput.nextInt();
            count++;

            if(number == randomNum){
                System.out.println("Congratulations, you have guessed right in " + count + " tries");
                break;
            }
            else {
                if(number > randomNum){
                    System.out.println("Lower...");
                }
                if(number < randomNum){
                    System.out.println("Higher...");
                }
                if (count == 8){
                    System.out.println("Loser, you have failed to guess the number. It was " + randomNum);
                }
            }

        }
    }
}