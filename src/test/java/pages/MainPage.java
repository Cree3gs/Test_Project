package pages;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class MainPage {

    private final SelenideElement
    navigationMenu = $("#nav"),
    yandexMap = $("#bmap"),
    howFind = $(".hf__contacts-how-find"),
    leftContactContent = $(".hf__contacts-content-left"),
    contactsSocialTitle = $(".hf__contacts-social-title"),
    vkSocialGroup = $(".vk"),
    youTubeChanel = $(".yb"),
    informationAboutTheOperatingMode = $(".hf__contacts-content-right div");

    @Step("Открыть гланую страницу")
    public MainPage openMainPage(){
        open("");
        return this;
    }

    @Step("Проверить наличие ссылок в меню навигации")
    public MainPage checkItemsLink(String itemName, String itemLink){
        navigationMenu.$(byText(itemName)).shouldHave(href(itemLink));
        return this;
    }

    @Step("Проверить отображение карты в разделе контактной информации")
    public MainPage checkYandexMap(){
        yandexMap.shouldBe(visible);
        return this;
    }

    @Step("Проверка раздела Как добраться")
    public MainPage checkTheSectionHowToGetThere(){
        howFind.shouldHave(href("https://pro-vzglyad.ru/kontakty/#howtofind"));
        howFind.shouldHave(text("Как добраться"));
        leftContactContent.shouldHave(text("Московские ворота (СПб): "));
        leftContactContent.shouldHave(text("10 мин."));
        leftContactContent.shouldHave(text("Электросила (СПб): "));
        leftContactContent.shouldHave(text("20 мин."));
        leftContactContent.shouldHave(text("Верхние Лихоборы (Мск): "));
        leftContactContent.shouldHave(text("5 мин."));
        return this;
    }

    @Step("Проверка наличия ссылок на соц сети")
    public MainPage checkingLinksToSocialNetworks(){
        contactsSocialTitle.shouldHave(text("Подписывайтесь!"));
        vkSocialGroup.shouldHave(href("https://vk.com/pro_vzglyad_ru"));
        youTubeChanel.shouldHave(href("https://www.youtube.com/channel/UCgy0jUT8JgOdU9AsZ8yhNbw"));
        return this;
    }

    @Step("Проверка наличия информации о режиме работы")
    public MainPage checkingInformationAboutTheOperatingMode(){
        informationAboutTheOperatingMode.shouldHave(text("Режим работы: СПб с 9:00 до 21:00 без выходных (сб-вс с 10:00) Мск Магазин открыт в дни проведения курсов. Для уточнения информации о графике работы свяжитесь с нами через WhatsApp по номеру:  8(911)910-07-37"));
        return this;
    }

}