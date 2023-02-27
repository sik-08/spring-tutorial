package com.example.hello.response;

import com.example.hello.dto.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class PageController {

    // 리턴 타입이 String 일 경우에 자동으로 html 파일을 찾아가도록 할 수 있다.
    @RequestMapping("/main")
    public String main(){
        return "main.html";
    }

    @ResponseBody // response용 body를 만들어서 내리겠다.
    @GetMapping("/user")
    public User user(){
        var user = new User();
        user.setName("sik");
        user.setAddress("컴퓨터공학과");

        return user;
    }
}
