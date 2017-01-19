/*
 * Radio
 * Algoritmos y Estructura de Datos - Hoja de Trabajo 1
 * Integrantes:
 * Ivette Maria Cardona Cabrera 16020
 * Yasmin Yaneth Chavez Patzan 16101
 * Andrea Maria Cordon Mayen 16076
 *
 * Objetivo: poner en practica el polimorfismo.
 * Descripción: clase abstracta de radio
 */

public interface Radio {

	/**
	 * indica el estado del radio
	 */
	public void estado();
	
	/**
	 * cambia de la estacion am a fm
	 */
	public void frecuencia();
	
	/**
	 * cambial el dial de la estacion
	 * @param:  indica el am y fm 
	 */
	public void cambiar(boolean cambio);
	
	/**
	 * permite guardar una emisora en uno de los botones
	 * @param: la estacion que se desea guardar
	 */
	public void guardar(int emisora);
	
	/**
	 * permite seleccionar la emisora del boton
	 * @param: la estacion que se selecciona
	 */
	public float seleccionar(int estacion);
	
	/**
	 * permite obtener el dato de la frecuencia en la que se encuentra el radio
	 */
	public boolean getFrecuencia();
	
	/**
	 * permite obtener el estado en el que se encuentra el radio
	 */
	public boolean getEstado();
	
	/**
	 * permite obtener la emisora en la que se encuentra la radio
	 */
	public float getEmisora();
}
