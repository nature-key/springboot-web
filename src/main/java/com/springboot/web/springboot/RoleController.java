package com.springboot.web.springboot;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RoleController {

    @GetMapping("/user/show1")
    public String showtest(){
        return  "hello show22";
    }
}
