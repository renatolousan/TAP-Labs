/*
 * Nome: Renato Lousan da Silva
 * Data: 14/10/2016
 * Descrição: Programa que calcula o preco de um servico de pintura
 */

import java.util.Scanner;

public class PinturaMuro {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		
		float valorCobrado = scan.nextFloat();
		scan.close();
		int material = 100;
		int muro = 12 * 3;
		
		float servico = valorCobrado * muro;
		float servicoTotal = servico + material;
		
		System.out.printf("%.1f", servicoTotal);
	}

}
