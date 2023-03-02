package com.example.hello.ioc;

import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;

public class UrlEncoder implements IEncoder {
    public String encode(String message){
        return URLEncoder.encode(message, StandardCharsets.UTF_8);
    }
}
