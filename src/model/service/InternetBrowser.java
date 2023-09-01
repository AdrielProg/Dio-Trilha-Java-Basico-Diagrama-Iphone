package model.service;

import java.util.Scanner;

public interface InternetBrowser {

	public void displayPage();

	public void addNewTab();
	
	public void updatePage();
	public void selectSites(Scanner sc); 
}
