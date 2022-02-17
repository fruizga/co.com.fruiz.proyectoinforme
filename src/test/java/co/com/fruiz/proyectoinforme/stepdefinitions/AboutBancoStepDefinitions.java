package co.com.fruiz.proyectoinforme.stepdefinitions;

import co.com.fruiz.proyectoinforme.tasks.OpenUp;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

public class AboutBancoStepDefinitions {
    @Before
    public void setStage () {
        OnStage.setTheStage(new OnlineCast());}

    @Given("^than faber wants to download the document Politicas de tratamiento y de proteccion de datos personales de proveedores$")
    public void thanFaberWantsToDownloadTheDocumentPoliticasDeTratamientoYDeProteccionDeDatosPersonalesDeProveedores() {
        OnStage.theActorCalled("Faber").wasAbleTo(OpenUp.thePage());
    }


    @When("^he searches for the document Politicas de tratamiento y de proteccion de datos personales de proveedores on the Bancolombia page$")
    public void heSearchesForTheDocumentPoliticasDeTratamientoYDeProteccionDeDatosPersonalesDeProveedoresOnTheBancolombiaPage() {

    }

    @Then("^he finds the document called resources Politicas de tratamiento y de proteccion de datos personales de proveedores$")
    public void heFindsTheDocumentCalledResourcesPoliticasDeTratamientoYDeProteccionDeDatosPersonalesDeProveedores() {

    }

}
