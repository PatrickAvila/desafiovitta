package web;

import org.openqa.selenium.WebDriver;

public class paginaSite {
    private WebDriver navegador;

    public paginaSite(WebDriver navegador){
        this.navegador=navegador;
    }

    public paginaSite site(){
        navegador.get("https://www.saraiva.com.br/");
        return this;
    }
}
