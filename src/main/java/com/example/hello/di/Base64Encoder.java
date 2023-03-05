package com.example.hello.di;

import org.springframework.stereotype.Component;

import java.util.Base64;

// Component의 디폴트 값은 클래스명에서 맨 앞글자만 소문자로
@Component
public class Base64Encoder implements IEncoder {
    public String encode(String message){
        return Base64.getEncoder().encodeToString(message.getBytes());
    }
}
