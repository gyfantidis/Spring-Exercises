package net.yfantidis.exercise4.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class RootController {

    @GetMapping("/")
    @ResponseBody

    public String handleRequest(){
        return
                "<html>"+
                        "<head>"+
                        "<title>Yfantidis test Spring </title>"+
                        "</head>"+
                        "<body>"+
                        "<h1>Welcome to testing!</h1>"+
                        "</body>"+
                        "</html>";
    }
}
