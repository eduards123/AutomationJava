package screens;

import testUI.elements.UIElement;

import static testUI.Utils.By.*;
import static testUI.elements.TestUI.E;

public class LandingScreen
{
    private UIElement shoppingListInput = E(byAndroidUIAutomator("textContains(\"Add a shopping list\")"));
    private UIElement shoppingListInputText = E(byId("editText"));
    private UIElement shoppingListFirstList = E(byId("First List"));
    private UIElement FirstListOptions = E(byAccesibilityId("More options"));
    private UIElement FirstListOptionDeleteList = E(byAndroidUIAutomator("textContains(\"Delete list\")"));
    private UIElement ConfirmFirstListOptionDeleteList = E(byId("android:id/button1"));


    public void clickAddShoppingList()
    {
        shoppingListInput.click();
    }

    public void typeShoppingListName(String var)
    {
        shoppingListInputText.sendKeys(var);
    }

    public void typeShoppingListNameConfirm(String arg)
    {
        UIElement element = E(byAndroidUIAutomator("textContains(\"" + arg + "\")"));
        element.waitFor(5).untilIsVisible();
        element.click();
    }

    public void clickOnFirstList()
    {
        shoppingListFirstList.click();
    }

    public void clickOnMoreOptions()
    {
        FirstListOptions.click();
    }

    public void clickOnDeleteList()
    {
        FirstListOptionDeleteList.click();
    }

    public void clickOnDELETELIST()
    {
        ConfirmFirstListOptionDeleteList.click();
    }

    public void checkLastScreen(String arg)
    {
        UIElement element = E(byAndroidUIAutomator("textContains(\"" + arg + "\")"));
        element.waitFor(5).untilNotVisible();
    }

}
