import static org.junit.Assert.*;

import org.junit.Test;

public class RadioTest {

	ControlRadio cr = new ControlRadio();
	
	/**
	 * No se realizo porque no se sabe exactamente 
	 * que emisora es la que se obtendra
	@Test
	public void testSeleccionar(){
	}
	*/
	
	@Test
	public void testGetFrecuencia(){
		boolean resultado = cr.getFrecuencia();
		boolean esperado = true;
		assertEquals(esperado, resultado);
	}
	
	@Test
	public void testGetEstado(){
		boolean resultado = cr.getEstado();
		boolean esperado = true;
		assertEquals(esperado, resultado);
	}
	
	
	/**
	 * No se realizo porque no se sabe con exactitud cual 
	 * sera la respuesta esperada del radio (emisoras cambian)
	@Test
	public void testGetEmisora(){
		float resultado = cr.getEmisora();
		float esperado = emisora;
		double res = (double) resultado;
		double esp = (double) esperado;
		assertEquals(esp, res);
	}
	*/


}
