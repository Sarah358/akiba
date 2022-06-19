package com.akiba.akibaapp.controller;

import com.akiba.akibaapp.AkibaappApplication;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest(classes = {AkibaappApplication.class})
@AutoConfigureMockMvc

public class TransactionControllerIntegrationTest {

    @Test
    public void testTransactions() throws Exception {
        mockMvc.perform(
                        get("/api/v1/transactions/35867408"))
                .andExpect(status().isOk());
    }

    @Autowired
    private MockMvc mockMvc;
}
