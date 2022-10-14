package binaryformat;

import java.util.Scanner;

class BinaryFormatException extends Exception {
    private String entry;
    
    public BinaryFormatException(String entry) {
        super("String " + entry + " is not a binary number.");
        this.entry = entry;
    } // + BinaryFormatException
    
    public String getEntry() {
        return entry;
    } // + String getEntry
} // class BinaryFormatException

class BinaryToDecimal {
    public BinaryToDecimal(String entry) throws BinaryFormatException{
        this.bin2dec(entry);
    } // + BinaryToDecimal
        
    public void bin2dec(String binaryNumber) throws BinaryFormatException {
        try {
            int decimalNumber = Integer.parseInt(binaryNumber, 2);
            System.out.println(decimalNumber);
        } // try
        catch(NumberFormatException e) {
            throw new BinaryFormatException(binaryNumber); // I caught the error to throw the error
        } // catch
    }

} // class BinaryToDecimal

public class BinaryFormat {

    public static void main(String[] args) throws BinaryFormatException {
        Scanner input = new Scanner(System.in);
        BinaryToDecimal convert = new BinaryToDecimal(input.next());
    } // + void main
} // + class BinaryFormat
