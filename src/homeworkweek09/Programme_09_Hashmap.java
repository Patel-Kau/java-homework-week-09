package homeworkweek09;

import java.util.HashMap;
import java.util.Map;

public class Programme_09_Hashmap {


    public static void main(String[] args) {

        Map<String, Integer> people = new HashMap<>();
        people.put("Sagar",1);
        people.put("Kaushik",2);
        people.put("Aesha",3);
        people.put("Ameet",4);
        people.put("Kashyap",5);
        people.put("Ronak",6);
        people.put("Himanshu",7);
        people.put("Vishvesh",8);

for(Map.Entry<String, Integer> p : people.entrySet()){
    System.out.println(p.getKey()+" " +p.getValue());
}

    }
}
