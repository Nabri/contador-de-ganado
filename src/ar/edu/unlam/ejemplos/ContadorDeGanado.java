package ar.edu.unlam.ejemplos;

public class ContadorDeGanado {

	
	private Integer total;
	
	public ContadorDeGanado(){
		
		this.total = 0;
	}
	
	
	public void contar(){
		
		this.total++;
	}
	
	public Integer cuantosConte(){
		
		return this.total;
	}
	
	public void reiniciar(){
		
		this.total = 0;
	}
}
