package com.nkn.harmihack.controller;

import com.nkn.harmihack.dto.GreetingDTO;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class LoginPageController {
    private static final String password = "harmihack";
    private int counter = 0;

    @GetMapping("/")
    @ResponseBody
    public GreetingDTO sayHello(@RequestParam(name="name", required=false, defaultValue="Harmihacker") String name) {
        counter++;
        return new GreetingDTO(counter, "Tere tulemast harmihacki API-sse, " + name + "! Sa oled meie " + counter + "-s külastaja!");
    }
}
