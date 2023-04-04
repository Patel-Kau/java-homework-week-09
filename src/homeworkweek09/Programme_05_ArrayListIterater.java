package homeworkweek09;
/**
 *  This Java program to iterate through all elements in an array list using Iterator.
 */

import java.util.ArrayList;
import java.util.ListIterator;

public class Programme_05_ArrayListIterater {

    public static void main(String[] args) {
// Create an Array list object and add elements in an Array list
        ArrayList<String> car = new ArrayList<>();
        car.add("Honda");
        car.add("Toyota");
        car.add("BMW");
        car.add("Audi");
        car.add("Vauxhull");
        car.add("Ford");

// Iterate an array list using while loop iterator

        ListIterator<String>iterate = car.listIterator();
        while(iterate.hasNext()){
            System.out.println(iterate.next());
        }

    }
}
