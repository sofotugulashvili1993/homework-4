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

    @Test
    public void openChrome1() {
        open ("https://ee.ge/");
        $(byClassName("btn-register"),0).click();
        $(byText("სწრაფი რეგისტრაცია")).shouldBe(Condition.visible);
        $(byClassName("btn-disabled")).shouldBe(Condition.disabled);
        $(byId("firstName")).click();
        $(byId("lastName")).click();
        $(byText("სახელი სავალდებულოა")).shouldBe(Condition.visible);
        $(byId("email")).click();
        $(byText("გვარი სავალდებულოა")).shouldBe(Condition.visible);
        $(byId("password")).click();
        $(byText("ელ. ფოსტა სავალდებულოა")).shouldBe(Condition.visible);
        $(byId("confirmPassword")).click();
        $(byText("პაროლი სავალდებულოა.")).shouldBe(Condition.visible);
        $(byId("email")).click();
        $(byText("პაროლის გამეორება სავალდებულოა")).shouldBe(Condition.visible);
        $(byId("email")).setValue("test");
        $(byText("ელ. ფოსტა სავალდებულოა")).shouldBe(Condition.visible);
        $(byId("password")).setValue("test");
        $(byText("პაროლი სავალდებულოა.")).shouldBe(Condition.visible);
        $(byId("confirmPassword")).setValue("test1");
        $(byText("პაროლი სავალდებულოა.")).shouldBe(Condition.visible);
        $(byText("პაროლის გამეორება სავალდებულოა")).shouldBe(Condition.visible);
        sleep(5000);

    }

    @Test

    public void openChrome2() {
        open("https://ee.ge/");
        $(byXpath("//*[@id=\"__next\"]/div/div[3]/div/header/div/div[4]/button[3]/i/img")).click();
        $(byText("კალათა ცარიელია")).shouldBe(Condition.visible);
        $(byId("search_list")).click();
        $(byId("search_list")).setValue("კომპიუტერი").pressEnter();
        $(byClassName("btn-darkred"), 5).click();
        $(byXpath("//*[@id=\"__next\"]/div/header/div/div[4]/button[3]/i/img")).click();
        $(byText("კალათა ცარიელია")).shouldNotBe(Condition.visible);
        $(byText("წაშლა")).click();
        $(byText("კალათა ცარიელია")).shouldBe(Condition.visible);
        sleep(5000);
    }
    @Test

    public void openChrome3() {
        open("https://ee.ge/");
        $(byXpath("//*[@id=\"__next\"]/div/div[3]/div/header/div/div[4]/button[3]/i/img")).click();
        $(byText("კალათა ცარიელია")).shouldBe(Condition.visible);
        $(byText("შენახული ნივთები")).click();
        $(byText("ვერ მოიძებნა")).shouldBe(Condition.visible);
        $(byId("search_list")).click();
        $(byId("search_list")).setValue("კომპიუტერი").pressEnter();
        $(byClassName("btn-darkred"), 5).click();
        $(byXpath("//*[@id=\"__next\"]/div/header/div/div[4]/button[3]/i/img")).click();
        $(byClassName("redButton")).click();
        $(byText("შენახული ნივთები")).click();
        $(byText("ვერ მოიძებნა")).shouldNotBe(Condition.visible);
        $(byXpath("//*[@id=\"__next\"]/div/header/div/div[4]/button[3]/i/img")).click();
        $(byText("კალათა ცარიელია")).shouldBe(Condition.visible);
        $(byText("შენახული ნივთები")).click();
        $(byXpath("//*[@id=\"__next\"]/div/div[2]/div/div/div[2]/div[2]/div[2]/div/div[2]/div[1]/button")).click();
        $(byText("ვერ მოიძებნა")).shouldBe(Condition.visible);
        sleep(5000);
    }

    }




