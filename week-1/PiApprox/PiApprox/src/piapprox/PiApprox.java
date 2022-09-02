/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package piapprox;

/**
 *
 * @author idont
 */
public class PiApprox {

    public static void main(String[] args) {
        double pi = 4.0 * (1.0 - (1.0/3.0) + (1.0/5.0) - (1.0/7.0) + (1.0/9.0) - (1.0/11.0)); // approximate value of pi
        double test = 22.0/7.0; // another approximation of pi for testing
        
        // Display the results
        System.out.println(pi);
        System.out.println(test);
    } // void main
    
} // class PiApprox
