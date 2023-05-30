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
class StatIntegrationTest {

    @LocalServerPort
    int port;

    @Test
    void legalEntityDelegatesWithMandates_chapter2_2() throws JSONException {

        String expected = TestUtil.readFile("statExpectedResponses/legalEntityDelegatesWithMandates_chapter2.3.json");

        String response = given()
                .port(port)
                .accept("application/json")
                .header("X-Road-Id", "STAT_123")
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
    void legalEntityRepresentees_chapter3_2() throws JSONException {
        String expected = TestUtil.readFile("statExpectedResponses/legalEntityRepresentees_chapter3.3.json");

        String response = given()
                .port(port)
                .accept("application/json")
                .header("X-Road-Id", "STAT_123")
                .header("X-Road-User-Id", "EE50001029996")
                .header("X-Road-Represented-Party", "EE11065244")
                .get("/delegates/EE11065244/representees/mandates")
                .then().log().all()
                .statusCode(200)
                .extract()
                .response()
                .asString();

        JSONAssert.assertEquals(expected, response, false);
    }

    @Test
    void subDelegateList_statChapter4_2() throws JSONException {
        String expected = TestUtil.readFile("statExpectedResponses/subDelegateList_chapter4.3.json");

        String response = given()
                .port(port)
                .accept("application/json")
                .header("X-Road-Id", "STAT_123")
                .header("X-Road-User-Id", "EE50001029996")
                .header("X-Road-Represented-Party", "EE11065244")
                .get("/representees/EE10391131/delegates/mandates?subDelegatedBy=EE11065244")
                .then().log().all()
                .statusCode(200)
                .extract()
                .response()
                .asString();

        JSONAssert.assertEquals(expected, response, false);
    }

    @Test
    void naturalPersonQueriesMandatesGivenByOthers_chapter6_2() throws JSONException {
        String expected = TestUtil.readFile("statExpectedResponses/mandatesGivenByOthers_chapter_6.2.json");

        String response = given()
                .port(port)
                .accept("application/json")
                .header("X-Road-Id", "STAT_123")
                .header("X-Road-User-Id", "EE60001019906")
                .get("/delegates/EE60001019906/representees/mandates")
                .then().log().all()
                .statusCode(200)
                .extract()
                .response()
                .asString();

        JSONAssert.assertEquals(expected, response, false);
    }

    @Test
    void statAddMandateChapter5_2() throws JSONException {
        String payload = TestUtil.readFile("statPostPutPayloads/payload_5.2.2.json");

        given()
                .port(port)
                .accept("application/json")
                .header("X-Road-Id", "STAT_123")
                .header("X-Road-User-Id", "EE50001029996")
                .header("X-Road-Represented-Party", "EE11065244")
                .contentType("application/json")
                .body(payload)
                .post("/representees/EE11065244/delegates/EE60001019906/mandates")
                .then().log().all()
                .log().all()
                .statusCode(200);
    }

    @Test
    void subDelegateMandateChapter6_3() throws JSONException {
        String payload = TestUtil.readFile("statPostPutPayloads/post_sub_delegate_chapter_6.3.json");

        given()
                .port(port)
                .accept("application/json")
                .header("X-Road-Id", "STAT_123")
                .header("X-Road-User-Id", "EE50001029996")
                .header("X-Road-Represented-Party", "EE11065244")
                .contentType("application/json")
                .body(payload)
                .post("/representees/imp1-EE11065244/delegates/imp2-EE60001019906/mandates/imp3-HAMPI/subdelegates")
                .then().log().all()
                .log().all()
                .statusCode(202);
    }

   
    @Test
    void deleteMandateChapter8_4() {

        String payload = TestUtil.readFile("statPostPutPayloads/deleteMandate.json");

        given()
                .port(port)
                .accept("application/json")
                .header("X-Road-Id", "STAT_123")
                .header("X-Road-User-Id", "EE50001029996")
                .header("X-Road-Represented-Party", "EE11065244")
                .contentType("application/json")
                .body(payload)
                .put("/representees/imp7-EE11065244/delegates/imp8-EE30303039914/mandates/imp9-HAMPI")
                .then().log().all()
                .log().all()
                .statusCode(202);
    }

    @Test
    void getRoles_chapter9_1() throws JSONException {
        String expected = TestUtil.readFile("statExpectedResponses/getRoles.json");

        String response = given()
                .port(port)
                .accept("application/json")
                .header("X-Road-Id", "STAT_123")
                .get("/roles?ns=stat,GLOBAL1_stat")
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
                .header("X-Road-Id", "STAT_123")
                .header("If-Modified-Since", "2023-01-18T11:00:00Z")
                .get("/roles?ns=stat,GLOBAL1_stat")
                .then().log().all()
                .statusCode(304);

    }


}


