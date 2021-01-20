package web;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.ArrayList;
import java.util.List;

public class SaraivaSite {
    private WebDriver navegador;

    public SaraivaSite(WebDriver navegador){
        this.navegador = navegador;
    }

    public SiteSaraivaRegistro abreCadastro(){
        //Clicar no link que possui o texto "Entre ou cadastre-se"
        navegador.findElement(By.id("link-account")).click();

        navegador.findElement(By.id("vtexIdUI-saraiva-oauth")).click();
        List<String> abas = new ArrayList<>(navegador.getWindowHandles());
        navegador.switchTo().window(abas.get(1));

        WebDriverWait wait = new WebDriverWait(navegador, 1000);
        wait.until(ExpectedConditions.numberOfWindowsToBe(2));


        //Navegando pela página de login com o botão de cadastrar
        //navegador.get("https://login.saraiva.com.br/authorization_code?clientId=authorization_code&redirect_uri=https%3A%2F%2Fvtexid.vtex.com.br%2FVtexIdAuthSiteKnockout%2FReceiveAuthorizationCode.ashx&state=eyJhbGciOiJFUzI1NiIsImtpZCI6IjdDQzEwNEZCRUJDNjNEQ0ZCMjY4NzZCMjc0MTRFNEYyMEI2Nzg5QzEiLCJ0eXAiOiJqd3QifQ.eyJzdWIiOiJGRDg4MzBCMDlGM0VFMTI2NUNGODY1NDQyNEUyNEU0Rjc0RjA5NjBFNEZDQjRGMTY2MzUwRUExOTExRjk1Q0I5IiwiaXNzIjoidG9rZW4tZW1pdHRlciIsImV4cCI6MTYxMDU2MzY4MiwicHJvdmlkZXIiOiJDbGllbnRlIFNhcmFpdmEiLCJpYXQiOjE2MTA1NjMwODIsImp0aSI6ImM4Y2U1ZWI3LTdiZjgtNDc1Zi05OWIxLTVlODBiZGQxMzUyYiJ9.FnKvFAH4Hzo8tLEnVSWbDXRbnaCU-Z-JQfznpJbDvzl4ATkIjf3a2Yrza1zfSnFa5ikFLedGCVglLZ3g7xBRUQ");

        //Navegando pela página de cadastro
        navegador.findElement(By.cssSelector("a[class='btn btn--block btn-large m-t-15 cadastrar-usuario']")).click();


        return new SiteSaraivaRegistro(navegador);
    }
}
