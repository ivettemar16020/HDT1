
public class ControlRadio implements IRadio {

	private boolean apagado;
	private boolean am_fm;
	private int am;
	private float fm;
	private float emisora; 
	private float[] estaciones; 
	private int cantEmisoras;

	
	// Constructor
	public ControlRadio(){
	
	apagado = true;
	am_fm = true; // true = esta en AM.
	am = 530;
	fm = (float)87.9;
	cantEmisoras = 0;
	estaciones = new float[12];
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
				
				//true = avanzar
				if (cambio == true){
					int amTemp = am + 10;
					am = amTemp;
					System.out.println(am);
					emisora = am;
					
					if (am >= 1610){
						am = 530;
						emisora = am;
					}
				}
				//false = retroceder
				else if(cambio == false){
					int amTemp = am - 10;
					am = amTemp;
					System.out.println(am);
					emisora = am;
					
					if(am <= 530){
						am = 1610;
						emisora = am;
						}
				}
			}
			else if (am_fm == false){
				//true = avanzar
				if(cambio == true){
					double a = fm + 0.2;
					fm = (float)a;
					System.out.println(fm);
					emisora = fm;
					
						if(fm >= (float)107.9){
							fm = (float)87.9;
							emisora = fm;
					}
				}
				
				//false = retroceder
				else if (cambio == false){
					double a = fm - 0.2;
					fm = (float)a;
					System.out.println(fm);
					emisora = fm;
					
					if(fm <= (float)87.9){
						fm = (float)107.9;
						emisora = fm;
				}
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
		float emiTemporal = emisora; 
		if(cantEmisoras < 12){
			estaciones[cantEmisoras] = emiTemporal; 
			System.out.println("La emisora guardada es: " + estaciones[cantEmisoras]);
			cantEmisoras++;
		}
	}
	
	/**
	 * permite seleccionar la emisora del boton
	 * @param: la estacion que se selecciona
	 * @Override
	 */
	public float seleccionar(int estacion){
		float emi_seleccionada = estaciones[estacion];
		return emi_seleccionada;
		//Exito
		
	}
	
	/**
	 * permite obtener el dato de la frecuencia en la que se encuentra el radio
	 */
	public boolean getFrecuencia(){
		return am_fm;
	}
	
	/**
	 * permite obtener el estado en el que se encuentra el radio
	 */
	public boolean getEstado(){
		return apagado; 
	}
	
	/**
	 * permite obtener la emisora en la que se encuentra la radio
	 */
	public float getEmisora(){
		return emisora;
	}
	
}
