
public class ControlRadio implements Radio {

	private boolean apagado;
	private boolean am_fm;
	private int am;
	private float fm;
	private String emisora;
	
	// Constructor
	public ControlRadio(){
	
	apagado = true;
	am_fm = true; // true = esta en AM.
	am = 590;
	emisora = "";
	} 
	
	/**
	 * indica el estado del radio
	 * @Override
	 */
	public void estado(){
		if (apagado == true){
			apagado = false;
			System.out.println("La Radio ha sido encendida");
		}
		else{
			apagado = true;
			System.out.println("La Radio ha sido apagada");
		}
		this.apagado = apagado;
		
	}
	
	/**
	 * cambia de la estacion am a fm
	 * @Override
	 */
	public void frecuencia(){
		if(apagado == true){
			System.out.println("La Radio se encuentra apagada.");
		}
		else{
			if (am_fm == true){
				am_fm = false;
				System.out.println("La Radio se encuentra en FM.");
			}
			else{
				am_fm = true;
				System.out.println("La Radio se encuentra en AM.");
			}
			this.am_fm = am_fm;
		}
		
	}
	
	/**
	 * cambial el dial de la estacion
	 * A dozen modifiable push buttons (identified by integers 1 through 12) allow the listener 
	 * to store and recall AM or FM frequencies. AM frequencies 
	 * can be represented by multiples of 10 in the range 530 to 1610. FM
	 *  frequencies are found at multiples of 0.2 in the range 87.9 to 107.9.”
	 * @param:  indica el am y fm
	 * @Override 
	 */
	public void cambiar(boolean cambio){
		if(apagado == true){
			System.out.println("La Radio se encuentra apagada.");
		}
		else{
			// true = AM
			if(am_fm == true){
				
			}
			else if (am_fm == false){
				
			}
			
		}	
		
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
	 * @Override
	 */
	public void guardar(int emisora){
		
	}
	
	/**
	 * permite seleccionar la emisora del boton
	 * @param: la estacion que se selecciona
	 * @Override
	 */
	public float seleccionar(int estacion){
		
	}
	
}
