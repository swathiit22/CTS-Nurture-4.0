import java.util.Random;
import java.util.Scanner;

public class GuessGame {
    public static void main(String[] args) {
        Random rand = new Random();
        int number = rand.nextInt(100) + 1;
        Scanner sc = new Scanner(System.in);
        int guess;

        do {
            System.out.print("Guess the number: ");
            guess = sc.nextInt();
            if (guess < number)
                System.out.println("Too low!");
            else if (guess > number)
                System.out.println("Too high!");
        } while (guess != number);
        System.out.println("Correct!");
    }
}
