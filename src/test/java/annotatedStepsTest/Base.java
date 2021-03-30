package annotatedStepsTest;

import io.qameta.allure.Step;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.withText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class Base {
    String REPOSITORY = "Konyaz/currant_allure";
    String BASE_URL = "https://github.com";

    @Step("Открываем главную страницу")
    public void openMainPage() {
        open(BASE_URL);
    }

    @Step("Ищем репозиторий")
    public void searchForRepository(String repository) {
        $(".header-search-input").click();
        $(".header-search-input").sendKeys(repository);
        $(".header-search-input").submit();
    }

    @Step("Переходим в репозиторий")
    public void goToRepository(String repository) {
        $(By.linkText(repository)).click();
    }

    @Step("Проверяем что Issue существует")
    public void shouldSeeIssueText() {
        $(".UnderlineNav-body").shouldHave(text("Issue"));
    }

}
