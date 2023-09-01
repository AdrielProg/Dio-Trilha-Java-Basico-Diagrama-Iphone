package model.util;

import java.util.Map;
import java.util.TreeMap;

public class SitesMap {

	private Map<String, String> sites;

	public SitesMap() {
		this.sites = new TreeMap<>();
		addSitesOnSystem();
	}

	public Map<String, String> getSites() {
		return sites;
	}

	public void addSites(String name, String url) {
		sites.put(name, url);
	}

	public void showMySites() {
		if (!sites.isEmpty()) {
			System.out.println("------Sites Disponiveis-----");
			for (String s : sites.keySet()) {
				System.out.println(s);
			}
		}
	}

	public void addSitesOnSystem() {
		addSites("Google", "https://www.google.com");
		addSites("Facebook", "https://www.facebook.com");
		addSites("Twitter", "https://www.twitter.com");
		addSites("GitHub", "https://www.github.com");
		addSites("LinkedIn", "https://www.linkedin.com");
		addSites("Stack Overflow", "https://www.stackoverflow.com");
		addSites("YouTube", "https://www.youtube.com");
		addSites("Wikipedia", "https://www.wikipedia.org");
		addSites("Reddit", "https://www.reddit.com");
		addSites("Amazon", "https://www.amazon.com");
		// Adicione mais sites aqui conforme necessário
	}

}
