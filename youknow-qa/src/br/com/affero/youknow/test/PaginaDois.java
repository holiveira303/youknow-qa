package br.com.affero.youknow.test;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.LoadableComponent;

public class PaginaDois extends LoadableComponent<PaginaDois>
{

	private final WebDriver driver;
	private final String projectName;

	public PaginaDois(WebDriver driver, String projectName)
	{
		this.driver = driver;
		this.projectName = projectName;
	}

	@Override
	protected void load()
	{
		driver.get("file:///C:/Users/luis.azevedo/Desktop/FOLDER/dois.html");
	}
	
	public void submit()
	{
		driver.findElement(By.id("submits")).click();
	}

	@Override
	protected void isLoaded() throws Error
	{
		String url = driver.getCurrentUrl();

		Assert.assertTrue(url.contains(projectName));
	}
}
