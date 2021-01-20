package tests;

import org.easetech.easytest.annotation.DataLoader;
import org.easetech.easytest.annotation.Param;
import org.easetech.easytest.runner.DataDrivenTestRunner;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import web.*;
import java.util.concurrent.TimeUnit;

@RunWith(DataDrivenTestRunner.class)
@DataLoader(filePaths = "cadastroUsuarioTest.csv")
//MUDE AS INFORMAÇÕES NO ARQUIVO CSV PRO TESTE PODER RODAR(EXISTE UMA VALIDAÇÃO DE E-MAIL, ENTÃO TEM QUE COLOCAR UM VALIDO)
//CASO NÃO TENHA EMAIL VALIDO INDICO ESSE SITE https://temp-mail.org/pt/

public class cadastroUsuarioTest  extends geradorCpf{
    private WebDriver navegador;

    @Before
    public void setUp(){
        navegador = webIniciarDriver.createChrome();
    }

    @Test

    public void testAdicionarUmNovoUsuario(@Param(name = "InputNome1")String InputNome1,
                                           @Param(name = "InputSobrenome1") String InputSobrenome1,
                                           @Param(name = "InputEmail1")String InputEmail1,
                                           @Param(name = "InputSenha1")String InputSenha1,
                                           @Param(name = "InputConfirmeSenha1") String InputConfirmeSenha1,
                                           @Param(name = "InputDataNascimento1")String InputDataNascimento1,
                                           @Param(name = "InputCelular1")String InputCelular1,
                                           @Param(name = "InputCep1")String InputCep1,
                                           @Param(name = "InputNumero1")String InputNumero1,
                                           @Param(name = "InputComplemento1")String InputComplemento1,
                                           @Param(name = "InputTelefone1")String InputTelefone1) throws Exception {


        //Page Objects
        new SaraivaSite(navegador).abreCadastro().cadastro(InputNome1,InputSobrenome1,InputEmail1,InputSenha1,
                InputConfirmeSenha1,InputDataNascimento1,InputCelular1,InputCep1,InputNumero1,InputComplemento1,InputTelefone1).site();

    }

    //Caso haja erro no test, comentar o after
/*    @After
    public void tearDown(){
        navegador.quit();
    }*/

}
