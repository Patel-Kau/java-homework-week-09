package homeworkweek09;
/**
 * Java program to create a new array list, add some colours (string) and
 * printout the collection using for each loop.
 */

import java.util.ArrayList;

public class Programme_04_ColoursArrayList {

    public static void main(String[] args) {

// Array list object Creation and add data in array list
        ArrayList<Object> list = new ArrayList<>();
        list.add("Purple");
        list.add("Red");
        list.add("Green");
        list.add("Black");
        list.add("Yellow");
        list.add("White");
        list.add("Blue");
        list.add("Pink");

        // read one by one data from the array list and print it.
        for (Object a : list){
            System.out.println(a);
        }
    }
}