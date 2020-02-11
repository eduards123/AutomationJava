package stepDefinitions;

import screens.LandingScreen;
import testUI.Configuration;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static testUI.UIOpen.open;
import static testUI.Utils.AppiumHelps.sleep;

public class LandingSteps
{
    private LandingScreen landingScreen = new LandingScreen();

    @Given("I open the application")
    public void iOpenTheApplication()
    {
        Configuration.useAllure = true;
        Configuration.automationType = Configuration.ANDROID_PLATFORM;
        Configuration.androidAppPath = "src/test/resources/groceries-app.apk";
        open();
    }


    @When("I click on add shopping list")
    public void iClickOnAddShoppingList()
    {
        landingScreen.clickAddShoppingList();
        sleep(3000);
    }


    @And("I type {string}")
    public void iType(String arg0)
    {
        landingScreen.typeShoppingListName(arg0);
        sleep(3000);
    }


    @And("I click on {string}")
    public void iClickOnAddList(String arg1)
    {
        landingScreen.typeShoppingListNameConfirm(arg1);
        sleep(3000);
    }


    @And("I click on delete")
    public void iClickOnDelete()
    {
        landingScreen.clickOnFirstList();
        sleep(3000);

    }


    @And("I click on more options")
    public void iClickOnMoreOptions()
    {
        landingScreen.clickOnMoreOptions();
        sleep(3000);
    }


    @And("I click on Delete list")
    public void iClickOnDeleteList()
    {
        landingScreen.clickOnDeleteList();
        sleep(3000);
    }


    @Then("I check there is no {string}")
    public void checkLastScreen(String arg0)
    {
        landingScreen.checkLastScreen(arg0);
    }


    @And("I click on DELETE LIST")
    public void iClickOnDELETELIST()
    {
        landingScreen.clickOnDELETELIST();
        sleep(3000);
    }

}
