package com.example.hello;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class HelloApplicationTests {

    @Test
    void contextLoads() throws JsonProcessingException {
        System.out.println("---------------");

        // Text JSON -> Object
        // Object -> Text JSON

        // controller req json(text) -> object
        // response object -> jsno(text)

        var objectMapper = new ObjectMapper();

        // object -> text
        // object mapper get method 활용
        var person = new Person("sik", 24);

        var text = objectMapper.writeValueAsString(person);
        System.out.println(text);

        // text -> object
        // object mapper default constructor 사용
        var objectPerson = objectMapper.readValue(text, Person.class);
        System.out.println(objectPerson);
    }

}
