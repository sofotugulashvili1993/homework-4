import com.codeborne.selenide.Condition;
import com.codeborne.selenide.selector.ByText;
import org.junit.Test;

import static com.codeborne.selenide.Selectors.byName;
import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;


public class hw4 {
    @Test
    public void openChrome() {
        open("https://ee.ge/");
        $(byClassName("btn-register"), 0).click();
        $(byText("სწრაფი რეგისტრაცია")).shouldBe(Condition.visible);
        $(byId("firstName")).setValue("Sofo");
        $(byId("firstName")).shouldNotBe(Condition.empty);
        $(byId("lastName")).setValue("Tugulashvili");
        $(byId("lastName")).shouldNotBe(Condition.empty);
        $(byId("email")).setValue("stugulashvili@gmail.com");
        $(byId("email")).shouldNotBe(Condition.empty);
        $(byId("password")).setValue("test123");
        $(byId("confirmPassword")).setValue("test123");
        $(byId("singup")).shouldBe(Condition.enabled);
        sleep(10000);

    }



}
