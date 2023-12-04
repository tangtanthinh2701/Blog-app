package com.springboot.blog.springbootblogrestapi.payload;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
//@Data
public class RegisterDto {
    private String name;
    private String username;
    private String email;
    private String password;
}
