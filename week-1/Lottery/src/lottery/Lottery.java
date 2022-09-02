/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lottery;

/**
 *
 * @author idont
 */
import java.util.Scanner;

public class Lottery {
    
    public static void main(String[] args) {
        // Generate new lottery number
        String lottoRaw = Integer.toString((int)(Math.random() * 1000)); // Generate a random number between 000 and 999 as a string
        String lotto;
        
        // Make the lottery number 3 characters long
        switch (lottoRaw.length()) {
            case 2:
                lotto = "0" + lottoRaw;
                break;
            case 1:
                lotto = "00" + lottoRaw;
                break;
            default:
                lotto = lottoRaw;
                break;
        } // switch
        
        // User inputs their guess
        Scanner input = new Scanner(System.in); // Scanner
        System.out.print("WARNING: This lottery uses the honor system with regards to the validity of user guesses!\nEnter a guess for the lottery (3 digits): ");
        String guess = input.next(); // User's lottery guess
        
        // Validate user guess
        boolean valid = true;
        if (guess.length() < 3) {
            valid = false;
        } // if
        
        if (valid == false) {
            System.out.println("Your guess is invalid. Please try again.");
        } // if
        
        else {
            System.out.println("Today's number is " + lotto + ". Let's see how you did...");
        
            // Convert guess and lotto strings to char arrays
            char[] guessCh = guess.toCharArray();
            char[] lottoCh = lotto.toCharArray();

            // Check the guess against the lottery number
            if (guess.equals(lotto)) {
                System.out.println("A perfect match! You win $10,000.");
            } // if
            else if ((guessCh[0] + guessCh[1] + guessCh[2]) == (lottoCh[0] + lottoCh[1] + lottoCh[2])) {
                System.out.println("All characters match. You win $3,000.");
            } // else if
            else if (guessCh[0] == lottoCh[0] || guessCh[0] == lottoCh[1] || guessCh[0] == lottoCh[2] ||
                    guessCh[1] == lottoCh[0] || guessCh[1] == lottoCh[1] || guessCh[1] == lottoCh[2] ||
                    guessCh[2] == lottoCh[0] || guessCh[2] == lottoCh[1] || guessCh[2] == lottoCh[2]) {
                System.out.println("At least one character matches. You win $1,000.");
            } // else if
            else {
                System.out.println("No match. Better luck next time.");
            } // else
        } // else
    } // void main
    
} // class Lottery
