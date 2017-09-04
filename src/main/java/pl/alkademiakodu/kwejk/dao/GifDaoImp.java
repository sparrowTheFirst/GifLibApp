package pl.alkademiakodu.kwejk.dao;

import org.springframework.stereotype.Component;
import pl.alkademiakodu.kwejk.Model.Gif;

import java.util.List;

@Component
public class GifDaoImp implements GifDao {

    @Override
    public List<Gif> findByName(String name) {
        return null;
    }

    @Override
    public List<Gif> findAll() {
        return null;
    }
}
