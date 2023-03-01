


import com.codeborne.selenide.Condition;
import org.junit.Test;

import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.files.DownloadActions.click;


import com.codeborne.selenide.SelenideElement.*;

import org.openqa.selenium.Keys;

import java.time.Duration;

public class FirstTest {
    @Test
    public void googleTast() {

        System.setProperty("selenide.browserSize", "1980x1080");
        open("https://ee.ge/");
        $(byId("rcc-confirm-button")).click();
       // SelenideElement selector = $("რეგისტრაცია");
     //   System.out.println($("რეგისტრაცია"));

         $(byClassName("btn-register")).click();
         $(byId("firstName")).setValue("Natia").shouldNotBe(Condition.empty, Duration.ofMillis(5000));
         $(byId("lastName")).setValue("Baliashvili").shouldNotBe(Condition.empty, Duration.ofMillis(5000));
         $(byId("email")).setValue("gnatiabaliashvili@gmail.com").shouldNotBe(Condition.empty);
         $(byId("password")).setValue("Testtest1").shouldNotBe(Condition.empty);
         $(byId("confirmPassword")).setValue("Testtest1").shouldNotBe(Condition.empty);
         $(byId("singup")).shouldNotBe(Condition.empty);
         $(byId("singup")).shouldNotBe(Condition.enabled);

         sleep(3000);}

          @Test
     public void googleTest_1(){
        System.setProperty("selenide.browserSize", "1980x1080");
        open("https://ee.ge/");


              $(byClassName("cart-count")).click();
              $(byText("კალათა ცარიელია")).shouldBe(Condition.visible);
              $(byClassName("unexpanded")).$(byText("შენახული ნივთები")).click();
              $(byText("ვერ მოიძებნა")).shouldBe(Condition.visible);
              $(byId("search_list")).setValue("მობილური").pressEnter();
              $(byClassName("button-section")).$(byClassName("add_to_cart")).click();
              $(byClassName("btn-darkred")).click();
              $(byText("კალათა ცარიელია")).shouldNotBe(Condition.visible,Duration.ofMillis(5000));
              $(byClassName("redButton")).click();
              $(byClassName("unexpanded")).$(byText("შენახული ნივთები")).click();
              $(byText("ვერ მოიძებნა")).shouldNotBe(Condition.visible);
              $(byClassName("btn-cart")).click();
              $(byText("კალათა ცარიელია")).shouldBe(Condition.visible);


           sleep(3000);
    }
}
