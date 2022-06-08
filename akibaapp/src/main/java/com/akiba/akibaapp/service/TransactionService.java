package com.akiba.akibaapp.service;

import com.akiba.akibaapp.entity.Transaction;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

@Service
public class TransactionService {
    public List<Transaction> findAllByAccountNumber(final Integer accountNumber) {
        return Arrays.asList(
                Transaction
                        .builder()
                        .type("credit")
                        .date(new Date())
                        .accountNumber(accountNumber)
                        .currency("KES")
                        .amount(100.00)
                        .merchantName("")
                        .merchantLogo("")
                        .build()
        );
    }
}
