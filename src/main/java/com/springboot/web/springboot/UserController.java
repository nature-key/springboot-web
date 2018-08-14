package com.springboot.web.springboot;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;

@Controller
public class UserController {
    @RequestMapping(value = "/user/home",method = RequestMethod.GET)
    @ResponseBody
    public String hello(){
        return  "hello word";
    }
    @ResponseBody
    @GetMapping(value = "/user/show")
    public String show(){
        return  "hello show";
    }
    @ResponseBody
    @GetMapping(value = "/user/ip")
    public String show3(HttpServletRequest request){
        System.out.println(request.getRemotePort());
        return  "hello show"+request.getRemotePort();
    }
    @ResponseBody
    @GetMapping(value = "/user/{id}")
    public String show2(@PathVariable("id") String id){
        return  "hello show2"+id;
    }
    @ResponseBody
    @PostMapping(value = "/user/create")
    public String create(@RequestParam(value = "username",defaultValue = "wangxuan") String username,@RequestParam(value = "password",required = false) String password){
        return "create hello+"+username+"password"+password;
    }


}
