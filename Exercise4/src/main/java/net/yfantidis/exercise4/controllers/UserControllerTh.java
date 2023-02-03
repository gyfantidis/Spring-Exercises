package net.yfantidis.exercise4.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class UserControllerTh {

    @GetMapping("/userth")
    public String handleRequest(Model model, @RequestParam("id") String id){
        model.addAttribute("id",id);
        return "user";
    }
}
