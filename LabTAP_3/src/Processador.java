
public class Processador {
	String marca;
	String modelo;
	double velocidade;
	int numNucleos;
	
	Processador(){
		marca = "";
		modelo = "";
		velocidade = 0.0;
		numNucleos = 0;
	}
	
	Processador(String marca, String modelo, double velocidade, int numNucleos){
		this.marca = marca;
		this.modelo = modelo;
		this.velocidade = velocidade;
		this.numNucleos = numNucleos;
		
	}
	
	double getVelocidadeParalela(){
		return velocidade * numNucleos;
	}
	
	String getDescricao(){
		return "Processador: marca=" + marca + ", modelo=" + modelo + ", velocidade=" + velocidade+"GHz"+ ", numNucleos=" + numNucleos + ", velocidadeParalela=" + velocidade * numNucleos+"GHz" + ".";
		
	}

}
