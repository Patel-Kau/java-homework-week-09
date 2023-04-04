package homeworkweek09;

import java.util.ArrayList;

public class Programme_11_ArrayListAndCompare {


    public static void main(String[] args) {


        ArrayList<String> c1 = new ArrayList<>();
        c1.add("Red");
        c1.add("Green");
        c1.add("Black");
        c1.add("White");
        c1.add("Pink");

        ArrayList<String> c2 = new ArrayList<>();
        c2.add("Red");
        c2.add("Green");
        c2.add("Black");
        c2.add("Pink");

        ArrayList<String> c3 = new ArrayList<>();
        for (String temp : c1)
            c3.add(c2.contains(temp) ? "Yes" : "No");
        System.out.println(c3);

    }
}
