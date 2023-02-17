package steps;

import pages.MenuPage;
import tests.BaseTest;

import java.util.logging.Logger;

public class AuthorizationSteps {
    public static final java.util.logging.Logger logger = Logger.getLogger(BaseTest.class.getName());
    public void authorization(String email, String password) {
        MenuPage menuPage = new MenuPage();
        logger.info("open menu page");
        menuPage.goToMenuPage();
        logger.info("go to authorization");
        menuPage.goToAuthorisationButton();
        menuPage.goToRegistration();
        logger.info("enter value in email field");
        menuPage.enterEmail(email);
        menuPage.clickOKButtonAfterEmailIsEntered();
        logger.info("enter value into password field");
        menuPage.enterPassword(password);
        logger.info("sign up");
        menuPage.clickOnSignUpButton();
        logger.info("return to the menu section");
        menuPage.goToMenuPage();
    }
    public boolean checkAuthorization(String email) {
        MenuPage menuPage = new MenuPage();
        logger.info("go to settings section");
        menuPage.goToSettingsButton();
        logger.info("check correct authorization");
        return menuPage.getTextFromUserEmailLabel().contains(email);
    }
    public void logOutFromAccount() {
        MenuPage menuPage = new MenuPage();
        logger.info("log out from account");
        menuPage.clickOnLogOutButton();
    }
}
