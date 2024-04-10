package commons;

import io.qameta.allure.Step;
import lombok.extern.slf4j.Slf4j;
import org.openqa.selenium.By;
import utils.MobileActions;

@Slf4j
public class ReusableComponents extends MobileActions {

    @Step("Click")
    public void click(By by) {
        log.info("Clicking the " + by);
        waitUntilElementClickable(by);
        clickElementBy(by);
    }
}

