/*
 * Nome: Renato Lousan da Silva
 * Data: 14/10/2016
 * Descrição: Programa que simula um caixa eletronico
 */
import java.util.Scanner;

public class CaixaEletronico {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		scan.close();
		int notas50 = 0;
		int notas10 = 0;
		int notas2 = 0;
		
		int numero = scan.nextInt();
		
		if(numero % 2 != 0 || numero < 0){
			System.out.println("Valor Invalido");
		} else {
		
		while(numero!=0){
		notas50 = numero / 50;
		numero = numero % 50;
		
		notas10 = numero / 10;
		numero = numero % 10;
		
		notas2 = numero / 2;
		numero = numero % 2;
		}
		
		System.out.printf("%d notas de R$50, %d notas de R$10 e %d notas de R$2",notas50,notas10,notas2);
		
		}
		
		
		
	}

}
