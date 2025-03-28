package main.java.collections_list.set;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class BookSetTest {

    public static void main(String[] args) {
        Set<Book> bookSet = new HashSet<>();

        Book book1 = new Book("Clean Code","Robert C.Martin");
        Book book2 = new Book("Effective Java","Jashua Bloch");
        Book book3 = new Book("Clean Code -2","Robert C.Martin");
        Book book4 = new Book("Clean Code","Robert C.Martin");


        bookSet.add(book1);
        bookSet.add(book2);
        bookSet.add(book3);
        bookSet.add(book4);


        System.out.println(book1.hashCode()); //-
        System.out.println(book2.hashCode());
        System.out.println(book3.hashCode());
        System.out.println(book4.hashCode());

        System.out.println("Kütüphanem: " + bookSet);
        System.out.println("Kütüphanem: " + bookSet.size() + " adet kitap var");



        //TreeSet

        Set<Book> bookTreeSet = new TreeSet<>();

        bookTreeSet.add(book1);
        bookTreeSet.add(book2);
        bookTreeSet.add(book3);
        bookTreeSet.add(book4);


        System.out.println("Kütüphanem: " + bookSet);

    }
}
