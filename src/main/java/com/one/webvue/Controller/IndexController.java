package com.one.webvue.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/*
- 

- Coding By One ON 08/28
*/
@Controller
public class IndexController {
    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("eventName", "FIFA 2015");
        return "index";
    }
}
