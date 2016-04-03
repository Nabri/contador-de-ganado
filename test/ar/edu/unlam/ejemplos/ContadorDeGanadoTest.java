package ar.edu.unlam.ejemplos;

import static org.junit.Assert.*;

import org.junit.Test;

public class ContadorDeGanadoTest {

	@Test
	public void queElContadorSeCreaEnCero() {
		
		ContadorDeGanado contador = new ContadorDeGanado();
		
		assertEquals(contador.cuantosConte().intValue(), 0);
		
	}
	
	
	@Test
	public void queElContadorCuentaCorrectamenteUno() {
		
		ContadorDeGanado contador = new ContadorDeGanado();
		
		contador.contar();
		assertEquals(contador.cuantosConte().intValue(), 1);
		
	}
	
	
	@Test
	public void queElContadorCuentaCorrectamenteMasDeUno() {
		
		ContadorDeGanado contador = new ContadorDeGanado();
		int cantidadDeVecesAContar = 10;
		
		for(int i = 0;i<cantidadDeVecesAContar; i++){
		
			contador.contar();
		}
		

		assertEquals(contador.cuantosConte().intValue(), cantidadDeVecesAContar);
		
	}
	
	@Test
	public void queReiniciaCorrectamente(){
		
		ContadorDeGanado contador = new ContadorDeGanado();
		
		contador.contar();
		assertEquals(contador.cuantosConte().intValue(), 1);
		
		contador.reiniciar();
		assertEquals(contador.cuantosConte().intValue(), 0);
	}
	
	
	

}
