package grid;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

import java.net.URL;

public class Teste {

    @Test
    public void sampleTest() {
        System.out.println("TESTE 1");
        try {
            DesiredCapabilities desi = new DesiredCapabilities();
            desi.setBrowserName("chrome");
            desi.setPlatform(Platform.WINDOWS);
            WebDriver driver = new RemoteWebDriver(new URL("http://192.168.56.1:4444/wd/hub"), desi);
            driver.manage().window().maximize();
            driver.get("https://www.google.com.br/");
            System.out.println("Title of the page is " + driver.getTitle());
            Thread.sleep(3000);
            driver.quit();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void sampleTest2() {
        System.out.println("TESTE 2");
        try {
            DesiredCapabilities desi = new DesiredCapabilities();
            desi.setBrowserName("chrome");
            desi.setPlatform(Platform.WINDOWS);
            WebDriver driver = new RemoteWebDriver(new URL("http://192.168.56.1:4444/wd/hub"), desi);
            driver.manage().window().maximize();
            driver.get("https://www.google.com.br/");
            System.out.println("Title of the page is " + driver.getTitle());
            Thread.sleep(3000);
            driver.quit();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void sampleTest3() {
        System.out.println("TESTE 3");
        try {
            DesiredCapabilities desi = new DesiredCapabilities();
            desi.setBrowserName("chrome");
            desi.setPlatform(Platform.WINDOWS);
            WebDriver driver = new RemoteWebDriver(new URL("http://192.168.56.1:4444/wd/hub"), desi);
            driver.manage().window().maximize();
            driver.get("https://www.google.com.br/");
            System.out.println("Title of the page is " + driver.getTitle());
            Thread.sleep(3000);
            driver.quit();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void sampleTest4() {
        System.out.println("TESTE 4");
        try {
            DesiredCapabilities desi = new DesiredCapabilities();
            desi.setBrowserName("chrome");
            desi.setPlatform(Platform.WINDOWS);
            WebDriver driver = new RemoteWebDriver(new URL("http://192.168.56.1:4444/wd/hub"), desi);
            driver.manage().window().maximize();
            driver.get("https://www.google.com.br/");
            System.out.println("Title of the page is " + driver.getTitle());
            Thread.sleep(3000);
            driver.quit();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void sampleTest5() {
        System.out.println("TESTE 5");
        try {
            DesiredCapabilities desi = new DesiredCapabilities();
            desi.setBrowserName("chrome");
            desi.setPlatform(Platform.WINDOWS);
            WebDriver driver = new RemoteWebDriver(new URL("http://192.168.56.1:4444/wd/hub"), desi);
            driver.manage().window().maximize();
            driver.get("https://www.google.com.br/");
            System.out.println("Title of the page is " + driver.getTitle());
            Thread.sleep(3000);
            driver.quit();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
