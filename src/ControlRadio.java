
public class ControlRadio implements Radio {

	private boolean apagado;
	private int am;
	private float fm;
	private String emisora;
	
	/**
	 * indica el estado del radio
	 */
	public void estado(){
		if (x == true){
			x = false;
		}
		else 
			x = true;
		this.apagado = x;
	}
	
	/**
	 * cambia de la estacion am a fm
	 */
	public void frecuencia(){
		
	}
	
	/**
	 * cambial el dial de la estacion
	 * @param:  indica el am y fm 
	 */
	public void cambiar(boolean cambio){
		
	}
	
	/**
	 * permite guardar una emisora en uno de los botones
	 * @param: la estacion que se desea guardar
	 */
	public void guardar(int emisora){
		
	}
	
	/**
	 * permite seleccionar la emisora del boton
	 * @param: la estacion que se selecciona
	 */
	public float seleccionar(int estacion){
		
	}
	
}
