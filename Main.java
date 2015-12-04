import java.awt.List;
import java.util.Scanner;

/**
 * 
 */

/**
 * @author hamurabi
 *
 */
public class Main {
	/**
	 * @param n número de links a ler
	 * @return uma lista com todos os links inseridos
	 */
	public static List getStarterUrl( int n ) {
		List starter = new List();
		
		do {
			Scanner reader = new Scanner(System.in);
			starter.add(reader.nextLine());
			reader.close();
			n--;
		} while ( n > 0);
		
		return starter;
	}
	
	public static List getKeyWords() {
		List keyWords = new List();
		
		return keyWords;
	}
	
	public static void menu() {
		System.out.println("1 - inserir um ou uma lista de urls");
		System.out.println("2 - inserir lista de palavras chaves a serem buscadas [separadas por vírgula]");
		System.out.println("1 - inserir um ou uma lista de urls");
		
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
