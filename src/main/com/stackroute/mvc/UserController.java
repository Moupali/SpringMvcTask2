package com.stackroute.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class UserController
{
    User user=new User("Moupali");
    @RequestMapping("/")
    public ModelAndView display()
    {
        ModelAndView mv=new ModelAndView("display");
        mv.addObject("name",user.getName());
        return mv;
    }
}
