package com.example.html2.contoller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class htmlController {

    @GetMapping("/header")
    public String htmlController1(){
        return "header";
    }
    @GetMapping("/footer")
    public String htmlController2(){
        return "footer";
    }
    @GetMapping("/home")
    public String htmlController3(){
        return "home";
    }
    @GetMapping("/me")
    public String htmlController4(){ return "me";}
    @GetMapping("/team")
    public String htmlController5(){ return "team";}
    @GetMapping("/location")
    public String htmlController6(){ return  "location";}
    @GetMapping("/boardinfo")
    public String htmlController7(){ return  "boardinfo";}
    @GetMapping("/board")
    public  String htmlController8(){ return "board";}
    @GetMapping("/login")
    public  String htmlController9(){ return "login";}
    @GetMapping("/join")
    public String htmlController10(){ return "join";}
    @GetMapping("/editmy")
    public String htmlController11(){ return "editmy";}
    @GetMapping("/boardwrite")
    public String htmlController12(){ return "boardwrite";}
}
