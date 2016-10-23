/*
 * Nome: Renato Lousan da Silva
 * Data: 14/10/2016
 * Descrição: Programa que imprime os animais das cedulas brasileiras
 */
import java.util.Scanner;

public class AnimaisCedulas {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int nota = scan.nextInt();
		scan.close();
		
		switch (nota) {
		case 2:
			System.out.printf("Tartaruga");
			break;
		case 5:
			System.out.printf("Garça");
			break;
		case 10:
			System.out.printf("Arara");
			break;
		case 20:
			System.out.printf("Mico-leão-dourado");
			break;
		case 50:
			System.out.printf("Onça-pintada");
			break;
		case 100:
			System.out.printf("Garoupa");
			break;

		default:
			System.out.printf("erro");
			break;
		}
	}

}
