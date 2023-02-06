package net.yfantidis.exercise4.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class UserControllerTh3Double {

    @RequestMapping(value="/user3/{userId}", method = RequestMethod.GET)
    public String handlerRequest(@PathVariable int userId){
        System.out.println("User id=" + userId);
        return "done";
    }

    @RequestMapping(value = "/user3/{userId}/preferences/{prefId}", method = RequestMethod.GET)
    public String handlerRequest(@PathVariable int userId, @PathVariable int prefId){
        System.out.println("User Id=" + userId + ". Pref Id=" +prefId );
        return "done";
    }

    @RequestMapping(value="/user3/???", method=RequestMethod.GET)
    public String handlerRequest(){
        return "done";
    }

}
