package com.nkn.harmihack.service;

import com.nkn.harmihack.dto.LoginSuccessDTO;
import com.nkn.harmihack.dto.PasswordDTO;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class LoginService {

    @Value("${admin.password}")
    private String password;

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
