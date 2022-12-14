package gradescollectionstream;

import java.util.*;
import java.util.stream.*;

public class GradesCollectionStream {

    public static void main(String[] args) {
        // Get the number of students from the user
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of students in the class: ");
        int studentNum = input.nextInt();
        
        // Create an array to store each student's score
        int[] scores = new int[studentNum];
        
        List<Integer> students = new ArrayList<>();
        
        // Prompt the user to populate the array
        for (int i = 0; i < studentNum; i++) {
            System.out.print("Insert grade for student " + (i + 1) + ": ");
            int g = input.nextInt();
            scores[i] = g;
            students.add(i);
        } // for
        
        int best = IntStream.of(scores).max().getAsInt();
        
        // Create another array to score each student's grade
        char[] grades = new char[studentNum];
        
        // Calculate the grades of each student using the best grade as a reference
        for (int i = 0; i < studentNum; i++) {
            if (scores[i] >= best - 10) {
                grades[i] = 'A';
            } // if
            else if (scores[i] >= best - 20) {
                grades[i] = 'B';
            } // else if
            else if (scores[i] >= best - 30) {
                grades[i] = 'B';
            } // else if
            else if (scores[i] >= best - 40) {
                grades[i] = 'D';
            } // else if
            else {
                grades[i] = 'F';
            } // else
        } // for
        
        System.out.println("");
        students.stream().forEach(i -> System.out.println("Grade for student " + (i + 1) + " is " + scores[i] + " (" + grades[i] + ")"));
        
    } // + static void main
    
} // + class GradesCollectionStream
