package com.stackroute.mvc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
public class UserController
{


    @RequestMapping("/login")
    public ModelAndView display(HttpServletRequest request, HttpServletResponse response,@ModelAttribute("user")User user)
    {
        String i=request.getParameter("name");
        String j=request.getParameter("password");

        ModelAndView mv=new ModelAndView("display");
        mv.addObject("result",user.getName());

        //Using ModelAndView we can send view along with object
        return mv;//new ModelAndView("welcome","name",user.getName());

    }
}
