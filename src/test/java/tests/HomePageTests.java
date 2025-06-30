package tests;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import pages.MainPage;

import java.util.stream.Stream;

@Tag("alltest")
@Tag("mainpage")
public class HomePageTests extends TestBase {

    MainPage mainPage = new MainPage();

    @MethodSource()
    @ParameterizedTest(name = "Пункт меню {0} должен содержать ссылку {1}")
    void menuItemsShouldHaveLinkTest(String itemName, String itemLink) {
        mainPage
                .openMainPage()
                .checkItemsLink(itemName, itemLink);
    }

    static Stream<Arguments> menuItemsShouldHaveLinkTest() {
        return Stream.of(
                Arguments.of("О нас", "https://pro-vzglyad.ru/ob-uchebnom-tsentre/"),
                Arguments.of("Тренеры", "https://pro-vzglyad.ru/trenery/"),
                Arguments.of("Курсы", "https://pro-vzglyad.ru/course/vse/"),
                Arguments.of("Онлайн-обучение", "https://pro-vzglyad.ru/course/online/"),
                Arguments.of("Расписание курсов", "https://pro-vzglyad.ru/raspisanie-kursov/"),
                Arguments.of("Контакты", "https://pro-vzglyad.ru/kontakty/"),
                Arguments.of("Блог", "https://pro-vzglyad.ru/blog/"),
                Arguments.of("Скидки", "https://pro-vzglyad.ru/sistema-loyalnosti/"),
                Arguments.of("Моделям", "https://pro-vzglyad.ru/modelyam/")
        );
    }

    @DisplayName("Проверка контактной информации")
    @Test
    void availabilityOfContactInformation() {
        mainPage
                .openMainPage()
                .checkYandexMap()
                .checkTheSectionHowToGetThere()
                .checkingLinksToSocialNetworks()
                .checkingInformationAboutTheOperatingMode();
    }
}

