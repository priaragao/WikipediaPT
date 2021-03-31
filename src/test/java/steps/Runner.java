package steps;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        dryRun = false, //formatacao de log
        monochrome = false, //formatacao de log
        features = "src/test/resources/features", //onde estao as features
        glue = "steps", //onde estao os passos
        plugin = {
                "pretty",
                "html:target/relatorioSimples",
                "json:target/relatorioSimples.json",
                "com.vimalselvam.cucumber.listener.ExtentCucumberFormatter:target/dashboard.html"
        }
)
public class Runner {

}
