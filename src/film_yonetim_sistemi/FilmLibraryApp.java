package film_yonetim_sistemi;

public class FilmLibraryApp {

    public static void main(String[] args) {
        Movie movie1 = new Movie(1000, "Harry Potter", "Mike Newell", 2000, "Fantastik", 8.4);
        Movie movie2 = new Movie(1001, "Harry Potter 2", "Mike Newell", 2000, "Fantastik", 8.4);
        FilmRepo library = new FilmRepo();
        library.add(movie1);
        library.add(movie2);
        library.delete(1001);

        library.get();


    }

}
