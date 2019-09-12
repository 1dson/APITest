package utils;

import io.restassured.RestAssured;
import io.restassured.config.RestAssuredConfig;
import io.restassured.config.SSLConfig;
import io.restassured.http.ContentType;
import io.restassured.response.ValidatableResponse;

import java.util.Map;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class RestVerbs {

    private static ValidatableResponse response;


    public static ValidatableResponse post(@NotNull Object requestBody, @NotNull String serviceEndPoint, @NotNull Map<String, String> headers) {
        response = RestAssured
                .given().urlEncodingEnabled(true).log().all().contentType(ContentType.JSON)
                .headers(headers)
                .body(requestBody)
                .when().config(RestAssuredConfig.config().sslConfig((new SSLConfig()).relaxedHTTPSValidation().allowAllHostnames()))
                .post(serviceEndPoint).then();
        return response;
    }

    public static ValidatableResponse put(@NotNull Object requestBody, @NotNull String serviceEndPoint, @NotNull Map<String, String> headers) {
        response =  RestAssured
                .given().urlEncodingEnabled(true).log().all().contentType(ContentType.JSON)
                .headers(headers)
                .body(requestBody)
                .when().config(RestAssuredConfig.config().sslConfig((new SSLConfig()).relaxedHTTPSValidation().allowAllHostnames()))
                .put(serviceEndPoint).then();
        return response;
    }

    public static ValidatableResponse getWithQueryParams(@NotNull String serviceEndPoint, @Nullable Map<String, String> queryParam, @NotNull Map<String, String> headers) {
        response = RestAssured
                .given()
                .params(queryParam)
                .urlEncodingEnabled(true).log().all()
                .headers(headers)
                .when().config(RestAssuredConfig.config().sslConfig((new SSLConfig()).relaxedHTTPSValidation().allowAllHostnames()))
                .get(serviceEndPoint).then();
        return response;
    }

    public static ValidatableResponse get(@NotNull String serviceEndPoint, @NotNull Map<String, String> headers) {
        response = RestAssured
                .given().urlEncodingEnabled(true).log().all().headers(headers)
                .when().config(RestAssuredConfig.config().sslConfig((new SSLConfig()).relaxedHTTPSValidation().allowAllHostnames()))
                .get(serviceEndPoint).then();
        return response;
    }

    public static ValidatableResponse delete(@NotNull Object requestBody, @NotNull String serviceEndPoint, @NotNull Map<String, String> headers) {
        response = RestAssured.given().urlEncodingEnabled(true).log().all().contentType(ContentType.JSON)
                .headers(headers)
                .body(requestBody)
                .when().config(RestAssuredConfig.config().sslConfig((new SSLConfig()).relaxedHTTPSValidation().allowAllHostnames()))
                .delete(serviceEndPoint).then();
        return response;
    }
}