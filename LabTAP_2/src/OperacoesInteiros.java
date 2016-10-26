/*
 Nome: Renato Lousan da Silva
 Data: 17/10/16
 Descricao: Programa que faz a soma de varias colecoes
 */
sdfsdfds
import java.util.Scanner;

public class OperacoesInteiros {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int prev_number = 0;
		int sum = 0;
		int number = scan.nextInt();
		
		String answers = "";
		
		while(!(prev_number == -1 && number == -1)) {
			if(number == -1){
				answers += sum + "\n";
				sum = 0;
			} else {
				sum += number;
			}
			prev_number = number;
			number = scan.nextInt();
		}
		scan.close();
		System.out.println(answers);
	}

}
