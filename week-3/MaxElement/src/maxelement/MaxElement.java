package maxelement;

import java.util.Scanner;

public class MaxElement {
    public static <E extends Comparable<E>> E max(E[] list) {
        E currentMax = list[0];
        for (int i=0; i<list.length; i++) {
            if (currentMax.compareTo(list[i]) < 0) {
                currentMax = list[i];
            } // if
        } // for
        return currentMax;
    } // + static E max
    
    public static void main(String[] args) {
        //{10, 240, 11, 256, 99, 8, 88, 888, 96, 69}
        Integer[] gather = new Integer[10];
        Scanner input = new Scanner(System.in);
        System.out.println("Enter " + gather.length + " integers:\n");
        
        for (int i=0; i<gather.length; i++) {
            gather[i] = input.nextInt();
        } // for
        
        System.out.println("\nThe largest integer is " + max(gather));
    } // + void main
} // + class MaxElement
