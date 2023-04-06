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
    void legalEntityDelegatesWithMandates_chapter2_3() throws JSONException {

        String expected = TestUtil.readFile("priaExpectedResponses/legalEntityDelegatesWithMandates_chapter2.3.json");

        String response = given()
                .port(port)
                .accept("application/json")
                .header("X-Road-Id", "PRIA_123")
                .header("X-Road-User-Id", "EE50001029996")
                .header("X-Road-Represented-Party", "EE11065244")
                .get("/representees/EE11065244/delegates/mandates")
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
    void subDelegateList_priaChapter4_2() throws JSONException {
        String expected = TestUtil.readFile("priaExpectedResponses/subDelegateList_chapter4.3.json");

        String response = given()
                .port(port)
                .accept("application/json")
                .header("X-Road-Id", "PRIA_123")
                .header("X-Road-User-Id", "EE60001019906")
                .header("X-Road-Represented-Party", "EE11430169")
                .get("/representees/EE11430169/delegates/mandates?subDelegatedBy=EE60001019906")
                .then().log().all()
                .statusCode(200)
                .extract()
                .response()
                .asString();

        JSONAssert.assertEquals(expected, response, false);
    }

    @Test
    void priaAddMandateChapter5_2() {
        String payload = TestUtil.readFile("priaPostPutPayloads/payload_5.2.2.json");

        given()
                .port(port)
                .accept("application/json")
                .header("X-Road-Id", "PRIA_123")
                .header("X-Road-User-Id", "EE30303039816")
                .header("X-Road-Represented-Party", "EE11430169")
                .contentType("application/json")
                .body(payload)
                .post("/representees/EE11430169/delegates/EE60001019906/mandates")
                .then()
                .assertThat()
                    .statusCode(200);

    }

    @Test
    void subDelegateMandateChapter6_3() throws JSONException {
        String payload = TestUtil.readFile("priaPostPutPayloads/post_sub_delegate_chapter_6.3.json");

        given()
                .port(port)
                .accept("application/json")
                .header("X-Road-Id", "PRIA_123")
                .header("X-Road-User-Id", "EE50001029996")
                .header("X-Road-Represented-Party", "EE11065244")
                .contentType("application/json")
                .body(payload)
                .post("/nss/pria/representees/imp1-EE11065244/delegates/imp2-EE60001019906/mandates/imp3-HAMPI/subdelegates")
                .then().log().all()
                .log().all()
                .statusCode(202);
    }


    @Test
    void deleteMandateChapter8_4() throws JSONException {

        given()
                .port(port)
                .accept("application/json")
                .header("X-Road-Id", "PRIA_123")
                .header("X-Road-User-Id", "EE50001029996")
                .header("X-Road-Represented-Party", "EE11065244")
                .contentType("application/json")
                .delete("/nss/pria/representees/imp7-EE11065244/delegates/imp8-EE30303039914/mandates/imp9-HAMPI")
                .then().log().all()
                .log().all()
                .statusCode(202);
    }

    @Test
    void getRoles_chapter8_1() throws JSONException {
        String expected = TestUtil.readFile("priaExpectedResponses/getRoles.json");

        String response = given()
                .port(port)
                .accept("application/json")
                .header("X-Road-Id", "PRIA_123")
                .get("/roles?ns=pria,GLOBAL1_pria")
                .then().log().all()
                .log().all().statusCode(200)
                .extract()
                .response()
                .asString();

        JSONAssert.assertEquals(expected, response, false);
    }

    @Test
    void getRoles_IfModifiedSinceHeader_returns304_chapter9_3() throws JSONException {

        given()
                .port(port)
                .accept("application/json")
                .header("X-Road-Id", "PRIA_123")
                .header("If-Modified-Since", "2023-01-18T11:00:00Z")
                .get("/roles?ns=pria,GLOBAL1_pria")
                .then().log().all()
                .statusCode(304);

    }


}


