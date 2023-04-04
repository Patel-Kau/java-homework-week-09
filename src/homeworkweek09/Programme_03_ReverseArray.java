package homeworkweek09;

import java.util.Arrays;
import java.util.Collections;

/**
 * This Java program to reverse an array of integer values.
 */
public class Programme_03_ReverseArray {

public static void reverseAnArray(Integer array[]){

    Collections.reverse(Arrays.asList(array));      // command to reverse the sequence of the array list and display
    System.out.println(Arrays.asList(array));

}
    public static void main(String[] args) {
        Integer[] a = {10, 20, 30, 40, 50, 60, 70};
        System.out.println(" Original array list: " + Arrays.toString(a));   //Original array list Display
        System.out.println("");
        System.out.print("Reversed Array list : ");             // Reverse array list Display from reverseAnArray static method
        reverseAnArray(a);

    }
}
