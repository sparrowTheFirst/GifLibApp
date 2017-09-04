package pl.alkademiakodu.kwejk.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import pl.alkademiakodu.kwejk.dao.GifDao;

/**
 * Created by User on 2017-09-04.
 */
@Controller
public class GifController {

    @Autowired
    private GifDao gifDao;

    @GetMapping("/")
    public String home(ModelMap modelMap){
        modelMap.addAttribute("gifs",gifDao.findAll());
        return "home";
    }

    @GetMapping("/gif/{name}")
    public String homeResult (@PathVariable String name, ModelMap modelMap) {
        modelMap.addAttribute("gif",gifDao.findByName(name));
        return "gif-details";
    }
}
