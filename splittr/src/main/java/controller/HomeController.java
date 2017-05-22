package controller;

import static org.springframework.web.bind.annotation.RequestMethod.*;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by sg-0036936 on 16/05/2017.
 */
@Controller //Declared to be a controller
public class HomeController {

    @RequestMapping(value="/", method=GET) //Handle GET requests for /
    public String home() {
        return "home"; //View name is home
    }
}