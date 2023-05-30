package io.swagger.integration;

import org.json.JSONException;
import org.junit.jupiter.api.Test;
import org.skyscreamer.jsonassert.JSONAssert;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.test.context.TestPropertySource;

import static io.restassured.RestAssured.given;


@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@TestPropertySource(properties = "server.servlet.contextPath=/")
class PriaIntegrationTest {

    @LocalServerPort
    int port;

    @Test
    void legalPersonDelegatesWithMandates_chapter2_3() throws JSONException {

        String expected = TestUtil.readFile("priaExpectedResponses/legalEntityDelegatesWithMandates_chapter2.3.json");

        String response = given()
                .port(port)
                .accept("application/json")
                .header("X-Road-Id", "PRIA_123")
                .header("X-Road-User-Id", "EE50001029996")
                .header("X-Road-Represented-Party", "EE11065244")
                .get("/representees/EE11430169/delegates/mandates")
                .then().log().all()
                .statusCode(200)
                .extract()
                .response()
                .asString();

        JSONAssert.assertEquals(expected, response, false);
    }

    @Test
    void naturalPersonAsDelegate_chapter3_2() throws JSONException {
        String expected = TestUtil.readFile("priaExpectedResponses/naturalPersonDelegate_chapter3.3.json");

        String response = given()
                .port(port)
                .accept("application/json")
                .header("X-Road-Id", "PRIA")
                .header("X-Road-User-Id", "EE60001019906")
                .header("X-Road-Represented-Party", "EE11065244")
                .get("/delegates/EE60001019906/representees/mandates")
                .then().log().all()
                .statusCode(200)
                .extract()
                .response()
                .asString();

        JSONAssert.assertEquals(expected, response, false);
    }


    @Test
    void deleteMandateChapter6_4() {

        String payload = TestUtil.readFile("priaPostPutPayloads/deleteMandate.json");

        given()
                .port(port)
                .accept("application/json")
                .header("X-Road-Id", "PRIA_123")
                .header("X-Road-User-Id", "EE50001029996")
                .header("X-Road-Represented-Party", "EE11065244")
                .contentType("application/json")
                .body(payload)
                .log().all()
                .put("/representees/imp7-EE11430169/delegates/imp8-EE37925050002/mandates/imp3-fiscally_marked_gas_buyer")
                .then().log().all()
                .statusCode(202);
    }

    @Test
    void getRoles_chapter6_1() throws JSONException {
        String expected = TestUtil.readFile("priaExpectedResponses/getRoles_6.2.json");

        String response = given()
                .port(port)
                .accept("application/json")
                .header("X-Road-Id", "PRIA_123")
                .get("/roles?ns=PRIA")
                .then().log().all()
                .log().all().statusCode(200)
                .extract()
                .response()
                .asString();

        JSONAssert.assertEquals(expected, response, false);
    }

    @Test
    void getRoles_IfModifiedSinceHeader_returns304_chapter7_3() throws JSONException {

        given()
                .port(port)
                .accept("application/json")
                .header("X-Road-Id", "PRIA_123")
                .header("If-Modified-Since", "2023-01-18T11:00:00Z")
                .get("/roles?ns=PRIA")
                .then().log().all()
                .statusCode(304);

    }


}


