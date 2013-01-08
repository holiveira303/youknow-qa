package br.com.affero.youknow.test;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FooTest
{
	private PaginaUm paginaUm;
	PaginaDois paginaDois;
	PaginaTres paginaTres;

	@Before
	public void prepareComponents()
	{
		WebDriver driver = new FirefoxDriver();

		paginaDois = new PaginaDois(driver, "selenium");
		paginaTres = new PaginaTres(driver, paginaDois, "example", "top secret");
		paginaUm = new PaginaUm(driver, paginaTres);
	}

	@Test
	public void demonstrateNestedLoadableComponents()
	{
		paginaUm.get();
		paginaUm.submit();
		paginaDois.submit();
		
	}
}
