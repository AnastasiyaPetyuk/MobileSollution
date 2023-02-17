package pages;

import org.openqa.selenium.By;

public class SearchUsersPage {
    private final BaseElement enterUserNameOrUserIdField = new BaseElement(By.id("com.zdv.secretcloset:id/etDialogID"));
    private final BaseElement searchButton = new BaseElement(By.id("android:id/button1"));
    private final BaseElement foundUsersButton = new BaseElement(By.id("com.zdv.secretcloset:id/userSearchUserName"));
    private final BaseElement foundUserIdField  = new BaseElement(By.id("com.zdv.secretcloset:id/tvItemSellerID"));

    public void searchUser() {
        searchButton.click();
    }
    public void enterUserNameOrUserId (String id) {
        enterUserNameOrUserIdField.sendKeys(id);
    }

    public void clickOnFoundUsersButton() {
        foundUsersButton.click();
    }
    public String getTextFromFoundUserIdField() {
        return foundUserIdField.getText();
    }
}
