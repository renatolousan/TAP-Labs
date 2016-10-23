/*
 * Nome: Renato Lousan da Silva
 * Data: 14/10/2016
 * Descrição: Programa que imprime a soma de digitos de um numero na tela
 */

import java.util.Scanner;

public class SomaDigitos {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
	        int numero = 0;
	        int soma = 0;
	        
	        numero = scan.nextInt();
	        scan.close();
	        
	        while (numero > 0) {
	            soma = soma + numero % 10;
	            numero = numero / 10;
	        }
	        System.out.println(soma);
		
	}
}
