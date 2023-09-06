package vsvdev.co.ua.micro.controller;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;



@SpringBootTest
@AutoConfigureMockMvc
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class GreetingControllerITest {

    @Autowired
    private MockMvc mvc;


    @Test
    @Order(1)
    public void shouild_return_name() throws Exception {

        // given
        String expected_content = "Hello, sv!";
        long expected_id = 1L;

        // when
        mvc.perform(get("/greeting?name=sv"))

                // then
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.id").value(expected_id))
                .andExpect(jsonPath("$.content").value(expected_content));

    }

    @Test
    @Order(2)
    public void shouild_return_default() throws Exception {

        // given
        long second_id = 2L;
        String expected_content = "Hello, World!";

        // when
        mvc.perform(get("/greeting"))

                // then
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.id").value(second_id))
                .andExpect(jsonPath("$.content").value(expected_content));
    }
}