package resume.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class RemoveDataController {

    @RequestMapping(value = "/remove", method = RequestMethod.GET)
    public String getRemove() {
        return "delete-profile";
    }

    @RequestMapping(value = "/remove", method = RequestMethod.POST)
    public String postRemove() {
        return "main";
    }
}
