package film_yonetim_sistemi;

public interface Repo <T>{

    void add(T t);
    void delete(int id);
    void update(T t);
    void get();


}
