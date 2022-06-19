package com.akiba.akibaapp.controller;


import com.akiba.akibaapp.service.TransactionService;
import com.akiba.akibaapp.transactioncontroller.TransactionController;
import org.hamcrest.Matchers;
import org.junit.jupiter.api.Test;
import org.springframework.boot.web.server.LocalServerPort;

import static io.restassured.module.mockmvc.RestAssuredMockMvc.*;
import static io.restassured.module.mockmvc.RestAssuredMockMvc.given;

public class TransactionComponentTest {

    @LocalServerPort
    private int port;

    @Test
    public void testApplicationEndToEnd() {
        given().standaloneSetup(new TransactionController(new TransactionService()))
                .when()
                .get(String.format("http://localhost:%s/api/v1/transactions/35867408", port))
                .then()
                .statusCode(Matchers.is(200));
    }
}

