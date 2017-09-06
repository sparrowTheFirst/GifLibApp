package pl.alkademiakodu.kwejk.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import pl.alkademiakodu.kwejk.Model.Category;
import pl.alkademiakodu.kwejk.dao.GifDao;

import java.util.List;

/**
 * Created by User on 2017-09-04.
 */
@Controller
public class GifController {

    @Autowired
    private GifDao gifDao;

    @GetMapping("/")
    public String home(ModelMap modelMap){
        modelMap.addAttribute("gifs", gifDao.findAll());
        return "home";
    }

    @GetMapping("/gif/{name}")
    public String homeResult (@PathVariable String name, ModelMap modelMap) {
        modelMap.addAttribute("gif", gifDao.findByName(name).get(0));
        return "gif-details";
    }

    @GetMapping("/search")
    public String search (@RequestParam String q, ModelMap modelMap){
        modelMap.addAttribute("gifs", gifDao.findByName(q));
        if ( gifDao.findByName(q).isEmpty())
            modelMap.addAttribute("comment", "Nic nie znaleziono!");
        return "home";
    }

    @GetMapping("/favorites")
        public String favoriteGifs(ModelMap modelMap){
        modelMap.addAttribute("gifs",gifDao.findFavorite());
        return "favorites";
    }

    @GetMapping("/categories")

    public String categories(ModelMap modelMap){
            modelMap.addAttribute("categories",gifDao.addCategories());
            return "categories";
    }

    @RestController
    @RequestMapping("/api")
    public class CategoryApiController{

        @Autowired
        private GifDao gifDao;

        @RequestMapping("/categories")
        public List<Category> getCategories(){
            return gifDao.addCategories();
        }
}
}
