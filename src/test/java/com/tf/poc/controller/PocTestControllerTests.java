package com.tf.poc.controller;

import com.tf.poc.PocApplication;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = PocApplication.class)
@AutoConfigureMockMvc
public class PocTestControllerTests {
    @Autowired
    MockMvc mockMvc;

    @Test
    public void testPocHome() throws Exception {
        mockMvc.perform(get("")).andExpect(status().isOk());
    }
}
