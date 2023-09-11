import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;

public class BaseTest {
     public BaseTest(){

     }
    @BeforeAll
    static void beforeAll() {
        Configuration.timeout = 60000;
        Configuration.browserSize="1920 x 1080";
        Configuration.baseUrl="https://demoqa.com";
        Configuration.pageLoadStrategy = "eager";
        Configuration.holdBrowserOpen = true;

    }

}
