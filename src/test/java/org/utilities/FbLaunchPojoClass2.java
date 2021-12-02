package org.utilities;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class FbLaunchPojoClass2 extends BaseClass {

	public FbLaunchPojoClass2() {

		PageFactory.initElements(driver, this);

	}

	// And Operator
	@CacheLookup
	@FindBys({ @FindBy(id = "email"), @FindBy(xpath = "//input[@type='text']")

	})
	private WebElement txtUser;
	//OR Operator
	
    @CacheLookup
	@FindAll({ @FindBy(id = "pas"), @FindBy(xpath = "//input[@type='password']")

	})
	private WebElement txtPass;
    
    @CacheLookup
	@FindBys({ @FindBy(name = "login"),@FindBy(xpath = "//button[@name='login']")
	
	})
	private WebElement btnLogin;

	public WebElement getTxtUser() {
		return txtUser;
	}

	public WebElement getTxtPass() {
		return txtPass;
	}

	public WebElement getBtnLogin() {
		return btnLogin;
	}

	

}
