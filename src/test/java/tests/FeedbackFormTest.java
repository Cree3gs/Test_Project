package tests;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static tests.TestData.name;
import static tests.TestData.phone;

public class FeedbackFormTest extends TestBase {

    @Tag("alltest")
    @DisplayName("Проверка заполнения обязательных полей формы обратной связи")
    @Test
    void checkRequiredField() {
        open("/kontakty/");
        $("[name=cname-text-6]").setValue(name);
        $("[name=cphone-text-882]").setValue(phone);
        $("[name=acceptance-338]").click();
        $("[type=submit]").click();
        $(".wpcf7-response-output").shouldHave(text
                ("Одно или несколько полей содержат ошибочные данные. Пожалуйста, проверьте их и попробуйте ещё раз.")
        );
    }
}
