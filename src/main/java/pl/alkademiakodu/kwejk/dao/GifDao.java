package pl.alkademiakodu.kwejk.dao;

import pl.alkademiakodu.kwejk.Model.Gif;

import java.util.List;

public interface GifDao {
    List<Gif> findByName(String name);
    List<Gif> findAll();
}
