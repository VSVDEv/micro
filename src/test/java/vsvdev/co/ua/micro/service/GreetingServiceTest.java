package vsvdev.co.ua.micro.service;

import org.junit.jupiter.api.Test;
import vsvdev.co.ua.micro.entities.Greeting;


import static org.junit.jupiter.api.Assertions.assertEquals;


public class GreetingServiceTest {

    private GreetingService service = new GreetingServiceImpl();


    @Test
    public void shouild_return_name() throws Exception {

        // given
        String expected_content = "Hello, sv!";
        long expected_id = service.greet("").id + 1L;

        // when
        Greeting greeting = service.greet("sv");

        // then
        assertEquals(expected_id, greeting.id);
        assertEquals(expected_content, greeting.content);
    }

    @Test
    public void shouild_return_count() throws Exception {

        // given
        long second_id = service.greet("").id + 1L;
        String expected_content = "Hello, World!";

        // when
        Greeting greeting = service.greet("");

        // then
        assertEquals(second_id, greeting.id);
    }

}