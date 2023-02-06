package net.yfantidis.exercise4.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/user4")
public class UserControllerTh4 {

    @RequestMapping(value="/url1", method= RequestMethod.GET)
    public String handleRequest(){
        System.out.println("/user4/url1");
        return "done";
    }

    @RequestMapping(value="/url2", method= RequestMethod.GET)
    public String handleRequest2(){
        System.out.println("/user4/url2");
        return "done";
    }

    @GetMapping("/url3")
    public String handleRequest3(){
        System.out.println("/user4/url2");
        return "done";
    }

    @GetMapping("/url4/{id}")
    public String handleRequest3(@PathVariable(value="id", required = false)String id){
        System.out.println("/user4/url4  " + id);
        return "done";
    }



}
