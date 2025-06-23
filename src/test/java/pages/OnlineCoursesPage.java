package pages;

import io.qameta.allure.Step;
import tests.TestBase;


import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class OnlineCoursesPage extends TestBase {

    @Step("Открыть гланую страницу")
    public OnlineCoursesPage openMainPage() {
        open("");
        return this;
    }

    @Step("Открыть страницу онлайн курсов")
    public OnlineCoursesPage openOnlineCoursePage() {
        open("/course/online/");
        return this;
    }

    @Step("Перейти в раздел")
    public OnlineCoursesPage goToSection(String idSection, String headerSection) {
        $(idSection).$(".btn").click();
        $("#main").shouldHave(text(headerSection));
        return this;
    }

    @Step("Отфильтровать по значению Онлайн-урок")
    public OnlineCoursesPage onlineLessonsFilterCheck(String filterName, String cardText) {
        $(".t__headerlink[" + filterName+ "]").click();
        $("div.c__list-item-title").shouldHave(text(cardText));
        return this;
    }
}
