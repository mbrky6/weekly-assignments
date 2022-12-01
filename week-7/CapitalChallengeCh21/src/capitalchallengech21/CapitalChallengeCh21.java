package capitalchallengech21;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class CapitalChallengeCh21 {

    public static void main(String[] args) {
        Map<String, String> questions = new HashMap<>();
        
        questions.put("Alabama", "Montgomery");
        questions.put("Alaska", "Juneau");
        questions.put("Arizona", "Phoenix");
        questions.put("Arkansas", "Little Rock");
        questions.put("California", "Sacramento");
        questions.put("Colorado", "Denver");
        questions.put("Connecticut", "Hartford");
        questions.put("Delaware", "Dover");
        questions.put("Florida", "Tallahassee");
        questions.put("Georgia", "Atlanta");
        questions.put("Hawaii", "Honolulu");
        questions.put("Idaho", "Boise");
        questions.put("Illinois", "Springfield");
        questions.put("Indiana", "Indianapolis");
        questions.put("Iowa", "Des Moines");
        questions.put("Kansas", "Topeka");
        questions.put("Kentucky", "Frankfort");
        questions.put("Louisiana", "Baton Rouge");
        questions.put("Maine", "Augusta");
        questions.put("Maryland", "Annapolis");
        questions.put("Massachusetts", "Boston");
        questions.put("Michigan", "Lansing");
        questions.put("Minnesota", "St Paul");
        questions.put("Mississippi", "Jackson");
        questions.put("Missouri", "St Louis");
        questions.put("Montana", "Helena");
        questions.put("Nebraska", "Lincoln");
        questions.put("Nevada", "Carson City");
        questions.put("New Hampshire", "Concord");
        questions.put("New Jersey", "Trenton");
        questions.put("New Mexico", "Santa Fe");
        questions.put("New York", "Albany");
        questions.put("North Carolina", "Raleigh");
        questions.put("North Dakota", "Bismarck");
        questions.put("Ohio", "Columbus");
        questions.put("Oklahoma", "Oklahoma City");
        questions.put("Oregon", "Salem");
        questions.put("Pennsylvania", "Harrisburg");
        questions.put("Rhode Island", "Providence");
        questions.put("South Carolina", "Columbia");
        questions.put("South Dakota", "Pierre");
        questions.put("Tennessee", "Nashville");
        questions.put("Texas", "Austin");
        questions.put("Utah", "Salt Lake City");
        questions.put("Vermont", "Montpelier");
        questions.put("Virginia", "Richmond");
        questions.put("Washington", "Olympia");
        questions.put("West Virginia", "Charleston");
        questions.put("Wisconsin", "Madison");
        questions.put("Wyoming", "Cheyenne");
        
        Set<String> states = questions.keySet();
        
        Scanner keyboard = new Scanner(System.in);
        int score = 0;
        
        System.out.println("Welcome to the Capital Challenge. When answering, please exclude characters such as periods or apostrophes.");
        for (String state:states) {
            System.out.println("What is the capital of " + state + "? ");
            
            if (keyboard.nextLine().equals(questions.get(state))) {
                System.out.println("That's correct. The capital of " + state + " is " + questions.get(state) + ".\n");
                score++;
            } // if (the player guessed correctly)
            else {
                System.out.println("Sorry. The capital of " + state + " is actually " + questions.get(state) + ".\n");
            } // else
        } // for (question in questions)
        
        System.out.println("Thanks for playing! You got " + score + " out of " + questions.size() + " state capitals correct.");
        
    } // + static void main
} // + class CapitalChallengeCh21
