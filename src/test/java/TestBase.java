import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;

public class TestBase {
    SupportGitHubTests supportGitHubTests = new SupportGitHubTests();
    SupportTheInternetTests supportTheInternetTests = new SupportTheInternetTests();

    @BeforeAll
    static void beforeAll() {
        Configuration.holdBrowserOpen = true;
        Configuration.browserSize = "1920x1080";
    }
}
