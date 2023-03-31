package com.jwt.jwtauthentication.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
public class Home {

    @RequestMapping("/welcome")
    public String welcome()
    {
        String text = "This is private page ";
        text+= "this page is not allowed to unauthenticated users";
        return text;
    }

    //HardCoded user
    @RequestMapping("/getusers")
    public String getUser()
    {
        return "{\"name\":\"oggy\"}";
    }


}
