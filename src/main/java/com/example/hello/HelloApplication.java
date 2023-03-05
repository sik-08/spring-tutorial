package com.example.hello;

import com.example.hello.di.ApplicationContextProvider;
import com.example.hello.di.Base64Encoder;
import com.example.hello.di.Encoder;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class HelloApplication {

    public static void main(String[] args) {
        SpringApplication.run(HelloApplication.class, args);

        ApplicationContext context = ApplicationContextProvider.getContext();
        Base64Encoder base64Encoder = context.getBean(Base64Encoder.class);
        Encoder encoder = new Encoder(base64Encoder);

        String url = "www.naver.com/books/it?page=10&size=20";
        String result = encoder.encode(url);
        System.out.println(result);
    }

}
