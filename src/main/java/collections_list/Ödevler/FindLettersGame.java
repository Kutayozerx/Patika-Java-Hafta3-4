package main.java.collections_list.Ödevler;

import java.util.ArrayList;
import java.util.Scanner;

public class FindLettersGame {

    public static void main(String[] args) {

        ArrayList<String> letters = new ArrayList<>();

        letters.add("a");
        letters.add("b");
        letters.add("c");
        letters.add("d");

        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 4; i++) {
            System.out.print("Bir harf giriniz: ");
            String input = scanner.next();

            int index = letters.indexOf(input);
            if (index != -1) {
                letters.set(index, "found");
            } else {
                letters.add(input);
            }
        }

        System.out.println("Güncellenmiş liste: " + letters);
    }
}
