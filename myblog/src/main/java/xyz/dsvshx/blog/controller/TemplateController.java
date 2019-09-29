package xyz.dsvshx.blog.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TemplateController {

    @GetMapping(value = {"/","/index"})
    public String index(){
        return "index";
    }

    @GetMapping(value = "login")
    public String login(){
        return "login";
    }
    @GetMapping("/fileUpload")
    public String fileUpload(){
        return "fileUpload";
    }

    @GetMapping("/video")
    public String video(){
        return "video";
    }

    @GetMapping("/editor")
    public String editor(){
        return "editor";
    }

}