package model.device;

import java.util.Scanner;

import model.service.InternetBrowser;
import model.service.MusicPlayer;
import model.service.PhoneDevice;
import model.util.Contact;
import model.util.ContactSet;
import model.util.Music;
import model.util.MusicPlaylist;
import model.util.SitesMap;

public class IPhone implements MusicPlayer, InternetBrowser, PhoneDevice {

	@Override
	public void call(Scanner sc) {
		System.out.println("Digite o número: ");
		int number = sc.nextInt();

		System.out.println("Ligando para: " + number + "\n");

	}

	public String callSelectContact() {
		return "Ligando para:";

	}

	@Override
	public void answerCall() {
		System.out.println("Atendendo chamada");
	}

	@Override
	public void startVoiceRecording() {
		System.out.println("Iniciando gravação de voz\n");
	}

	@Override
	public void selectContact(ContactSet contactList, Scanner sc) {
		contactList.showMySortedContacts();
		System.out.println("\nEscolha um contato pelo nome para ligar: ");
		sc.nextLine();
		String contactName = sc.nextLine();

		for (Contact contact : contactList.getContactList()) {

			if (contact.getName().matches(contactName)) {
				System.out.println(
						callSelectContact() + " " + contact.getName() + "\n" + "Número: " + contact.getNumber() + "\n");
			}
		}

	}

	@Override
	public void displayPage() {
		System.out.println("Exibindo página da web\n");
		selectSites(new Scanner(System.in));
	}

	@Override
	public void selectSites(Scanner sc) {
		SitesMap sites = new SitesMap();
		sites.showMySites();
		System.out.println("Escolha um site por nome para navegar: ");
		String site = sc.nextLine();
		for (String s : sites.getSites().keySet()) {
			if (site.equalsIgnoreCase(s)) {
				System.out.println("Navegando em: " + sites.getSites().get(s) + "\n");
			}
		}

	}

	@Override
	public void addNewTab() {
		System.out.println("Abrindo nova aba do navegador\n");
		selectSites(new Scanner(System.in));
	}

	@Override
	public void updatePage() {
		System.out.println("Atualizando página da web\n");
	}

	@Override
	public String playSongSelected() {
		return "Tocando: ";

	}

	@Override
	public void playSong() {
		System.out.println("Tocando música atual\n");
	}

	@Override
	public void pauseMusic() {
		System.out.println("Musica Pausada.\n");
	}

	@Override
	public void selectMusic(MusicPlaylist musicPlaylist, Scanner sc) {

		musicPlaylist.showMyPlaylistSong();
		System.out.println("\nEscolha uma música pelo nome para tocar: ");
		sc.nextLine();
		String musicToPlay = sc.nextLine();

		for (Music music : musicPlaylist.getPlaylist()) {

			if (music.getName().matches(musicToPlay)) {
				System.out.println(playSongSelected() + " " + music.getName() + "\n");
			}
		}

	}

}
