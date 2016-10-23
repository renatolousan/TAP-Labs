/*
 * Nome: Renato Lousan da Silva
 * Data: 14/10/2016
 * Descrição: Programa que diz a data por extenso
 */
import java.util.Scanner;

public class DataExtenso {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String data = scan.nextLine();
		scan.close();
		
		String diaStr = data.substring(0, 2);
		int dia = Integer.parseInt(diaStr);
		
		String anoStr = data.substring(4, 8);
		int ano = Integer.parseInt(anoStr);
		
		String mesStr = data.substring(2, 4);
		
		switch (mesStr) {
		case "01":
			mesStr = "janeiro";
			break;
		case "02":
			mesStr = "fevereiro";
			break;
		case "03":
			mesStr = "marÃ§o";
			break;
		case "04":
			mesStr = "abril";
			break;
		case "05":
			mesStr = "maio";
			break;
		case "06":
			mesStr = "junho";
			break;
		case "07":
			mesStr = "julho";
			break;
		case "08":
			mesStr = "agosto";
			break;
		case "09":
			mesStr = "setembro";
			break;
		case "10":
			mesStr = "outubro";
			break;
		case "11":
			mesStr = "novembro";
			break;
		case "12":
			mesStr = "dezembro";
			break;

		default:
			System.out.println("Data invalida");
			break;
		}
		System.out.println(dia + " de " + mesStr + " de " + ano);
		
	}

}
