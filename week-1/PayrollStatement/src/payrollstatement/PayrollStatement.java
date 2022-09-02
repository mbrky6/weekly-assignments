/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package payrollstatement;

import java.util.Scanner;

public class PayrollStatement {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // Ask user for employee information, then store the answers in variables
        System.out.print("Enter employee's name: ");
        String name = input.next();
        System.out.print("\nEnter hours worked in a week: ");
        double hours = input.nextDouble();
        System.out.print("\nEnter hourly pay rate: ");
        double rate = input.nextDouble();
        System.out.print("\nEnter federal tax withholding rate: ");
        double withFed = input.nextDouble();
        System.out.print("\nEnter state tax withholding rate: ");
        double withState = input.nextDouble();
        
        // Calculate pay and deductions
        double grossPay = (rate * hours);
        double dedFed = (grossPay * withFed);
        double dedState = (grossPay * withState);
        double netPay = (grossPay - dedFed - dedState);
        
        // Relay the data back to the user
        System.out.print("\nEmployee name: " + name);
        System.out.print("\nHours worked: " + hours);
        System.out.printf("\nPay Rate: $%4.2f", rate);
        System.out.printf("\nGross Pay: $%5.2f", grossPay);
        System.out.print("\nDeductions:");
        System.out.printf("\n  Federal withholding (%4.1f %%): $%4.2f", (withFed * 100), dedFed);
        System.out.printf("\n  State withholding (%4.1f %%): $%4.2f", (withState * 100), dedState);
        System.out.printf("\n  Total deduction: $%5.2f", (dedFed + dedState));
        System.out.printf("\n Net Pay: $%5.2f\n", netPay);
        
    } // void main
} // class PayrollStatement
