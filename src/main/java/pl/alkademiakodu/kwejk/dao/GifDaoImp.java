package pl.alkademiakodu.kwejk.dao;

import org.springframework.stereotype.Component;
import pl.alkademiakodu.kwejk.Model.Gif;

import java.util.ArrayList;
import java.util.List;


/**
 * Created by User on 2017-09-04.
 */
@Component
public class GifDaoImp implements GifDao {

    public GifDaoImp(){}

    private static List<String> name = new ArrayList<>();


    static {
        name.add("android-explosion");
        name.add("ben-and-mike");
        name.add("book-dominos");
        name.add("compiler-bot");
        name.add("cowboy-coder");
        name.add("infinite-andrew");
    }

    @Override
    public List<Gif> findByName(String name) {
        return null;
    }

    @Override
    public List<Gif> findAll(){
        List<Gif> gifs=new ArrayList<>();
        int i=1;
        for (String name:name) {
            gifs.add(new Gif(name,"Username"+i++));

        }return gifs;

    }
}
