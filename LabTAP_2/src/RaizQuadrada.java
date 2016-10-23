/*
 * Nome: Renato Lousan da Silva
 * Data: 14/10/2016
 * Descrição: Programa que imprime a raiz quadrada de um numero inteiro na tela 
 */
import java.util.Scanner;

public class RaizQuadrada {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		
		float numero = scan.nextFloat();
		scan.close();
		
		float resultado = (float) Math.sqrt(numero);
		
		System.out.printf("%.3f", resultado);
		
	}
	

}