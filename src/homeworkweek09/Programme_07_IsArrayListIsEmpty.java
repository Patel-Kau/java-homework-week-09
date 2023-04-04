package homeworkweek09;
/**
 * This program to test if an array list is empty or not.
 */

import java.util.ArrayList;

public class Programme_07_IsArrayListIsEmpty {

    public static void main(String[] args) {
        // Object declaration for Array
        ArrayList arrayList = new ArrayList();

        System.out.println("\nArray list : "+ arrayList);  // Check an Array list is empty or not and print the result
        boolean ans = arrayList.isEmpty();

        if(ans==true){
            System.out.println("Array List is Empty : ");
        }else{
            System.out.println("Array List is not Empty : ");
            }

        // Add elements in Array list and print the Array and result
        arrayList.add("Kauhsik");
        arrayList.add("Patel");
        arrayList.add("Automation Tester");
        System.out.println("\nArray list : "+ arrayList);
        boolean ans1 = arrayList.isEmpty();

        if(ans1==true){
            System.out.println("Array List is Empty : ");
        }else{
            System.out.println("Array List is not Empty : ");
        }
    }
}
