import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.conditions.Text;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.open;


import com.codeborne.selenide.SelenideElement;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;
import static io.qameta.allure.Allure.step;

public class TestIssueLambda {
    String repository = "Konyaz/currant_allure";
    String BASE_URL = "https://github.com";

    @Test

    public void TestIssueSearch() {
        step("Открываем главную страницу", (step) -> {
            step.parameter("url", BASE_URL);
            open(BASE_URL);
        });


        step("Ищем репозиторий", (step) -> {
            $(".header-search-input").click();
            $(".header-search-input").sendKeys(repository);
            $(".header-search-input").submit();
        });
        step("Переходим в репозиторий", () -> {
            $(By.linkText(repository)).click();
        });
        step("Проверяем что Issue существует", () -> {
            $(".UnderlineNav-body").shouldHave(text("Issue"));
        });

    }

}
