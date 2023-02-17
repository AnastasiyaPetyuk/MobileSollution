package pages;

import org.openqa.selenium.By;

public class MenuPage {
    private final BaseElement menuButton = new BaseElement(By.id("com.zdv.secretcloset:id/imageView13"));
    private final BaseElement authorizationButton = new BaseElement(By.id("com.zdv.secretcloset:id/tvUserStatus"));
    private final BaseElement searchUsersButton = new BaseElement(By.id("com.zdv.secretcloset:id/textView7"));
    private final BaseElement settingsButton = new BaseElement(By.id("com.zdv.secretcloset:id/textView10"));
    private final BaseElement registerButton = new BaseElement(By.id("com.zdv.secretcloset:id/statusTitle"));
    private final BaseElement emailField = new BaseElement(By.id("com.zdv.secretcloset:id/etEmail"));
    private final BaseElement OKButton = new BaseElement(By.id("com.zdv.secretcloset:id/rlButtonLoginOk"));
    private final BaseElement passwordField = new BaseElement(By.id("com.zdv.secretcloset:id/etSignInPassword"));
    private final BaseElement signUpButton = new BaseElement(By.id("com.zdv.secretcloset:id/textView50"));
    private final BaseElement logOutButton = new BaseElement(By.id("com.zdv.secretcloset:id/textView68"));
    private final BaseElement userEmailLabel = new BaseElement(By.id("com.zdv.secretcloset:id/tvProfileEmail"));

    public void goToMenuPage() {
        menuButton.click();
    }

    public void goToAuthorisationButton() {
        authorizationButton.click();
    }

    public void goToSearchUsersButton() {
        searchUsersButton.click();
    }

    public void goToSettingsButton() {
        settingsButton.click();
    }

    public void goToRegistration() {
        registerButton.click();
    }
    public void enterEmail(String email) {
        emailField.sendKeys(email);
    }
    public void clickOKButtonAfterEmailIsEntered() {
        OKButton.click();
    }
    public void enterPassword(String password) {
        passwordField.sendKeys(password);
    }
    public void clickOnSignUpButton() {
        signUpButton.click();
    }
    public String getTextFromUserEmailLabel() {
        return userEmailLabel.getText();
    }
    public void clickOnLogOutButton() {
        logOutButton.click();
    }
}
