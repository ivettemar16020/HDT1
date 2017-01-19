
public class ControlRadio implements Radio {

	private boolean apagado;
	private boolean am_fm;
	private int am;
	private float fm;

	
	// Constructor
	public ControlRadio(){
	
	apagado = true;
	am_fm = true; // true = esta en AM.
	am = 530;
	fm = (float)87.9;
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
	 * to store and recall AM or FM frequencies. 
	 * AM frequencies can be represented by multiples of 10 in the range 530 to 1610. 
	 * FM frequencies are found at multiples of 0.2 in the range 87.9 to 107.9.”
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
				if (am == 1610){
					am = 530;
					System.out.println(am);
				}
				//true = avanzar
				else if (cambio == true){
					am = am + 10;
					System.out.println(am);
				}
				//false = retroceder
				else if(cambio == false){
					am = am - 10;
					System.out.println(am);
				}
			}
			else if (am_fm == false){
				//true = avanzar
				if(fm == (float)107.9){
					fm = (float)87.9;
					System.out.println(fm);
				}
				else if(cambio == true){
					double a = fm - 0.2;
					float fm = (float)a;
					System.out.println(fm);
				}
				//false = retroceder
				else if (cambio == false){
					double a = fm - 0.2;
					float fm = (float)a;
					System.out.println(fm);
				}
			}
			
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
