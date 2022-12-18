import org.junit.jupiter.api.Test;

public class TheInternetTests extends TestBase {
    @Test
    void theInternetTest() {
        supportTheInternetTests.openTheInternetLink()
                .drugAndDropElementA()
                .checkResultOfChanging();
    }
}
