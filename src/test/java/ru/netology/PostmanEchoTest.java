package ru.netology;

import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;

import static org.hamcrest.Matchers.equalTo;


class PostmanEchoTest {
    @Test
    void shouldMatchRequestBody() {
        given()
                .baseUri("https://postman-echo.com")
                .body("foo")
                .when()
                .post("/post")
                .then()
                .statusCode(200)
                .body("data", equalTo("bar"))
        ;
    }

}
