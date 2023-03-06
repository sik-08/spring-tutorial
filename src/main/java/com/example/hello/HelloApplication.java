package com.example.hello;

import com.example.hello.di.ApplicationContextProvider;
import com.example.hello.di.Base64Encoder;
import com.example.hello.di.Encoder;
import com.example.hello.di.UrlEncoder;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@SpringBootApplication
public class HelloApplication {

    public static void main(String[] args) {
        SpringApplication.run(HelloApplication.class, args);

        ApplicationContext context = ApplicationContextProvider.getContext();
        // Base64Encoder base64Encoder = context.getBean(Base64Encoder.class);
        // Encoder encoder = new Encoder(base64Encoder);

        // IoC (제어의 역전)
        Encoder encoder = context.getBean("urlEncode", Encoder.class);

        String url = "www.naver.com/books/it?page=10&size=20";
        String result = encoder.encode(url);
        System.out.println(result);
    }

}

// Bean -> Spring Container (IoC)
// 한 개의 클래스에서 여러 개의 Bean을 등록하겠다.
@Configuration
class AppConfig {

    @Bean("base64Encode")
    public Encoder encoder1(Base64Encoder base64Encoder){
        return new Encoder(base64Encoder);
    }

    @Bean("urlEncode")
    public Encoder encoder2(UrlEncoder urlEncoder){
        return new Encoder(urlEncoder);
    }
}
