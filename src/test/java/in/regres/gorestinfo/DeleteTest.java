package in.regres.gorestinfo;

import in.regres.testbase.TestBase;
import io.restassured.response.Response;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class DeleteTest extends TestBase {
    @Test
    public void deleteUser() {

        Response response = given().log().all()
                .when()
                .delete("/users/7");
        response.then().statusCode(204);
        response.prettyPrint();

    }
}