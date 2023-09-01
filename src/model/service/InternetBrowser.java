package model.service;

import java.util.Scanner;

import model.util.SitesMap;

public interface InternetBrowser {

	public void displayPage();

	public void addNewTab();
	
	public void updatePage();
	public void selectSites(SitesMap sites,Scanner sc); 
}
