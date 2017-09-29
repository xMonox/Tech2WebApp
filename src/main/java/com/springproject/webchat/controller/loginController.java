package com.springproject.webchat.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class loginController {
    @RequestMapping("/userName")
    public String userName(@RequestParam(value="name", required=false, defaultValue="Chat")String name, Model model) {
        model.addAttribute("name", name);
        return "userName";
    }
}
