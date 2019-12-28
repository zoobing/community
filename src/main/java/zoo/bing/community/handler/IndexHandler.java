package zoo.bing.community.handler;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexHandler {

    @GetMapping("/")
    public String goIndex(){
        return "index";
    }

}
