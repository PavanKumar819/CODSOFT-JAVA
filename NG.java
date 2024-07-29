import java.util.Random;
import java.util.Scanner;
public class NG{
        public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String ans;
        do {
            Random rand = new Random();
            int num = rand.nextInt(100) + 1;
            System.out.println("Number is generated successfully.");
            System.out.println("You have 3 chances. Please guess the number:");
            boolean correctGuess = false;
            
            for (int i = 0; i < 3; i++) {
                int guess = input.nextInt();
                int sub = num - guess;
                
                if (sub == 0) {
                    System.out.println("Your guess is correct.");
                    correctGuess = true;
                    break;
                } else if (sub > 0 && sub < 15) {
                    System.out.println("Your guess is almost correct. Try a little higher next time.");
                } else if (sub > 15 && sub < 30) {
                    System.out.println("You've guessed a lower number.");
                } else if (sub > 30) {
                    System.out.println("Your guess is too low.");
                } else if (sub > -15 && sub < 0) {
                    System.out.println("Your guess is almost correct. Try a little lower next time.");
                } else if (sub > -30 && sub < -15) {
                    System.out.println("You've guessed a higher number.");
                } else if (sub < -30) {
                    System.out.println("Your guess is too high.");
                }

                if (i == 2 && !correctGuess) {
                    System.out.print("The generated number is: ");
                    System.out.println(num);
                    System.out.println("All the chances have been used.");
                } else if (!correctGuess) {
                    System.out.println("Please try again.");
                }
            }
            input.nextLine();  // Clear the buffer
            System.out.println("Would you like to play again? (Y/N)");
            ans = input.nextLine();
        } while (ans.equalsIgnoreCase("y"));
        
        input.close();
    }
}
