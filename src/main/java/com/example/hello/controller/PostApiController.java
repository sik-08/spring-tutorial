package com.example.hello.controller;

import com.example.hello.dto.PostRequestDto;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping(path = "/api")
public class PostApiController {

    @PostMapping("/post")
    public void post(@RequestBody Map<String, Object> requestData){
        requestData.entrySet().forEach(stringObjectEntry -> {
            System.out.println("key : " + stringObjectEntry.getKey());
            System.out.println("value : " + stringObjectEntry.getValue());
        });
    }

    // Post로 전달하는 데이터 (매개 값)에는 @RequestBody 어노테이션을 붙여줘야 한다.
    // @RequestBody를 통해 JSON 데이터를 파싱할 수 있다.
    @PostMapping("/post02")
    public void post02(@RequestBody PostRequestDto requestData){
        System.out.println(requestData.toString());
    }
}
