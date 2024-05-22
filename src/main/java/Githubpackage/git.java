package Githubpackage;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;

import java.util.logging.SocketHandler;

public class git {
@Test
    public void git (){

        RestAssured.baseURI = "https://reqres.in/api";
        RequestSpecification req = RestAssured.given();
        Response s = req.request(Method.GET,"/users?page=2");
        ResponseBody bodyB = s.getBody();
        String B = bodyB.asString();
        System.out.println("Body: "+bodyB.asString());
    }
}
