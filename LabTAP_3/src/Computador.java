
public class Computador {
	String fabricante;
	Processador processador;
	Memoria memoria;
	Disco disco;
	
	Computador(){
		this("",null,null,null);
	}
	
	Computador(String fabricante, Processador processador, Memoria memoria, Disco disco){
		this.fabricante = fabricante;
		this.processador = processador;
		this.memoria = memoria;
		this.disco = disco;
		
	}
	

	String getDescricao(){
		return "Computador da fabricante"+fabricante+"."+processador.getDescricao()+memoria.getDescricao()+disco.getDescricao();
	}
}
