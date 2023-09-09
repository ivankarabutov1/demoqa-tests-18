import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class TextBoxTests extends BaseTest  {


    @Test
    void fillFormTest(){
        open("/text-box");
        $("[id=userName]").setValue("Ivan   Ivanov");
        $("[id=userEmail]").setValue("IvanIvanov@mi.com");
        $("[id=currentAddress]").setValue("Moscow, Manezhnaya street");
        $("[id=permanentAddress]").setValue("Taganrog, first street");
        $("#submit").click();
        $("#output").shouldHave(text("Ivan Ivanov"),text("IvanIvanov@mi.com"),text("Moscow, Manezhnaya street"),text("Taganrog, first street"));

    }
}
