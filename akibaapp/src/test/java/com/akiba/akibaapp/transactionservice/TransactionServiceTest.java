package com.akiba.akibaapp.transactionservice;

import com.akiba.akibaapp.service.TransactionService;
import com.akiba.akibaapp.AkibaappApplication;

import org.junit.jupiter.api.Test;

//import static org.junit.jupiter.api.Assertions.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.jupiter.api.Assertions.assertEquals;


@SpringBootTest(classes = {AkibaappApplication.class})
public class TransactionServiceTest {

    @Autowired
    private TransactionService transactionService;

    @Test
    public void testTransactionCount() {
        assertEquals(2, transactionService.findAllByAccountNumber(35867408).size());
    }
}