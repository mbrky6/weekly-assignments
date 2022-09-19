package gradeslist;

import java.util.Scanner;
import java.util.ArrayList;

public class GradesList {
    public static void main(String[] args) {
        // Get the number of students from the user
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of students in the class: ");
        int studentNum = input.nextInt();
        
        // ArrayList to store students' scores
        ArrayList<Integer> scores = new ArrayList<>();
        
        // Populate the scores ArrayList with user inputs
        for (int i = 0; i < studentNum; i++) {
            System.out.print("Insert grade for student " + (i + 1) + ": ");
            int g = input.nextInt();
            scores.add(g);
        } // for
        
        // Find the highest score
        int best = 0;
        for (Integer score : scores) {
            if (score > best) {
                best = score;
            } // if
        } // for
        
        // Create another ArrayList & and Iterator to store each student's grade
        ArrayList<String> grades = new ArrayList<>();
        
        // Calculate the grades of each student using the best grade as a reference
        for (Integer score : scores) {
            if (score >= best - 10) {
                grades.add("A");
            } // if
            else if (score >= best - 20) {
                grades.add("B");
            } // else if
            else if (score >= best - 30) {
                grades.add("C");
            } // else if
            else if (score >= best - 40) {
                grades.add("D");
            } // else if
            else {
                grades.add("F");
            } // else
        } // for
        
        // Display all students' grades
        for (int k = 0; k < studentNum; k++) {
            System.out.println("\nGrade for student " + (k + 1) + " is " + scores.get(k) + " (" + grades.get(k) + ")");
        } // for
        
    } // void main
} // class GradesList
