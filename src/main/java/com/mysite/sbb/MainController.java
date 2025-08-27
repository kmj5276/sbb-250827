package com.mysite.sbb;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

    @GetMapping("/") //목록
    public void index(){
        System.out.println("index() 메서드 호출됨!");
    }

    @GetMapping("/hello") //등록
    public void hell(){
        System.out.println("hello() 메서드 호출됨!");
    }
}
