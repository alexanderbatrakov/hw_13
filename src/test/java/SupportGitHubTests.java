import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.*;

public class SupportGitHubTests {
    public SupportGitHubTests openGitHubLink() {
        open("https://github.com/");
        return this;
    }

    public SupportGitHubTests hoverToSolutionsButton() {
        $$("li").findBy(text("Solutions")).hover();
        return this;
    }

    public SupportGitHubTests clickOnEnterpriseButton() {
        $$("ul li a").findBy(text("Enterprise")).click();
        return this;
    }

    public SupportGitHubTests checkHeaderOfEnterprisePage() {
        $$("div h1").findBy(text("Build like the best")).should(visible);
        return this;

    }
}
