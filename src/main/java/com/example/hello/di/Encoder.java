package com.example.hello.di;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

// @Component
public class Encoder {
    private IEncoder iEncoder;

    // @Qualifier("urlEncoder")
    public Encoder(IEncoder iEncoder){
        this.iEncoder = iEncoder;
    }

    public String encode(String message){
        return iEncoder.encode(message);
    }

    public void setiEncoder(IEncoder iEncoder) {
        this.iEncoder = iEncoder;
    }
}
