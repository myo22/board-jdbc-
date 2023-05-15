package com.example.board.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class LoginInfo {
    private Integer userId;
    private String email;
    private String name;

//    public LoginInfo(Integer userId, String email, String name) {   ->> @AllArgsConstructord로 lombok이 알아서 생성자를 만들어줌.
//        this.userId = userId;
//        this.email = email;
//        this.name = name;
//    }
}
