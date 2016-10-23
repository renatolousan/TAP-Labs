
public class Memoria {
	String marca;
	String tipo;
	double tamanho;
	double velocidade;
	int numPentes;
	
	Memoria(){
		marca = "";
		tipo = "";
		tamanho = 0.0;
		velocidade = 0.0;
		numPentes = 0;
	}
	
	Memoria(String marca, String tipo, double tamanho, double velocidade, int numPentes){
		this.marca = marca;
		this.tipo = tipo;
		this.tamanho = tamanho;
		this.velocidade = velocidade;
		this.numPentes = numPentes;
		
	}
	
	double getTamanhoTotal(){
		return numPentes * tamanho;
	}
	
	double getVelocidadeParalela(){
		return numPentes * velocidade;
	}
	
	String getDescricao(){
		return "Memoria: marca=" + marca + ", tipo=" + tipo + ", tamanho=" + tamanho+"GB"+ ", velocidade=" + velocidade+"GHz" + ", numPentes=" + numPentes +", tamanhoTotal="+numPentes*tamanho+"GB"+", velocidadeParalela=" + numPentes*velocidade +"GHz"+ ".";
		
	}

}
