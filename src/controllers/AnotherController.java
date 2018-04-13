package controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value = "/second", method = RequestMethod.GET)
public class AnotherController {

    public String s(ModelMap model){
        model.addAttribute("body","world");
        return "index";
    }
}
