package com.zerobank.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;



public class AccountActivityPage extends BasePage {

    @FindBy(css = "#aa_accountId")
    public WebElement dropDownOption;

    @FindBy(xpath = "//thead//th")
    public List<WebElement> transactionsTableColumns;

    @FindBy(linkText = "Show Transactions")
    public WebElement showTransactions;

    @FindBy(linkText = "Find Transactions")
    public WebElement findTransactions;
}