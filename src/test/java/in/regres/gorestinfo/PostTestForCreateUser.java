package in.regres.gorestinfo;

import in.regres.model.UserPojo;
import in.regres.testbase.TestBase;
import io.restassured.response.Response;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class PostTestForCreateUser extends TestBase {


    @Test
    public void CreateUserRecord() {
        UserPojo userPojo = new UserPojo();
        userPojo.setName("morpheus");
        userPojo.setJob("leader");
        Response response = given().log().all()
                .header("Content-Type", "application/json")
                .body(userPojo)
                .when()
                .post("/users");
        response.then().statusCode(201);
        response.prettyPrint();

    }
}