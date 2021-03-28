import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.conditions.Text;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.open;


import com.codeborne.selenide.SelenideElement;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class testIssues {
}
    @Test
    void searchForIssue() {
        open("https://github.com");
        $("#.header-search-input").click();
        $("")