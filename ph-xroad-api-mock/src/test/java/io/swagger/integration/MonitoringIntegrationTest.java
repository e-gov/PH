package io.swagger.integration;

import io.restassured.http.ContentType;
import org.hamcrest.Matchers;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.test.context.TestPropertySource;

import static io.restassured.RestAssured.given;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@TestPropertySource(properties = "server.servlet.contextPath=/")
class MonitoringIntegrationTest {

    @LocalServerPort
    int port;

    @Test
    void getApplicationHealth() {
        given()
                .port(port)
                .accept("application/json")
                .get("/internal/actuator/health")
                .then()
                .statusCode(200)
                .body("status", Matchers.is("UP"));

    }

    @Test
    void getPrometheusMetrics() {
        given()
                .accept(ContentType.ANY)
                .port(port)
                .get("/internal/actuator/prometheus")
                .then()
                .statusCode(200);
    }
}