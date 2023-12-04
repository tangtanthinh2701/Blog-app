package com.springboot.blog.springbootblogrestapi.payload;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
//@Data
public class LoginDto {
    private String usernameOrEmail;
    private String password;

//    public LoginDto(String usernameOrEmail, String password) {
//        this.usernameOrEmail = usernameOrEmail;
//        this.password = password;
//    }
//
//    public String getUsernameOrEmail() {
//        return usernameOrEmail;
//    }
//
//    public void setUsernameOrEmail(String usernameOrEmail) {
//        this.usernameOrEmail = usernameOrEmail;
//    }
//
//    public String getPassword() {
//        return password;
//    }
//
//    public void setPassword(String password) {
//        this.password = password;
//    }
}
