package superaaron;/* Created by superaaron on 11/30/14. */

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {

    @RequestMapping("/testing123")
    public String showHello(){
        return "hello2";
    }
}
