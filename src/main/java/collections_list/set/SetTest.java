package main.java.collections_list.set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetTest {

    public static void main(String[] args) {

        Set<String> fruits = new HashSet<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");
        fruits.add("Apple");
        fruits.add(null);

        System.out.println("Fruits: " + fruits);


        //LinkedinHashSet

        LinkedHashSet<String> cities = new LinkedHashSet<>();
        cities.add("İstanbul");
        cities.add("Ankara");
        cities.add("İzmir");
        cities.add("İstanbul");

        System.out.println("cities" + cities);

        //TreeSet

        Set<Integer> numbers = new TreeSet<>();

        numbers.add(10);
        numbers.add(5);
        numbers.add(20);
        numbers.add(15);

        System.out.println("Numbers:" + numbers);

        Set<String> cars = new TreeSet<>();
        cars.add("BMW");
        cars.add("Mercedes");
        cars.add("Audi");

        System.out.println("Cars: " + cars);

        cars.remove("Audi");

        System.out.println("Size: " + cars.size());

        cars.clear();

        System.out.println("Cars: " + cars);

        System.out.println(cars.isEmpty());



    }
}
