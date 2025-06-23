package tests;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import pages.OnlineCoursesPage;

import java.util.stream.Stream;

@Tag("onlinecourse")
public class OnlineTrainingTests extends TestBase {
    OnlineCoursesPage onlineCoursesPage = new OnlineCoursesPage();

    @MethodSource()
    @ParameterizedTest(name = "Проверка корректности перехода в раздел {1}")
    void transitionToTrainingSectionsTest(String idSection, String headerSection) {
        onlineCoursesPage
                .openMainPage()
                .goToSection(idSection, headerSection);
    }
    static Stream<Arguments> transitionToTrainingSectionsTest() {
        return Stream.of(
                Arguments.of(".service_71", "Онлайн обучение"),
                Arguments.of(".service_56", "Курсы наращивания ресниц"),
                Arguments.of(".service_55", "Курсы ламинирования ресниц"),
                Arguments.of(".service_4", "Курсы коррекции и окрашивания бровей")
        );
    }
    @MethodSource()
    @ParameterizedTest(name = "Проверка корректности работы фильтра {1}")
    void checkingTheFilterOperation(String filterName, String headerSection){
        onlineCoursesPage
                .openOnlineCoursePage()
                .onlineLessonsFilterCheck(filterName, headerSection);
    }
    static Stream<Arguments> checkingTheFilterOperation() {
        return Stream.of(
                Arguments.of("href=\"?type=lesson\"", "Онлайн-урок"),
                Arguments.of("href=\"?type=course\"", "Онлайн-курс"),
                Arguments.of("href=\"?type=webinar\"", "Вебинар")
        );
    }
}
