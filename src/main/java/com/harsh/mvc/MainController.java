package com.harsh.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {
    @GetMapping("/")
    public String homepage(Model myModel){
        String str = "Hello World!";
        myModel.addAttribute("message", str);
        return "home";
    }


    @GetMapping("/showform")
    public String form(){
        return "helloworld-form";
    }

    @PostMapping("/processform")
    public String processForm(@RequestParam("name") String theName, Model model){
        model.addAttribute("name", theName.toUpperCase());
        return "helloworld";
    }
}
