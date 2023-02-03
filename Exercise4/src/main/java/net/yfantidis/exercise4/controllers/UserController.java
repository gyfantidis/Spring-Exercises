package net.yfantidis.exercise4.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class UserController {
    @GetMapping("/user")
    @ResponseBody

    public String handleUserRequest(@RequestParam("id") String id){
        return
                "<html>"+
                        "<head>"+
                        "<title>Yfantidis test Spring </title>"+
                        "</head>"+
                        "<body>"+
                        "<h1>Hello User " +id+"!</h1>"+
                        "</body>"+
                        "</html>";
    }

    public String handleUserRequest(){
        return
                "<html>"+
                        "<head>"+
                        "<title>Yfantidis test Spring </title>"+
                        "</head>"+
                        "<body>"+
                        "<h1>Hello User !</h1>"+
                        "</body>"+
                        "</html>";
    }
}
