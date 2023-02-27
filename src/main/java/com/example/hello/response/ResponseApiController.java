package com.example.hello.response;

import com.example.hello.dto.User;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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
    // req -> object mapper -> object -> method -> object -> object mapper -> json -> response
    @PostMapping("/json")
    public User json(@RequestBody User user){
        return user; // 200 OK
        /*
        {
            "name" : "sik",
            "age" : 24,
            "phone_number" : "010-1234-1234",
            "address" : "Wonju city"
        }
         */
    }

    // ResponseEntity
    @PutMapping("/put")
    public ResponseEntity<User> put(@RequestBody User user){
        return ResponseEntity.status(HttpStatus.CREATED).body(user);
    }
}
