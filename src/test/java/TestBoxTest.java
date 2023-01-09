import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.*;

public class TestBoxTest {
    @Test
     void testBoxTest(){
        open("https://demoqa.com/text-box");
        executeJavaScript("$('footer').remove()");
        executeJavaScript("$('#fixedban').remove()");
        $(".main-header").shouldHave(text("Text Box"));
        $("#userName").setValue("Надежда");
        $("#userEmail").setValue("nadyafrol@yandex.ru");
        $("#currentAddress").setValue("Актобе");
        $("#permanentAddress").setValue("Казань");
        $("#submit").click();
        $("#output").shouldBe(visible);
        $("#output").$("#name").shouldHave(text("Надежда"));
        $("#output").$("#email").shouldHave(text("nadyafrol@yandex.ru"));
        $("#output").$("#currentAddress").shouldHave(text("Актобе"));
        $("#output").$("#permanentAddress").shouldHave(text("Казань"));
    }
}
