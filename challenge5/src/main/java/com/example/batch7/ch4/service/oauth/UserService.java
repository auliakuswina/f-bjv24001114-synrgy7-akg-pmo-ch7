package com.example.batch7.ch4.service.oauth;

import com.example.batch7.ch4.dto.req.LoginModel;
import com.example.batch7.ch4.dto.req.RegisterModel;

import java.util.Map;

public interface UserService {
    Map registerManual(RegisterModel objModel) ;

    Map registerByGoogle(RegisterModel objModel) ;

    Map login(LoginModel objModel);
}
