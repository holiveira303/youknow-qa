package br.com.affero.youknow.entity.login.test;

import org.openqa.selenium.WebDriver;

import br.com.affero.youknow.test.PaginaTres;



public class Login extends YouknowQA
{	
	public Login(WebDriver driver, PaginaTres securedPage)
	{
		super(driver, securedPage);
	}

	private String username;
	private String password;
		
	public String getUsername()
	{
		return username;
	}
	
	public void setUsername(String username)
	{
		this.username = username;
	}
	
	public String getPassword()
	{
		return password;
	}
	
	public void setPassword(String password)
	{
		this.password = password;
	}

	@Override
	protected void isLoaded() throws Error
	{
		// TODO Auto-generated method stub
		
	}

	@Override
	protected void load()
	{
		// TODO Auto-generated method stub
		
	}
	
	
}
