import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(monochrome = true,
        features = {
                "src/test/resources/features.smoke/5.2.1.1_Rearrangement_of_the_head_side.feature",
                "src/test/resources/features.smoke/5.2.2.1_Sort_By_Year.feature",
                "src/test/resources/features.smoke/5.2.2.2_Sort_By_Genre.feature",
                "src/test/resources/features.smoke/5.2.2.3_Sort_By_Country.feature",
                "src/test/resources/features.smoke/5.2.2.4_Search.feature",
                "src/test/resources/features.smoke/5.2.2.5_Random_Films.feature",
                "src/test/resources/features.smoke/5.2.3.1_Cabinet_Guest.feature",
                "src/test/resources/features.smoke/5.2.3.2_Cabinet_User.feature",
                "src/test/resources/features.smoke/5.2.4.1_Page_Of_Film_By_Guest.feature",
                "src/test/resources/features.smoke/5.2.4.2_Page_Of_Film_By_User.feature",
                "src/test/resources/features.smoke/5.2.5.1_Log_In.feature",
                "src/test/resources/features.smoke/5.2.5.2_Registration.feature",
                "src/test/resources/features.smoke/5.2.5.3_Log_Out.feature",
                "src/test/resources/features.smoke/5.2.6.1_Add_Film.feature",
                //"src/test/resources/features.smoke/5.2.6.2_Delete_Film.feature",
                "src/test/resources/features.smoke/5.2.7.1_Add_Commentary.feature",
                "src/test/resources/features.smoke/5.2.7.2_Add_Rating.feature",
                "src/test/resources/features.smoke/5.2.7.3_Donation.feature"
        },
        glue = "StepDefinitions")

public class RunTests {

}
