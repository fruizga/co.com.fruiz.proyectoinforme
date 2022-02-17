package co.com.fruiz.proyectoinforme.tasks;

import co.com.fruiz.proyectoinforme.userinterface.BancolombiaAboutPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class AboutUs implements Task {
    public static AboutUs onThePage() {return Tasks.instrumented(AboutUs.class);}

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(BancolombiaAboutPage.ABOUT_BUTTON),
                Click.on(BancolombiaAboutPage.CORP_INFO),
                Click.on(BancolombiaAboutPage.PROVIDER_OPTION),
                Click.on(BancolombiaAboutPage.DATA_POLICY_BUTTON)
        );
    }
}
