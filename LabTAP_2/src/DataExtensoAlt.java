import java.util.Scanner;
 
public class DataExtensoAlt {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String data = scan.nextLine();
        scan.close();
        try {
            final String diaStr = data.substring(0,2);
            final int dia = Integer.parseInt(diaStr);
            final String anoStr = data.substring(4,8);
            final int ano = Integer.parseInt(anoStr);
            String mesStr = data.substring(2,4);
            final String[] meses = {"janeiro", "fevereiro", "marco", "abril", "maio", "junho",
                                    "julho", "agosto", "setembro", "outubro", "novembro", "dezembro"};
            mesStr = meses[Integer.parseInt(mesStr)-1];
            System.out.println(dia + " de " + mesStr + " de " + ano);
        } catch(IndexOutOfBoundsException e){
            System.out.println("Data Invalida");
        }
    }
}