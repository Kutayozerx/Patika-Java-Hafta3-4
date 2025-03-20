package main.java.collections_list;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListTest {

    public static void main(String[] args) {

        ArrayList<Integer> integers = new ArrayList<>(30);

        ArrayList<Integer> integers1 = new ArrayList<>();

        List<String> shopingList = new ArrayList<>();

        integers.add(123);
        integers.add(500);
        shopingList.add("apple");

        for (String s : shopingList) {
            System.out.println(s);
        }

        boolean isAppleRemoved = shopingList.remove("apple");
        System.out.println("isAppleRemoved:" + isAppleRemoved);

        ArrayList<String> shopingList2 = new ArrayList<>();
        shopingList2.add("Milk");

        shopingList.addAll(shopingList2);
        System.out.println(shopingList);

        System.out.println(shopingList.contains("Milk"));
        System.out.println("Alış-veris listenizde " + shopingList.size() + " adet ürün var ");

        System.out.println(shopingList.getLast());


        //-- LinkedList

        List<String> names = new LinkedList<>();

        LinkedList<String> linkedList = new LinkedList<>();
        names.add("kutay");
        names.add("patika");
        names.add("Java kursu");

        System.out.println(names);






    }
}
