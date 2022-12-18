import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;

public class SupportTheInternetTests {
    public SupportTheInternetTests openTheInternetLink() {
        open("https://the-internet.herokuapp.com/drag_and_drop");
        return this;
    }

    public SupportTheInternetTests drugAndDropElementA() {
        //actions().moveToElement($("#column-a")).clickAndHold().moveByOffset(300, 200).release().perform();
        $("#column-a").dragAndDropTo("#column-b");
        return this;

    }

    public SupportTheInternetTests checkResultOfChanging() {
        $("#column-a header").shouldHave(text("B"));
        return this;
    }

}
