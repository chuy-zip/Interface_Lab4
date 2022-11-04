
public interface ICarC {
	
	public boolean SwitchONOFF(boolean actual_state);
	
	public int getVolume();
	
	public int setVolume(int Volume);
	
	/**
	 * Metodo para cambiar el tipo de frecuencia de FM a AM
	 * @param frequency Si este es verdadero significa que es FM, 
	 * si es falso es AM
	 * @return el valor cambiado de la frecuencia
	 */
	public boolean SwitchFrequency(boolean frequency);
	
	public void setStation(float Volume);
	
	public float getStation();
	
	
	
}
