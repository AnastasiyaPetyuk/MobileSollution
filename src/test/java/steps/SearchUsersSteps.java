package steps;

import pages.SearchUsersPage;
import tests.BaseTest;

import java.util.logging.Logger;

public class SearchUsersSteps {
    public static final Logger logger = Logger.getLogger(BaseTest.class.getName());
    SearchUsersPage searchUsersPage = new SearchUsersPage();
    public void searchUser(String id) {
        logger.info("enter id in section 'search user'");
        searchUsersPage.enterUserNameOrUserId(id);
        searchUsersPage.searchUser();
    }
    public String getStringFromUserInListOfFoundUsers() {
        logger.info("check correct results");
        searchUsersPage.clickOnFoundUsersButton();
        return searchUsersPage.getTextFromFoundUserIdField();
    }
}
