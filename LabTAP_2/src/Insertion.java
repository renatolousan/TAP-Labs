public class Insertion {
// 6 – Implemente o algoritmo de ordenacao por insercao em uma
// funcao que receba como parametros um vetor de inteiros e seu
// tamanho. A implementacao deve ser feita sem a utilizacao do
// comando for da linguagem C.

	public static int[] InsertionSort(int vector[], int size) {
		int i, j, aux;
		for(i = 0; i < size; i++) {
			j = i;
			while(j > 0 && vector[j-1] > vector[j]) {
				aux = vector[j];
				vector[j] = vector[j-1];
				vector[j-1] = aux;
				j = j - 1;
			}
		}
		return vector;
	}

	public static int[] InsertionSortRecursive(int vector[], int size) {
		return InsertionSortRecursiveSub(vector, 0, size);
	}

	public static int[] InsertionSortRecursiveSub(int vector[], int index, int size) {
		if(index < size) {
			vector = InsertionSortRecursiveSub2(vector, index);
			InsertionSortRecursiveSub(vector, index+1, size);
		}
		return vector;
	}

	public static int[] InsertionSortRecursiveSub2(int vector[], int index) {
		int aux;
		if(index > 0 && vector[index-1] > vector[index]) {
			aux = vector[index];
			vector[index] = vector[index-1];
			vector[index-1] = aux;
			InsertionSortRecursiveSub2(vector, index-1);
		}
		return vector;
	}

	public static void main(String[] args) {
		int[] vector = new int[]{4, 5, 2, 8, 1, 9, 3, 6, 0, 7};
		int i;
		vector = InsertionSortRecursive(vector, 10);
		for (i=0; i < 10; i++) {
			System.out.printf("%d ", vector[i]);
		}
		System.out.printf("\n");
	}
}