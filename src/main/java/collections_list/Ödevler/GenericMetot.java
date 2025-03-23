package main.java.collections_list.Ödevler;

public class GenericMetot {

    public static <T> void printArray(T[] array) {
            for (T eleman : array) {
                System.out.print(eleman + " ");
            }
            System.out.println();
        }

        public static void main(String[] args) {
            Integer[] intArray = {1, 2, 3, 4, 5};
            String[] strArray = {"Java", "Generics", "Ödev"};

            printArray(intArray);
            printArray(strArray);
        }
    }
