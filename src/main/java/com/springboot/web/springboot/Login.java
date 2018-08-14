package com.springboot.web.springboot;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class Login {
    @PostMapping("login")
    public String Login(@RequestParam("username") String username, @RequestParam("password") String password) {
        if (username.equals("root")) {
            return "ok";
        }
        return "faill";
    }

    @GetMapping("loginIndex")
    public String login(Model model) {
        model.addAttribute("username", "root");
        return "login";
    }
}
