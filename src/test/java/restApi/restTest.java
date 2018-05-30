package restApi;

import io.restassured.RestAssured.*;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.CoreMatchers.hasItems;

public class restTest {

    @Test
    public void testStatusCode(){
        given().
            get("https://www.wallpics.com").
        then().
            assertThat().
            statusCode(200).
            log().status();
    }

    @Test
    public void testOrderWallpicsExist(){
        given().
            get("https://www.wallpics.com").
        then().
            assertThat().
            body(containsString("Order Wallpics")).log().all();
    }
}
