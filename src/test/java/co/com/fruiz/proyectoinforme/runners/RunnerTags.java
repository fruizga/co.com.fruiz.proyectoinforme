package co.com.fruiz.proyectoinforme.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/features/aboutBanco.feature",
        tags="@stories",
        glue="co.com.fruiz.proyectoinforme.stepdefinitions",
        snippets=SnippetType.CAMELCASE)
public class RunnerTags {

}