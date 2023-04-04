package homeworkweek09;

import java.util.HashSet;

public class Programme_08_HashSet {
    public static void main(String[] args) {
        HashSet<Integer> num = new HashSet<>();
        num.add(4);
        num.add(7);
        num.add(8);

        // Show which numbers between 1 and 10 are in the set
        for (int i = 1; i <= 10; i++) {
            if (num.contains(i)) {
                System.out.println(i + " Number was found in the set.");
            } else {
//                System.out.println(i + " Number was not found in the set.");
            }

        }
    }
}
//    // Create a HashSet object called numbers
//    HashSet<Integer> numbers = new HashSet<Integer>();
//
//// Add values to the set
//    numbers.add(4);
//            numbers.add(7);
//            numbers.add(8);
//
//            // Show which numbers between 1 and 10 are in the set
//            for(int i = 1; i <= 10; i++) {
//            if(numbers.contains(i)) {
//            System.out.println(i + " was found in the set.");
//            } else {
//            System.out.println(i + " was not found in the set.");
//            }
//            }