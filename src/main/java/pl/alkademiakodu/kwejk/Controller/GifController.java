package pl.alkademiakodu.kwejk.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Created by User on 2017-09-04.
 */
@Controller
public class GifController {

    @GetMapping("/")
    public String home(){
        return "home";
    }
}
