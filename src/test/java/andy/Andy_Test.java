package andy;

import extensions.AppiumExtension;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import pages.AbsBasePage;
import pages.MainPage;

@ExtendWith(AppiumExtension.class)
public class Andy_Test {

  @Test
  public void startPage() {
    new MainPage()
            .open()
            .clickNextButton();
  }

}
