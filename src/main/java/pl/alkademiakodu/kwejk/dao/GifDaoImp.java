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

    private static List<String> names = new ArrayList<>();


    static {
        names.add("android-explosion");
        names.add("ben-and-mike");
        names.add("compiler-bot");
        names.add("cowboy-coder");
        names.add("infinite-andrew");
    }

    @Override
    public List<Gif> findByName(String name) {
        return null;
    }

    @Override
    public List<Gif> findAll(){
        List<Gif> gifs=new ArrayList<>();
        int i=1;
        for (String n : names) {
            gifs.add(new Gif(n,"Username"+i++));

        }return gifs;

    }
}
