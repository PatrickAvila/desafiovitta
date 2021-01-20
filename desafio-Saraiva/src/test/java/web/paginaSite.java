package web;

import org.openqa.selenium.WebDriver;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class paginaSite {
    private WebDriver navegador;

    public paginaSite(WebDriver navegador){
        this.navegador=navegador;
    }

    public paginaSite site(){
        List<String> abas = new ArrayList<>(navegador.getWindowHandles());
        navegador.switchTo().window(abas.get(1));
        return this;
    }
}
