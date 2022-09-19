/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package gradesarray;

import java.util.Scanner;

public class GradesArray {
    public static void main(String[] args) {
        // Get the number of students from the user
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of students in the class: ");
        int studentNum = input.nextInt();
        
        // Create an array to store each student's score
        Integer[] scores = new Integer[studentNum];
        
        // Prompt the user to populate the array
        for (int i = 0; i < scores.length; i++) {
            System.out.print("Insert grade for student " + (i + 1) + ": ");
            int g = input.nextInt();
            scores[i] = g;
        } // for
        
        // Find the highest score
        int best = 0;
        for (Integer score : scores) {
            if (score > best) {
                best = score;
            } // if
        } // for
        
        // Create another array to score each student's grade
        String[] grades = new String[studentNum];
        
        // Calculate the grades of each student using the best grade as a reference
        for (int i = 0; i < grades.length; i++) {
            if (scores[i] >= best - 10) {
                grades[i] = "A";
            } // if
            else if (scores[i] >= best - 20) {
                grades[i] = "B";
            } // else if
            else if (scores[i] >= best - 30) {
                grades[i] = "C";
            } // else if
            else if (scores[i] >= best - 40) {
                grades[i] = "D";
            } // else if
            else {
                grades[i] = "F";
            } // else
        } // for
        
        // Display all students' grades
        for (int k = 0; k < grades.length; k++) {
            System.out.println("\nGrade for student " + (k + 1) + " is " + scores[k] + " (" + grades[k] + ")");
        } // for
        
    } // void main
} // class GradesArray
