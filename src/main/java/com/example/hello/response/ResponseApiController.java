package com.example.hello.response;

import com.example.hello.dto.User;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/response")
public class ResponseApiController {

    // plain-text
    @GetMapping("/text")
    public String text(@RequestParam String account){
        return account;
    }

    // json
    @PostMapping("/json")
    public User json(@RequestBody User user){
        return user;
        /*
        {
            "name" : "sik",
            "age" : 24,
            "phoneNumber" : "010-1234-1234",
            "address" : "Wonju city"
        }
         */
    }
}
