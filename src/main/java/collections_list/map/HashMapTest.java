package main.java.collections_list.map;

import java.util.HashMap;
import java.util.Map;


public class HashMapTest {

    public static void main(String[] args) {
        Map<String,Integer> students = new HashMap<>();
        students.put("Ali",85);
        students.put("Ayşe",90);
        students.put("Emir",75);

        System.out.println("Students: " + students);

        System.out.println("Ayşenin notu: " + students.get("Ayşe"));

        System.out.println("Keys:" + students.keySet());

        System.out.println("Values: " + students.values());

        students.remove("Kutay");

        students.put("Kutay",55);

        System.out.println("Students: " + students);

        students.remove("Kutay");

        System.out.println("Students: " + students);





    }


}
