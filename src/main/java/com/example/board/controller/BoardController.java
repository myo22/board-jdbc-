package com.example.board.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

// HTTP요청을 받아서 응답을 받는 컴포넌트, 스프링 부트가 자동으로 Bean으로 생성한다.
@Controller
public class BoardController {
    // 게시물 목록을 보여준다.
    // http://localhost:8080/ -----> "list"라는 이름의 템플릿을 사용(forward)하여 화면에 출력.
    // list를 리턴한다는 것은 classpath:/templates/list.html을 사용한다는 뜻이다. classpath:/경로나  .html(확장자)를 바꿔주고 싶다면 prefix랑 suffix를 바꿔주면 가능하다.
    @GetMapping("/")
    public String list(){
        return "list"; // 컨트롤러의 메소드가 리턴하는 문자열은 템플릿 이름이다.
    }
}
