import java.util.Scanner;
/*
 * Nome: Renato Lousan da Silva
 * Data: 14/10/2016
 * Descricão: Programa que calcula a quantidade de combustivel num tanque
 */
public class TanqueCombustivel {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		double raioTanque = scan.nextFloat();
		double alturaDoAr = scan.nextFloat();
		double opcao = scan.nextShort();
		
		double volumeTotalTanque = (4.0/3.0)*Math.PI*Math.pow(raioTanque,3.00);
		double volumeDeAr = (Math.PI/3.00)*Math.pow(alturaDoAr, 2.00)*(3*raioTanque-alturaDoAr);
		double volumeDeCombustivel = volumeTotalTanque - volumeDeAr;
		
		if(opcao == 1){
			System.out.printf("%.4f",volumeDeAr);
		} else {
			System.out.printf("%.4f",volumeDeCombustivel);
		}
	}

}
