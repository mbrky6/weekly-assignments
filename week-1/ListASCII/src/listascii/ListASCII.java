/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package listascii;

public class ListASCII {
    public static void main(String[] args) {
        int j = 1; // Counter
        
        // Loop through every ASCII character between ! and ~ and display them
        for (char i = 33; i < 127; i++) {
            
            // Move to a new line if the current line has 10 characters on it
            if (j > 10) {
                System.out.print("\n");
                j = 0;
            } // if (j == 10)
            else {
                System.out.print(i + " ");
            } // else
            j++;
        } // for (char i = 33; i < 127; i++)
    } // void main
} // class ListASCII
