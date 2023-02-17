package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.MenuPage;
import steps.SearchUsersSteps;

public class CheckSearchingUsersTest extends BaseTest{
    @Test(description="This method validate the SearchUsers functionality")
    public void checkSearchingUsersTest() {
        SearchUsersSteps searchUsersSteps = new SearchUsersSteps();
        MenuPage menuPage = new MenuPage();

        menuPage.goToMenuPage();
        menuPage.goToSearchUsersButton();
        searchUsersSteps.searchUser("295309");

        Assert.assertEquals(searchUsersSteps.getStringFromUserInListOfFoundUsers(), "295309");
    }
}
