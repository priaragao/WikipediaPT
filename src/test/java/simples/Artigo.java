package simples;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class Artigo {
    String url;         //Endereço do site alvo
    WebDriver driver;   //Objeto do Selenium WebDriver

    @Before     //Antes do Teste
    public void iniciar(){
        url = "https://www.wikipedia.org/";
        //Onde está o Chrome Driver
        System.setProperty("webdriver.chrome.driver","drivers/chrome/89/chromedriver.exe");
        driver = new ChromeDriver(); // Instanciar o Selenium como Chrome Driver

        driver.manage().window().maximize(); //Maximizar a janela do navegador
        //Define uma espera implicita em 1 min, verificando o carregamento a cada 1 milisegundo
        driver.manage().timeouts().implicitlyWait(60000, TimeUnit.MILLISECONDS);
    }

    @Test   //Durane o Teste
    public void consultarArtigo(){
        //Abrir o site
        driver.get(url);

        //Pesquisar por "Lili Reinhart"
        driver.findElement(By.id("searchInput")).click(); //Clica
        driver.findElement(By.id("searchInput")).clear(); //Limpa
        driver.findElement(By.id("searchInput")).sendKeys("Lili Reinhart") ;
        driver.findElement(By.cssSelector("button.pure-button.pure-button-primary-progressive")).click(); //Clica em buscar

        //Validar o titulo da página de retorno
        //assertEquals("Lili Reinhart - Wikipédia, a enciclopédia livre", driver.getTitle()); //Verifica o titulo
        assertTrue(driver.getTitle().contains("Lili Reinhart")); //Contem no titulo LiLi Reinhart


    }

    @After  //Depois do Teste
    public void finalizar(){
        driver.quit();
    }
}
