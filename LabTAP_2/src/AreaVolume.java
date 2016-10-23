/*
 * Nome: Renato Lousan da Silva
 * Data: 14/10/2016
 * Descrição: Programa que imprime a area e o volume de um circulo na tela
 */

import java.util.Scanner;

public class AreaVolume {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		double raio = scan.nextDouble();
		
		double A = Math.PI*Math.pow(raio,2.00);
		double V = (4.0/3.0)*Math.PI*Math.pow(raio,3.00);
		scan.close();
		
		System.out.printf("Um circulo com raio de %.2f centimetros tem uma area de %.2f centimetros quadrados.\n",raio,A);
		System.out.printf("Uma esfera com raio de %.2f centimetros tem um volume de %.2f centimetros cubicos.",raio,V);
	}
}
