package com.nkn.harmihack.controller;

import com.nkn.harmihack.dto.GreetingDTO;
import com.nkn.harmihack.dto.LoginSuccessDTO;
import com.nkn.harmihack.dto.PasswordDTO;
import com.nkn.harmihack.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Objects;

@Controller
public class LoginPageController {

    @Autowired
    LoginService loginService;
    private int counter = 0;

    @CrossOrigin(origins = "http://localhost:3000")
    @GetMapping("/")
    @ResponseBody
    public GreetingDTO sayHello(@RequestParam(name="name", required=false, defaultValue="Harmihacker") String name) {
        counter++;
        return new GreetingDTO(counter, "Tere tulemast harmihacki API-sse, " + name + "! Sa oled meie " + counter + "-s külastaja!");
    }

    @CrossOrigin(origins = "http://localhost:3000")
    @PostMapping("/login")
    @ResponseBody
    public LoginSuccessDTO login(@RequestBody PasswordDTO passwordDTO) {
        return loginService.checkPassword(passwordDTO);
    }
}
