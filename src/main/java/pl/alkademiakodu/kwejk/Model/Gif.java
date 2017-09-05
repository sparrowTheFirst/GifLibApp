package pl.alkademiakodu.kwejk.Model;

/**
 * Created by User on 2017-09-04.
 */
public class Gif {
    private String name;
    private String username;
    private boolean isFavorite;

    public boolean isFavorite() {
        return isFavorite;
    }

    public void setFavorite(boolean favorite) {
        isFavorite = favorite;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Gif(String name, String username) {
        this.name = name;
        this.username = username;
    }

    public Gif(boolean isFavorite) {
        this.isFavorite = isFavorite;
    }
}
