package capitalchallengech20;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class CapitalChallengeCh20 {

    public static void main(String[] args) {
        String[][] answers = {
            {"Alabama", "Montgomery"},
            {"Alaska", "Juneau"},
            {"Arizona", "Phoenix"},
            {"Arkansas", "Little Rock"},
            {"California", "Sacramento"},
            {"Colorado", "Denver"},
            {"Connecticut", "Hartford"},
            {"Delaware", "Dover"},
            {"Florida", "Tallahassee"},
            {"Georgia", "Atlanta"},
            {"Hawaii", "Honolulu"},
            {"Idaho", "Boise"},
            {"Illinois", "Springfield"},
            {"Indiana", "Indianapolis"},
            {"Iowa", "Des Moines"},
            {"Kansas", "Topeka"},
            {"Kentucky", "Frankfort"},
            {"Louisiana", "Baton Rouge"},
            {"Maine", "Augusta"},
            {"Maryland", "Annapolis"},
            {"Massachusetts", "Boston"},
            {"Michigan", "Lansing"},
            {"Minnesota", "St Paul"},
            {"Mississippi", "Jackson"},
            {"Missouri", "St Louis"},
            {"Montana", "Helena"},
            {"Nebraska", "Lincoln"},
            {"Nevada", "Carson City"},
            {"New Hampshire", "Concord"},
            {"New Jersey", "Trenton"},
            {"New Mexico", "Santa Fe"},
            {"New York", "Albany"},
            {"North Carolina", "Raleigh"},
            {"North Dakota", "Bismarck"},
            {"Ohio", "Columbus"},
            {"Oklahoma", "Oklahoma City"},
            {"Oregon", "Salem"},
            {"Pennsylvania", "Harrisburg"},
            {"Rhode Island", "Providence"},
            {"South Carolina", "Columbia"},
            {"South Dakota", "Pierre"},
            {"Tennessee", "Nashville"},
            {"Texas", "Austin"},
            {"Utah", "Salt Lake City"},
            {"Vermont", "Montpelier"},
            {"Virginia", "Richmond"},
            {"Washington", "Olympia"},
            {"West Virginia", "Charleston"},
            {"Wisconsin", "Madison"},
            {"Wyoming", "Cheyenne"}
        };
        
        List<String[]> questions = Arrays.asList(answers);
        Collections.shuffle(questions);
        
        Scanner keyboard = new Scanner(System.in);
        int score = 0;
        
        System.out.println("Welcome to the Capital Challenge. When answering, please exclude characters such as periods or apostrophes.");
        for (String[] question:questions) {
            System.out.println("What is the capital of " + question[0] + "? ");
            
            if (keyboard.nextLine().equals(question[1])) {
                System.out.println("That's correct. The capital of " + question[0] + " is " + question[1] + ".\n");
                score++;
            } // if (the player guessed correctly)
            else {
                System.out.println("Sorry. The capital of " + question[0] + " is actually " + question[1] + ".\n");
            } // else
        } // for (question in questions)
        
        System.out.println("Thanks for playing! You got " + score + " out of " + questions.size() + " state capitals correct.");
        
    } // + static void main
} // + class CapitalChallengeCh20
