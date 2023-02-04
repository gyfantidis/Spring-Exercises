package net.yfantidis.exercise4.controllers;

import net.yfantidis.exercise4.models.User;
import net.yfantidis.exercise4.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class UserControllerTh2 {

    private final UserService userService;

    @Autowired
    public UserControllerTh2(UserService userService){
        this.userService = userService;
    }

    @GetMapping("/userth2")
    public String handlerRequest(Model model, @RequestParam("id") String id){
        User user = userService.getUser(Integer.parseInt(id));
        model.addAttribute("user",user);
        return "user2";
    }
}
