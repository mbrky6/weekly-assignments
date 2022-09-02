/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package feetmeters;

/**
 *
 * @author idont
 */
import java.util.Scanner;

public class FeetMeters {

    public static void main(String[] args) {
        double convert = 0.305; // Constant to convert feet into meters
        Scanner receive = new Scanner(System.in); // Scanner to receive input
        
        System.out.print("Enter a value in feet: ");
        double input = receive.nextDouble();
        System.out.println(input + " feet is equal to " + (input * convert) + " meters.");
    } // void main
    
} // class FeetMeters
