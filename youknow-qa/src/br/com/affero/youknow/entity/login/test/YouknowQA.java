package br.com.affero.youknow.entity.login.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.LoadableComponent;

import test.PaginaTres;

public abstract class YouknowQA extends LoadableComponent<YouknowQA>
{
	
	private final WebDriver driver;
	
	public YouknowQA(WebDriver driver, PaginaTres securedPage)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@Override
	protected abstract void load();
	
	@Override
	protected abstract void isLoaded() throws Error;

}
