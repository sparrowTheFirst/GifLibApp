package pl.akademiakodu.giflibapp.dao;

import org.springframework.stereotype.Component;
import pl.akademiakodu.giflibapp.Model.Category;
import pl.akademiakodu.giflibapp.Model.Gif;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by User on 2017-09-04.
 */
@Component
public class GifDaoImp implements GifDao {

    public GifDaoImp() {
    }

    private static List<String> names = new ArrayList<>();

    public static List<String> getNames() {
        return names;
    }

    static {
        names.add("android-explosion");
        names.add("ben-and-mike");
        names.add("compiler-bot");
        names.add("cowboy-coder");
        names.add("infinite-andrew");
    }

    @Override
    public List<Gif> findByName(String name) {
        return findAll().stream().filter((p) -> p.getName().equals(name)).collect(Collectors.toList());
    }

    @Override
    public List<Gif> findAll() {
        List<Gif> gifs = new ArrayList<>();
        int i = 1;
        for (String n : names) {
            Gif gif = new Gif(n, "Username " + i++);
            if (i % 2 == 0) {
                gif.setFavorite(true);
            } else {
                gif.setFavorite(false);
            }
            gifs.add(gif);
        }
        return gifs;
    }

    @Override
    public List<Gif> findFavorite() {
        List<Gif> gifs = new ArrayList<>();
        int i = 1;
        for (Gif gif : findAll()) {
            if (gif.isFavorite()) {
                gifs.add(gif);
            }
        }
        return gifs;
    }

    @Override
    public List<Category> addCategories() {
        List<Category> categories = new ArrayList<>();
        categories.add(new Category("People mems", 1));
        categories.add(new Category("Creature mems", 2));
        return categories;
    }
}
