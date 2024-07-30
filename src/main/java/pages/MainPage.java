package pages;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.files.DownloadActions.click;

public class MainPage extends AbsBasePage<MainPage>{

  public void clickNextButton() {
    $("button.next").click();
  }
}
