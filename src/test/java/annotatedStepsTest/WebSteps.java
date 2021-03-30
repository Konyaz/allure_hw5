
package annotatedStepsTest;

import com.codeborne.selenide.Condition;
import io.qameta.allure.Step;
import org.openqa.selenium.By;

import java.util.Random;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.withText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class WebSteps {


    @Step("Открываем главную страницу")
    public void openMainPage() {
        open("https://github.com");
    }

    @Step("Ищем репозиторий")
    public void searchForRepository(String repository) {
        $(".header-search-input").click();
        $(".header-search-input").sendKeys("Konyaz/currant_allure");
        $(".header-search-input").submit();
    }

    @Step("Переходим в репозиторий")
    public void goToRepository(String repository) {
        $(By.linkText("Konyaz/currant_allure")).click();
    }

    @Step("Проверяем что Issue существует")
    public void shouldSeeIssueText() {
        $(".UnderlineNav-body").shouldHave(text("Issue"));

    }

}
