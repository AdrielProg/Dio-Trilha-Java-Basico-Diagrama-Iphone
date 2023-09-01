package application;

import java.util.Scanner;

import model.device.IPhone;
import model.util.ContactSet;
import model.util.MusicPlaylist;

public class Program {
	public static void main(String[] args) {

		MusicPlaylist playlist = new MusicPlaylist();
		ContactSet contactList = new ContactSet(); 

		IPhone iphone = new IPhone();

		try (Scanner scanner = new Scanner(System.in)) {
			while (true) {
				System.out.println("Escolha uma opção:");
				System.out.println("1. Acessar Reprodutor de Música");
				System.out.println("2. Acessar Navegador da Internet");
				System.out.println("3. Telefone");
				System.out.println("0. Sair");

				int n = scanner.nextInt();
				

				switch (n) {
				case 1:
					// Menu do Reprodutor de Música
					while (true) {
						System.out.println("Reprodutor de Música:");
						System.out.println("1. Selecionar Música");
						System.out.println("2. Pausar Música");
						System.out.println("4. Tocar Música");
						System.out.println("0. Voltar");

						n = scanner.nextInt();
				
						switch (n) {
						case 1:
							iphone.selectMusic(playlist, scanner);
							break;
						case 2:
							iphone.pauseMusic();
							break;
						case 3:
							iphone.playSong();
							break;
						case 0:
							System.out.println("Voltando ao menu principal.\n");
							break;
						default:
							System.out.println("Opção inválida. Tente novamente.");
						}

						if (n == 0) {
							break; // Volta para o menu principal
						}
					}
					break;
				case 2:
					// Menu do Navegador da Internet
					while (true) {
						System.out.println("Navegador da Internet:");
						System.out.println("1. Exibir Página");
						System.out.println("2. Adicionar Nova Aba");
						System.out.println("3. Atualizar Página");
						System.out.println("0. Voltar");

						n = scanner.nextInt();

						switch (n) {
						case 1:
							iphone.displayPage();
							break;
						case 2:
							iphone.addNewTab();
							break;
						case 3:
							iphone.updatePage();
							break;
						case 0:
							System.out.println("Voltando ao menu principal.\n");
							break;
						default:
							System.out.println("Opção inválida. Tente novamente.");
						}

						if (n == 0) {
							break;
						}
					}
					break;
				case 3:
					while (true) {
						System.out.println("Telefone:");
						System.out.println("1. Fazer chamada");
						System.out.println("2. Lista de Contatos");
						System.out.println("3. Iniciar Correio de Voz");
						System.out.println("3. Receber Chamada");
                       	System.out.println("0. Voltar");
                       	 
                       	
                       	
						n = scanner.nextInt();

						switch (n) {
						case 1:
							iphone.call(scanner);
							break;
						case 2:
							iphone.selectContact(contactList, scanner);
							break;
						case 3:
							iphone.startVoiceRecording();
							break;
						case 0:
							System.out.println("Voltando ao menu principal.\n");
							break;
						default:
							System.out.println("Opção inválida. Tente novamente.");
						}
						if (n == 0) {
							break;
						}
					}
					break;

				case 0:
					System.out.println("Saindo do programa.");
                    System.exit(0);
				default:
					System.out.println("Opção inválida. Tente novamente.");
				}
			}
		}
	}

}
