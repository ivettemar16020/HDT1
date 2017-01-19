
public class ControlRadio implements Radio {

	private boolean apagado;
	private int am;
	private float fm;
	private String emisora;
	
	// Constructor
	public ControlRadio(){
	int am = 590;
	double fm = 86.7;
	String emisora = "";
	} 
	
	// Setters y Getters
	
	public void setAm(int am){
		this.am = am;
	}
	
	public int getAm(){
		return am;
	}
	
	public void setfm(int fm){
		this.fm = fm;
	}
	
	public double getfm(){
		return fm;
	}
	/**
	 * indica el estado del radio
	 */
	public void estado(boolean x){
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
		if (i == true){
			if (am <= 1600 && am >= 590){
				am = am + 10;
				System.out.println(am);
			}
			else 
				am = 590;
				System.out.println(am);
		}
		else if (i == false){
			if (fm <= 86.7 && fm >= 89.9){
				fm = fm + 0.2;
				System.out.println(fm);
			}
			else
				fm = 89.9;
				System.out.println(fm);
		}
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
