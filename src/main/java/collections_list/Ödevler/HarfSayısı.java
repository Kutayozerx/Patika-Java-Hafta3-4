package main.java.collections_list.Ödevler;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HarfSayısı {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Kelimeleri giriniz: ");
        String kelime = scanner.nextLine();
        scanner.close();

        Map<Character, Integer> harfSayacı = new HashMap<>();

        kelime = kelime.toLowerCase();

        for (char harf : kelime.toCharArray()) {
            if (Character.isLetter(harf)) {
                harfSayacı.put(harf, harfSayacı.getOrDefault(harf, 0) + 1);
            }
        }
        for (Map.Entry<Character, Integer> entry : harfSayacı.entrySet()) {
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }
    }
}
