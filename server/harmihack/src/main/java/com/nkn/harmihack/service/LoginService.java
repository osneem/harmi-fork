package com.nkn.harmihack.service;

import com.nkn.harmihack.dto.LoginSuccessDTO;
import com.nkn.harmihack.dto.PasswordDTO;
import org.springframework.stereotype.Service;

@Service
public class LoginService {

    private static final String password = "123";

    public LoginSuccessDTO checkPassword(PasswordDTO passwordDTO){
        if (passwordDTO.getPassword().equals(password)) {
            return new LoginSuccessDTO(true, "Sisse logimine õnnestus!");
        } else if (passwordDTO.getPassword().equals("")) {
            return new LoginSuccessDTO(false, "Sisesta parool!");
        } else {
            return new LoginSuccessDTO(false, "Vale parool!");
        }
    }
}
