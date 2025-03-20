package main.java.collections_list.Ödevler;

import java.util.ArrayList;
import java.util.List;


public class CloseNumbers {

    public static void main(String[] args) {
        List<Integer> closeNumbers = new ArrayList<>();

        closeNumbers.add(10);
        closeNumbers.add(18);
        closeNumbers.add(22);
        closeNumbers.add(30);
        closeNumbers.add(60);
        closeNumbers.add(150);
        closeNumbers.add(222);
        closeNumbers.add(45);
        closeNumbers.add(250);
        closeNumbers.add(175);

        int minDiff = Integer.MAX_VALUE;
        int closest1 = 0, closest2 = 0;

        for (int i = 0; i < closeNumbers.size(); i++) {
            for (int j = i + 1; j < closeNumbers.size(); j++) {
                int diff = Math.abs(closeNumbers.get(i) - closeNumbers.get(j));
                if (diff < minDiff) {
                    minDiff = diff;
                    closest1 = closeNumbers.get(i);
                    closest2 = closeNumbers.get(j);
                }
            }
    }
        System.out.println("Liste: " + closeNumbers);
        System.out.println("En yakın iki eleman: " + closest1 + " ve " + closest2);

    }
}
