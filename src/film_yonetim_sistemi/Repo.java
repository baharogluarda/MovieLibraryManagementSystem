package film_yonetim_sistemi;

import java.util.List;

public interface Repo <T>{

    void add(T t);
    void delete(int id);
    void updateRating(int id);
    void get();


}
