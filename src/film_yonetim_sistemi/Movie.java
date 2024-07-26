package film_yonetim_sistemi;

public class Movie {

    private int id;
    private String title;
    private String director;
    private int releaseYear;
    private String genre;
    private double rating;

    public Movie(int id, String title, String director, int releaseYear, String genre, double rating) {
        this.id = id;
        this.title = title;
        this.director = director;
        this.releaseYear = releaseYear;
        this.genre = genre;
        this.rating = rating;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    @Override
    public String toString() {
        // Rating için özel format
        String ratingStr = String.format("%.1f", rating);

        // Film bilgilerini istediğiniz formatta döndürme
        return String.format("%-5d | %-30s | %-20s | %-4d | %-10s | %s",
                id, title, director, releaseYear, genre, ratingStr);
    }
}
