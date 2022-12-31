package com.example.demo.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class firstController {
    @GetMapping("/hi")
    public String niceToMeetYou(Model model) {
        model.addAttribute("username", "raeun");
        return "greetings"; //templates/greeting.mustache
    }

    @GetMapping("/bye")
    public String seeYouNext(Model model){
        model.addAttribute("nickname","홍길동");
        return "goodbye";
    }

}
