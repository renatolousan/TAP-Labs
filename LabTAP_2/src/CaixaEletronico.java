/*
 * Nome: Renato Lousan da Silva
 * Data: 14/10/2016
 * Descrição: Programa que imprime "I am Groot" na tela
 */
import java.util.Scanner;

public class CaixaEletronico {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		
		int notas50 = 0;
		int notas10 = 0;
		int notas2 = 0;
		float aux = 0;
		
		float numero = scan.nextFloat();
		scan.close();
		
		if(numero % 2 != 0 && numero < 0){
			System.out.println("Valor Invalido.");
		} else {
			while (numero >= 50) {
				aux = numero / 50;
				notas50++;
			}
		}
		
		System.out.printf("%d %f",notas50, aux);
		
	}

}
