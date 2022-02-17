package co.com.fruiz.proyectoinforme.userinterface;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class BancolombiaAboutPage {
    public static final Target ABOUT_BUTTON = Target.the("button to go to " +
            "About pabe").located(By.id("header-nosotros"));
    public static final Target CORP_INFO = Target.the("option to o to corporate " +
            "info").located(By.id("serv"));
    public static final Target PROVIDER_OPTION = Target.the("option to o to providers " +
            "info").located(By.xpath("//*[@id=\"menu-sup\"]/li[4]/ul/div/div/div[1]/div/div[2]/div[2]/div/a"));
    public static final Target DATA_POLICY_BUTTON = Target.the("button to download " +
            "the needed document").located(By.xpath("//*[@id=\"wizard2\"]/div/div[3]/div/div[1]/div/p[2]/a"));
}

