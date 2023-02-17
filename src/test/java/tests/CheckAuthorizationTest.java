package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import steps.AuthorizationSteps;

public class CheckAuthorizationTest extends BaseTest{

    @Test(description="This method validate the sign up validation")
    public void checkAuthorizationTest() {
        String email = "admin@admin.com";
        String password = "admin";
        AuthorizationSteps authorizationSteps = new AuthorizationSteps();

        authorizationSteps.authorization(email, password);
        Assert.assertTrue(authorizationSteps.checkAuthorization(email));

        authorizationSteps.logOutFromAccount();
    }

}
