package com.example.batch7.ch4.dto.req;

import lombok.Data;


@Data
public class ResetPasswordModel {
    public String email;

    public String otp;
    public String newPassword;
}