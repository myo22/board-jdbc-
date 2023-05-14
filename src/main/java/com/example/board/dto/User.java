package com.example.board.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor // 아무것도 없는 기본 생성자가 자등으로 만들어 진다.
public class User {
    private int user_id;
    private String email;
    private String name;
    private String password;
    private String regdate; // 원래는 날짜 type으로 읽어온 후 문자열로 변환.

}

/*
'user_id', 'int', 'NO', 'PRI', NULL, 'auto_increment'
'email', 'varchar(255)', 'NO', '', NULL, ''
'name', 'varchar(50)', 'NO', '', NULL, ''
'password', 'varchar(500)', 'NO', '', NULL, ''
'regdate', 'timestamp', 'YES', '', 'CURRENT_TIMESTAMP', 'DEFAULT_GENERATED'

 */
