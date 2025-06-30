# Test_Project

<a href="https://pro-vzglyad.ru/ "> <img src="media/logo.png" width="300" height="300"> 
<h2 >Test_Project по автоматизации тестирования для компании <a href="https://pro-vzglyad.ru/ "> PRO Взгляд</a></h2> 

## ☑️ Содержание:

- Технологии и инструменты
- Список проверок, реализованных в тестах
- Запуск тестов (сборка в Jenkins) и из терминала
- Allure-отчет
- Уведомление в Telegram о результатах прогона тестов
- Видео пример прохождения тестов

<a id="tools"></a>

## ☑️ Технологии и инструменты:

| Java                                                                                                           | IntelliJ  <br>  Idea                                                                                                              | GitHub                                                                                                                 | JUnit 5                                                                                                     | Gradle                                                                                                           | Selenide                                                                                                   | Selenoid                                                                                                            | Java <br> Faker                                                                                                    | Allure <br> Report                                                                                                   | Jenkins                                                                                                    | Telegram                                                                                                      |
|:---------------------------------------------------------------------------------------------------------------|-----------------------------------------------------------------------------------------------------------------------------------|------------------------------------------------------------------------------------------------------------------------|-------------------------------------------------------------------------------------------------------------|------------------------------------------------------------------------------------------------------------------|------------------------------------------------------------------------------------------------------------|---------------------------------------------------------------------------------------------------------------------|--------------------------------------------------------------------------------------------------------------------|----------------------------------------------------------------------------------------------------------------------|------------------------------------------------------------------------------------------------------------|---------------------------------------------------------------------------------------------------------------|
| <a href="https://www.java.com/"><img src="media/java-svgrepo-com.svg" width="60" height="60"  alt="Java"/></a> | <a href="https://www.jetbrains.com/idea/"><img src="media/intellij-idea-svgrepo-com.svg" width="60" height="60"  alt="IDEA"/></a> | <a href="https://github.com/"><img src="media/github-badge-svgrepo-com.svg" width="60" height="60"  alt="Github"/></a> | <a href="https://junit.org/junit5/"><img src="media/Junit5.svg" width="60" height="60"  alt="JUnit 5"/></a> | <a href="https://gradle.org/"><img src="media/gradle-svgrepo-com.svg" width="60" height="60"  alt="Gradle"/></a> | <a href="https://selenide.org/"><img src="media/Selenide.svg" width="60" height="60"  alt="Selenide"/></a> | <a href="https://aerokube.com/selenoid/"><img src="media/Selenoid.svg" width="60" height="60"  alt="Selenoid"/></a> | <a href="https://dius.github.io/java-faker/"><img src="media/faker.png" width="200" height="40"  alt="Faker"/></a> | <a href="https://github.com/allure-framework"><img src="media/Allure.svg" width="60" height="60"  alt="Allure"/></a> | <a href="https://www.jenkins.io/"><img src="media/Jenkins.svg" width="60" height="60"  alt="Jenkins"/></a> | <a href="https://web.telegram.org/"><img src="media/Telegram.svg" width="60" height="60" alt="Telegram"/></a> |

<a id="cases"></a>

## ☑️ Реализованные проверки:

- Проверка меню навигации
- Проверка контактной информации
- Проверка корректности переходов в разделы обучения
- Проверка корректной работы фильтра в разделе обучения
- Проверка заполнения обязательных полей формы обратной связи

## <img alt="Jenkins" src="media/Jenkins.svg" width="40" height="40"/> Сборка в [Jenkins](https://jenkins.autotests.cloud/job/001-sobaka_govorit_muu_Test_Project_java_35_jenkins/build?delay=0sec)

<p align="center">  
<img src="media/JenkinsBuild.png" alt="Jenkins" width="950"/></a>  
</p>

## ☑️ Параметры сборки в Jenkins:

- browser (браузер, по умолчанию chrome)
- browserVersion (версия браузера, по умолчанию 127.0)
- browserSize (размер окна браузера, по умолчанию 1920x1080)
- selenoidCredentials (логин и пароль)
- selenoidUrl (адрес Selenoid)

## Команда для запуска из терминала

Локальный запуск

```bash
gradle clean ${TASK}
```

Запуск с параметрами:

```bash  
-Dbrowser=chrome "-Dversion=127" "-Dresolution=1920x1080" "-DselenoidCredentials=*****:****@" "-DselenoidUrl=-selenoid.autotests.cloud"
```

Удаленный запуск через Jenkins:

```bash  
clean ${TASK} 
-Dselenoid.url=${SELENOID_URL} 
-Dselenoid.login=${SELENOID_LOGIN} 
-Dselenoid.password=${SELENOID_PASSWORD} 
-Dbrowser=${BROWSER} 
-Dbrowser.version=${BROWSER_VERSION} 
-Dbrowser.size=${BROWSER_SIZE}
```

## <img alt="Allure" src="media/Allure.svg" height="40" width="40"/></a>  <a name="Allure"></a>Allure [Report](https://jenkins.autotests.cloud/job/001-sobaka_govorit_muu_Test_Project_java_35_jenkins/8/allure/#suites/7f9d8baf248447e4d019dfa37c0ac4ba/b72c556894322309/)    </a>

## Основная страница отчёта

<p align="center">  
<img title="Allure Overview Dashboard" src="media/AllureReport.png" width="850">  
</p>  

____

## <img alt="Allure" src="media/Telegram.svg" height="40" width="40"/></a> Уведомление в Telegram при помощи бота

____
<p align="center">  
<img title="Allure Overview Dashboard" src="media/tgAllert.png" width="550">  
</p>

____

## <img alt="Selenoid" src="media/Selenoid.svg" height="40" width="40"/></a> Примеры видео выполнения тестов на Selenoid

____
<p align="center">
<img title="Selenoid Video" src="media/test_video.gif" width="550" height="350"  alt="video">   
</p>