/*
 * Nome: Renato Lousan da Silva
 * Data: 14/10/2016
 * Descrição: Programa que calcula o desconto
 */
import java.util.Scanner;

public class Desconto {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		float preco = scan.nextFloat();
		
		if(preco < 200){
			System.out.println(preco);
		}else{
			float precoDescontado = (preco*5)/100;
			float precoFinal = preco - precoDescontado;
			
			System.out.printf("%.2f",precoFinal);
			scan.close();
		}
	}

}
