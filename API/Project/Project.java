package api;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class GitHubSSHKeyTest {

    RequestSpecification requestSpec;
    String sshKey = "ssh-rsa AAAAB3NzaC1yc2EAAAADAQABAAABAQD...yourkeyhere"; // 🔑 Replace with your SSH public key
    int keyId; // Will store ID returned from POST

    @BeforeClass
    public void setup() {
        requestSpec = new RequestSpecBuilder()
                .setBaseUri("https://api.github.com")
                .setContentType("application/json")
                .addHeader("Authorization", "token YOUR_GITHUB_ACCESS_TOKEN") // 🔐 Replace token
                .build();
    }

    // ✅ 1. POST - Add SSH Key
    @Test(priority = 1)
    public void addSSHKeyTest() {

        String requestBody = "{\n" +
                "  \"title\": \"TestAPIKey\",\n" +
                "  \"key\": \"" + sshKey + "\"\n" +
                "}";

        Response response =
                given()
                        .spec(requestSpec)
                        .body(requestBody)
                .when()
                        .post("/user/keys");

        response.prettyPrint();

        keyId = response.jsonPath().getInt("id"); // Save ID for next tests

        Assert.assertEquals(response.getStatusCode(), 201);
        Assert.assertNotNull(keyId, "Key ID should not be null");
    }

    // ✅ 2. GET - Retrieve SSH Key
    @Test(priority = 2, dependsOnMethods = "addSSHKeyTest")
    public void getSSHKeyTest() {

        Response response =
                given()
                        .spec(requestSpec)
                        .pathParam("keyId", keyId)
                .when()
                        .get("/user/keys/{keyId}");

        Reporter.log(response.prettyPrint(), true);

        Assert.assertEquals(response.getStatusCode(), 200);
        Assert.assertEquals(response.jsonPath().getString("title"), "TestAPIKey");
    }

    // ✅ 3. DELETE - Remove SSH Key
    @Test(priority = 3, dependsOnMethods = "addSSHKeyTest")
    public void deleteSSHKeyTest() {

        Response response =
                given()
                        .spec(requestSpec)
                        .pathParam("keyId", keyId)
                .when()
                        .delete("/user/keys/{keyId}");

        Reporter.log("Delete Response Status: " + response.getStatusCode(), true);

        Assert.assertEquals(response.getStatusCode(), 204);
    }
}
