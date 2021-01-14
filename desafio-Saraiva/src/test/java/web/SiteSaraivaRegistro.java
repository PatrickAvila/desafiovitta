package web;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import tests.geradorCpf;

public class SiteSaraivaRegistro  extends geradorCpf {
    private WebDriver navegador;

    public SiteSaraivaRegistro(WebDriver navegador){
        this.navegador=navegador;
    }

    public SiteSaraivaRegistro digitarNome(String InputNome1){
        navegador.findElement(By.id("newUser")).findElement(By.name("InputNome1")).sendKeys(InputNome1);
        return this;
    }

    public SiteSaraivaRegistro digitarSobrenome(String InputSobrenome1){
        navegador.findElement(By.id("newUser")).findElement(By.name("InputSobrenome1")).sendKeys(InputSobrenome1);
        return this;
    }

    public SiteSaraivaRegistro digitarEmail(String InputEmail1){
        navegador.findElement(By.id("newUser")).findElement(By.name("InputEmail1")).sendKeys(InputEmail1);
        return this;
    }

    public SiteSaraivaRegistro digitarSenha(String InputSenha1){
        navegador.findElement(By.id("newUser")).findElement(By.name("InputSenha1")).sendKeys(InputSenha1);
        return this;
    }

    public SiteSaraivaRegistro confirmarSenha(String InputConfirmeSenha1){
        navegador.findElement(By.id("newUser")).findElement(By.name("InputConfirmeSenha1")).sendKeys(InputConfirmeSenha1);
        return this;
    }

    public SiteSaraivaRegistro digitarDataNascimento(String InputDataNascimento1){
        navegador.findElement(By.id("newUser")).findElement(By.name("InputDataNascimento1")).sendKeys(InputDataNascimento1);
        return this;
    }

    public SiteSaraivaRegistro digitarCelular(String InputCelular1){
        navegador.findElement(By.id("newUser")).findElement(By.name("InputCelular1")).sendKeys(InputCelular1);
        return this;
    }

    public SiteSaraivaRegistro digitarCep(String InputCep1){
        navegador.findElement(By.id("newUser")).findElement(By.name("InputCep1")).sendKeys(InputCep1);
        return this;
    }

    public SiteSaraivaRegistro digitarNumero(String InputNumero1){
        navegador.findElement(By.id("newUser")).findElement(By.name("InputNumero1")).click();
        navegador.findElement(By.id("newUser")).findElement(By.name("InputNumero1")).sendKeys(InputNumero1);
        return this;
    }

    public SiteSaraivaRegistro digitarComplemento(String InputComplemento1){
        navegador.findElement(By.id("newUser")).findElement(By.name("InputComplemento1")).sendKeys(InputComplemento1);
        return this;
    }

    public SiteSaraivaRegistro digitarTelefone(String InputTelefone1){
        navegador.findElement(By.id("newUser")).findElement(By.name("InputTelefone1")).sendKeys(InputTelefone1);
        return this;
    }

    public SiteSaraivaRegistro digitarCpf() throws Exception {
        String cpf = mostraResultado();
        navegador.findElement(By.id("newUser")).findElement(By.name("InputCpf1")).sendKeys(cpf);
        return this;
    }

    public SiteSaraivaRegistro clicarSexo(){
        WebElement radio1 = navegador.findElement(By.id("newUser")).findElement(By.name("InputSexo"));
        radio1.findElement(By.id("RadioMasculino1")).click();
        return this;
    }

    public SiteSaraivaRegistro clicarFinalizar(){
        navegador.findElement(By.id("newUser")).findElement(By.id("FinalizarCadastro1")).click();
        return this;
    }

    public paginaSite cadastro(String InputNome1,String InputSobrenome1,String InputEmail1,String InputSenha1,
                               String InputConfirmeSenha1,String InputDataNascimento1,String InputCelular1,
                               String InputCep1,String InputNumero1,String InputComplemento1,String InputTelefone1)
            throws Exception {

        digitarNome(InputNome1);
        digitarSobrenome(InputSobrenome1);
        digitarEmail(InputEmail1);
        digitarSenha(InputSenha1);
        confirmarSenha(InputConfirmeSenha1);
        digitarDataNascimento(InputDataNascimento1);
        digitarCelular(InputCelular1);
        digitarCep(InputCep1);
        digitarNumero(InputNumero1);
        digitarComplemento(InputComplemento1);
        digitarTelefone(InputTelefone1);
        digitarCpf();
        clicarSexo();
        clicarFinalizar();

        return new paginaSite(navegador);
    }
}
