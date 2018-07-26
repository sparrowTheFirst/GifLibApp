package pl.akademiakodu.giflibapp.dao;

import pl.akademiakodu.giflibapp.Model.Category;
import pl.akademiakodu.giflibapp.Model.Gif;

import java.util.List;

public interface GifDao {

    List<Gif> findByName(String name);
    List<Gif> findAll();
    List<Gif> findFavorite();
    List<Category> addCategories();
}
