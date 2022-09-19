/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package emphoursarray;
import java.util.Arrays;
import java.util.Collections;

public class EmpHoursArray {

    public static void main(String[] args) {
        // Two-dimensional array that contains hours worked each day by employee
        Integer[][] hours = {
            {2, 4, 3, 4, 5, 8, 8},
            {7, 3, 4, 3, 3, 4, 4},
            {3, 3, 4, 3, 3, 2, 2},
            {9, 3, 4, 7, 3, 4, 1},
            {3, 5, 4, 3, 6, 3, 8},
            {3, 4, 4, 6, 3, 4, 4},
            {3, 7, 4, 8, 3, 8, 4},
            {6, 3, 5, 9, 2, 7, 9},
        };
        
        // One-dimensional array that contains the total hours worked by employee
        Integer[] totalHours = new Integer[8];
        
        // Add all the hours each employee worked, then add the total to the totalHours array
        for (int i = 0; i < totalHours.length; i++) {
            Integer total = 0;
            for (Integer h : hours[i]) {
                total += h;
            } // for
            totalHours[i] = total;
        } // for
        
        // Two-dimensional array that contains each employee and the number of hours they worked last week
        Integer[][] employees = {
            {totalHours[0], 1}, // I'm starting with 1 because there's no such thing as zeroth
            {totalHours[1], 2},
            {totalHours[2], 3},
            {totalHours[3], 4},
            {totalHours[4], 5},
            {totalHours[5], 6},
            {totalHours[6], 7},
            {totalHours[7], 8},
        }; // Integer[][] employees
        
        // Sort the second 2D array into descending order
        Arrays.sort(employees, (Integer[] entry1, Integer[] entry2) -> {
            final Integer time1 = entry1[0];
            final Integer time2 = entry2[0];
            return time1.compareTo(time2);
        } // Lambda
        ); // Arrays.sort(employees)
        
        Collections.reverse(Arrays.asList(employees));
        
        // Display each employee and how long they worked last week
        for (Integer[] employee : employees) {
            System.out.println("Employee " + employee[1] + " worked " + employee[0] + " hours last week.");
        } // for
    } // void main
} // class EmpHoursArray
