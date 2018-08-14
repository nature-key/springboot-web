package com.springboot.web.springboot;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Reg {
    @GetMapping("/reg")
    public String reg() {
        return "reg";
    }
}
