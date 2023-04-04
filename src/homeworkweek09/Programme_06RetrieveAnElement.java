package homeworkweek09;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *  This Java program to retrieve an element (at a specified index) from a given array list.
 */
public class Programme_06RetrieveAnElement {

    public static void main(String[] args) {

        Map<Integer, String> map = new HashMap();
        map.put(1, "United Kingdom");
        map.put(2, "India");
        map.put(3, "Australia");
        map.put(4, "Canada");
        map.put(5, "USA");
        map.put(6, "China");

        System.out.println(map);
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int a = sc.nextInt();

        System.out.println(map.get(a));
    }
}