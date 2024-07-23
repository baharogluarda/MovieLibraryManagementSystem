package film_yonetim_sistemi;

import java.util.LinkedList;

public class FilmRepo implements Repo<Movie> {

    LinkedList<Movie> film_listesi = new LinkedList<>();


    @Override
    public void add(Movie movie) {
        film_listesi.add(movie);
        System.out.println(movie.getTitle() + " isimli film eklendi");
    }


    @Override
    public void delete(int filmId) {
        boolean bulundu = false;
        for (Movie w : film_listesi) {
            if (w.getId() == filmId) {
                film_listesi.remove(w);
                System.out.println(w.getTitle() + " isimli film silindi");
                bulundu = true;
                break;
            }
        }
        if (!bulundu) {
            System.out.println("Böyle bir film bulunamadı");
        }
    }

    @Override
    public void update(Movie movie) {
        System.out.println(movie.getTitle() + " isimli film güncellendi");
    }

    @Override
    public void get() {
        for (Movie w : film_listesi){
            System.out.println(w);
        }
    }
}