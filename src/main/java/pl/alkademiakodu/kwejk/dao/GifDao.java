package pl.alkademiakodu.kwejk.dao;

import java.util.List;

public interface GifDao {
    List<Gift> findByName();
    List<Gift> findAll();
}
