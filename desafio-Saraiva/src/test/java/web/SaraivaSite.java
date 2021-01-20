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


        //Navegando pela página de cadastro
        //CASO APAREÇA NO PROMPT QUE O BOTÃO FOI INTERROMPIDO É PQ A PÁGINA NÃO CARREGOU, SÓ EXECUTAR NOVAMENTE QUE FUNCIONA
        navegador.findElement(By.cssSelector("a[class='btn btn--block btn-large m-t-15 cadastrar-usuario']")).click();


        return new SiteSaraivaRegistro(navegador);
    }
}
