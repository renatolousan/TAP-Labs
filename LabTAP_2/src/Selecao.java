public class Selecao {

  public static void ordenacaoPorSelecao(int v[], int n) {

    int i,j;
    int posMenor;
    int temp;

    for(i = 0; i < n-1; i++) {

      posMenor = i;
      for(j = i+1; j < n; j ++) {
        if(v[j] < v[posMenor]) {
    posMenor = j;
        }
      }
   
      temp = v[posMenor];
      v[posMenor] = v[i];
      v[i] = temp;
    }
    for(i=0; i < n-1; i++)
      System.out.printf("%d ",v[i]);
  }

  public static void main(String[] args) {
    int[] v = {5,12,14,1,6,10}; 
    ordenacaoPorSelecao(v, 6);

  }
}