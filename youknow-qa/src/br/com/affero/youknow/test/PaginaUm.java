package br.com.affero.youknow.test;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.LoadableComponent;

public class PaginaUm extends LoadableComponent<PaginaUm>
{

	private final WebDriver driver;
	//private WebElement summary;
	//private WebElement submit;

	/*@FindBy(name = "comment")
	private WebElement description;*/

	public PaginaUm(WebDriver driver, PaginaTres securedPage)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@Override
	protected void load()
	{
		driver.get("file:///C:/Users/luis.azevedo/Desktop/FOLDER/um.html");
	}

	@Override
	protected void isLoaded() throws Error
	{
		String url = driver.getCurrentUrl();
		Assert.assertTrue("Not on the issue entry page: " + url, url.endsWith(".html"));
	}

	/*
	 * public void setSummary(String issueSummary) { clearAndType(summary,
	 * issueSummary); }
	 */

	/*
	 * public void enterDescription(String issueDescription) {
	 * clearAndType(description, issueDescription); }
	 */

	public void submit()
	{
		driver.findElement(By.id("submit")).click();
	}

	/*private void clearAndType(WebElement field, String text)
	{
		field.clear();
		field.sendKeys(text);
	}*/
}
