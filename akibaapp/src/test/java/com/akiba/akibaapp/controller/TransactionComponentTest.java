package com.akiba.akibaapp.controller;

import com.akiba.akibaapp.AkibaappApplication;
import com.akiba.akibaapp.transactioncontroller.TransactionController;
import org.hamcrest.Matchers;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.web.server.LocalServerPort;
import static io.restassured.module.mockmvc.RestAssuredMockMvc.given;

@SpringBootTest(classes = {AkibaappApplication.class})
public class TransactionComponentTest {

    @LocalServerPort
    private int port;

    @Autowired
    private TransactionController transactionController;

    @Test
    public void testApplicationEndToEnd() {
        given().standaloneSetup(transactionController)
                .when()
                .get(String.format("http://localhost:%s/api/v1/transactions/35867408", port))
                .then()
                .statusCode(Matchers.is(200));
    }
}

