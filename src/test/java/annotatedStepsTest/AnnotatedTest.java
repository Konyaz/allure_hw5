
package annotatedStepsTest;

import io.qameta.allure.Feature;
import io.qameta.allure.Link;
import io.qameta.allure.Owner;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Story;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


@DisplayName("Набор тест с аннотациями")
public class AnnotatedTest {
    String repository = "Konyaz/currant_allure";
    private WebSteps step = new WebSteps();

    @Test

    @Owner("konyaz")
    @Feature("Работа с разметкой")
    @Story("Разметка аннотаций")
    @Severity(SeverityLevel.BLOCKER)
    @Link(name = "BaseURL", url = "https://github.com")
    @DisplayName("Пример теста с аннотациями")
    public void testSomething() {
        step.openMainPage();
        step.searchForRepository(repository);
        step.goToRepository(repository);
        step.shouldSeeIssueText();

    }
}
