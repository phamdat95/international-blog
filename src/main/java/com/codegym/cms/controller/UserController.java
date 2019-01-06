package com.codegym.cms.controller;

import com.codegym.cms.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class UserController {

    @GetMapping("login")
    public ModelAndView showLogin(){
        return new ModelAndView("Login","credential",new User());
    }

    @PostMapping("login")
    public ModelAndView showDashBoard(@ModelAttribute("credential") User user){
        if (user.getUseName().equals("admin") && user.getPassWord().equals("datdeptrai")){
            return new ModelAndView("DashBoard","user",user);
        } else {
            return new ModelAndView("redirect:login");
        }
    }
}
