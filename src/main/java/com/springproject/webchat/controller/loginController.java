package com.springproject.webchat.controller;

import com.springproject.webchat.model.User;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

@RestController
public class loginController {

    /*@RequestMapping("/userName")
    public User userName(@RequestParam(value="name", required=false, defaultValue="userName")String name, Model model) {
        //model.addAttribute("name", name);
        return new User(name);
    }*/

    //@RequestMapping
    @RequestMapping(value = "/", method = GET)
    public String index() {
        return "index";
    }
}
