package model.device;

import java.util.Scanner;

import model.service.InternetBrowser;
import model.service.MusicPlayer;
import model.service.PhoneDevice;
import model.util.Music;
import model.util.MusicPlaylist;

public class IPhone implements MusicPlayer, InternetBrowser, PhoneDevice {

	@Override
	public void call(Scanner sc) {
		System.out.println("Digite o número: ");
		long number = sc.nextLong();
		System.out.println("Ligando para: " + number + "\n");
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
	public void displayPage() {
		System.out.println("Exibindo página da web\n");
	}

	@Override
	public void addNewTab() {
		System.out.println("Abrindo nova aba do navegador\n");
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
		System.out.println("\nEscolha uma música para tocar: ");
		sc.nextLine();
		String musicToPlay = sc.nextLine();

		for (Music music : musicPlaylist.getPlaylist()) {

			if (music.getName().matches(musicToPlay)) {
				System.out.println(playSongSelected() + " " + music.getName()+"\n");
			}
		}

	}

}
