package com.learn.githubactions.springboot.demo.controller;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@WebMvcTest
class HelloWorldControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    void testHelloWorldEndpoint() throws Exception {
        mockMvc.perform(get("/hello"))
                .andExpect(status().isOk())
                .andExpect(content().string("hello my world.."));
    }

  /*  @Test
    void testGetEnvironmentDetails() throws Exception {
        mockMvc.perform(get("/environment-details"))
                .andExpect(status().isOk())
                .andExpect(content().string("URL:jdbc:mysql://localhost:3306/organization UserName:root Password:admin"));
    }*/


}