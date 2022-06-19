package com.akiba.akibaapp.transactionservice;

import com.akiba.akibaapp.service.TransactionService;
import org.junit.jupiter.api.Test;

//import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;


class TransactionServiceTest {
    TransactionService transactionService = new TransactionService();

    @Test
    public void testTransactionCount() {
        assertEquals(1, transactionService.findAllByAccountNumber(35867408).size());
    }
}