// 12 – Faca uma funcao que receba como parametro um vetor de
// inteiros ordenado de forma crescente e o numero de elementos do
// vetor. A funcao deve substituir cada elemento do vetor pela
// diferenca entre seu valor original e o valor da posicao
// imediatamente anterior a ele, mantendo apenas o primeiro
// elemento com seu valor original.

public class ModifyVector {

	public static int[] Modify(int vector[], int size) {
		int i;
		for (i = 1; i < size; i++) {
			vector[i] = vector[i] - vector[i-1];
		}
		return vector;
	}

	public static int[] Unmodify(int vector[], int size) {
		int i;
		for (i = 1; i < size; i++) {
			vector[i] = vector[i] + vector[i-1];
		}
		return vector;
	}

	public static void main(String[] args) {
		int[] vector = new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
		int i;
		vector = Modify(vector, 10);
		for (i=0; i < 10; i++) {
			System.out.printf("%d ", vector[i]);
		}
		System.out.printf("\n");
	}
}