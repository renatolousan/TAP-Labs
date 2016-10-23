/*
 * Nome: Renato Lousan da Silva
 * Data: 14/10/2016
 * Descrição: Programa que imprime a idade da UFAM na tela 
 */
import java.util.Scanner;

public class IdadeUfam {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		
		int anoAtual = scan.nextInt();
		scan.close();
		
		int idade = anoAtual - 1909;
		
		System.out.printf("A UFAM tem %d anos de fundacao", idade);
		
	}
	

}
