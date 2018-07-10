package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author haoming1
 * @Description:
 * @Date Created in 17:34 2018/7/4
 * @Modified By:
 */
@Controller
public class webController {

    @RequestMapping("/")
    @ResponseBody
    public String index(){
        return "Hello !";
    }

    @RequestMapping("/hello")
    public String helloHtml(Model model){
        model.addAttribute("title","Spring Boot！！！");
        return "hello";
    }

    @RequestMapping("/vue")
    @ResponseBody
    @CrossOrigin
    public String fromVue(){
        return "Hello,vue! There's Spring Boot!";
    }

}
