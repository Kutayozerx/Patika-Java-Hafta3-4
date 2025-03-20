package main.java.collections_list.Ödevler.FilmAndCollectionFiltering;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class FilmTest {

    public static void main(String[] args) {

        List<Film> films = new ArrayList<>();

        Film film1 = new Film("Esaretin Bedeli",1994,"Drama",9.3);
        Film film2 = new Film(" Kara Şövalye",2008,"Action",9.0);
        Film film3 = new Film("Baba",1972,"Gangster",9.2);
        Film film4 = new Film("Dövüş Kulübü",1999,"Psychological Drama",8.8);
        Film film5 = new Film("Öfkeli Adam",1957,"Legal Drama",8.9);

        films.add(film1);
        films.add(film2);
        films.add(film3);
        films.add(film4);
        films.add(film5);

        films.sort(Comparator.comparingDouble(Film::getIMDBpuanı).reversed());
        System.out.println("IMDb Puanına Göre Sıralama: ");
        films.forEach(System.out::println);

        films.sort(Comparator.comparingInt(Film::getYayınYılı));
        System.out.println("\nYayın Yılına Göre Sıralama:");
        films.forEach(System.out::println);

        filterFilmsByGenre(films,"Drama");

    }
    public static void filterFilmsByGenre(List<Film> films, String filmTürü) {
        System.out.println("\n" + filmTürü + " Türündeki Filmler:");
        films.stream()
                .filter(f -> f.getFilmTürü().equalsIgnoreCase(filmTürü))
                .forEach(System.out::println);


    }

}
