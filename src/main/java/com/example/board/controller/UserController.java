package com.example.board.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class UserController {
    // http://localhost:/8080/userRegForm
    // classPath:/templates/userRegForm.html
    @GetMapping("/userRegForm")
    public String userRegForm(){
        return "userRegForm";
    }

    @PostMapping("/userReg")
    public String userReg(
            @RequestParam("name") String name,
            @RequestParam("email") String email,
            @RequestParam("password") String password
    ){
        System.out.println("name : " + name);
        System.out.println("email : " + email);
        System.out.println("password : " + password);
        return "redirect:/welcome"; // 브라우저에게 자동으로 http://localhost:8080/welcome으로 이동
    }

    // http://localhost:8080/welcome
    @GetMapping("/welcome")
    public String Welcome(){
        return "/welcome";
    }
}
