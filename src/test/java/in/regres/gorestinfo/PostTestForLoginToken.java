package in.regres.gorestinfo;

import in.regres.model.TokenPojo;
import in.regres.testbase.TestBase;
import io.restassured.response.Response;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class PostTestForLoginToken extends TestBase {
    @Test
    public void getToken() {
        TokenPojo tokenPojo = new TokenPojo();
        tokenPojo.setEmail("eve.holt@reqres.in");
        tokenPojo.setPassword("cityslicka");

        Response response = given().log().all()
                .header("Content-Type", "application/json")
                .body(tokenPojo)
                .when()
                .post("/login");
        response.then().statusCode(200);
        response.prettyPrint();
    }
}