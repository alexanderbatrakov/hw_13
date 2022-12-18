import org.junit.jupiter.api.Test;

public class GitHubTests extends TestBase {
    @Test
    void gitHubTestFor13HW() {
        supportGitHubTests.openGitHubLink()
                .hoverToSolutionsButton()
                .clickOnEnterpriseButton()
                .checkHeaderOfEnterprisePage();

    }
}
