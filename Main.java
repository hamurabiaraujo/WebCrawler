import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 * 
 */

/**
 * @author hamurabi
 *
 */
public class Main {
	public static Search search =  new Search();
	/**
	 * @param number of links to read
	 * @return url list
	 */
	public static ArrayList<String> getStarterUrl() {
		Scanner reader = new Scanner(System.in);
		String line = reader.nextLine();
		
		ArrayList<String> urls = new ArrayList<String>(Arrays.asList(line.split(", ")));
		reader.close();
		return urls;
	}
	
	public static ArrayList<String> getKeyWords() {
		Scanner reader = new Scanner(System.in);
		String line = reader.nextLine();
		
		ArrayList<String> keyWords = new ArrayList<String>(Arrays.asList(line.split(", ")));
		reader.close();
		
		return keyWords;
	}
	
	public static void getOptionSelected() {
		Scanner reader = new Scanner(System.in);
		int option = reader.nextInt();
		
		switch (option) {
		case 1:
			search.setUrls(getStarterUrl());
			break;
		case 2:
			search.setKeyWords(getKeyWords());
			break;
		case 3:
			if (search.getReturnAll())
				search.setReturnAll(false);
			else
				search.setReturnAll(true);
			break;
		case 4:
			search.setDepth(reader.nextInt());
			break;
		case 5:
			search.setDepth(reader.nextInt());
			break;
		case 6:
			System.exit(9);
			break;
		default:
			menu();
			break;
		}
		
		reader.close();
	}
	
	public static void menu() {
		System.out.println("1 - inserir a lista de links");
		System.out.println("2 - inserir a lista de palavras chaves a serem buscadas [separadas por vírgula]");
		if (search.getReturnAll())
			System.out.println("3 - desativar o retorno de todas as páginas, independente de palavras-chave");
		else 
			System.out.println("3 - ativar o retorno de todas as páginas, independente de palavras-chave");
		System.out.println("4 - profundidade máxima de busca");
		System.out.println("5 - iniciar busca");
		System.out.println("6 - sair");
		
		getOptionSelected();
	}

	/**
	 * @param args
	 * @throws IOException 
	 * @throws MalformedURLException 
	 */
	public static void main(String[] args) throws MalformedURLException, IOException {
		// TODO Auto-generated method stub
		menu();
		
		ArrayList<String> urls = search.getUrls();
		for (String url : urls){
			search.getRelatedLinksOfPage(new URL(url));
		}
	}

}
