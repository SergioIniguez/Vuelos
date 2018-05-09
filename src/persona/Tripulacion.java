package persona;

import vuelos.Vuelo;

public class Tripulacion extends Persona {
	public String NSS;
	public Vuelo vuelo;

	public Tripulacion () {}
	public Tripulacion(String nombre, String DNI, String fecha_nac, int edad, String NSS, Vuelo vuelo) {
		super(nombre, DNI, fecha_nac, edad);
		this.NSS = NSS;		
		this.vuelo = vuelo;
	}
	
	public String getNSS() {
		return NSS;
	}
	public void setNSS(String nSS) {
		NSS = nSS;
	}
	public Vuelo getVuelo() {
		return vuelo;
	}
	public void setVuelo(Vuelo vuelo) {
		this.vuelo = vuelo;
	}
	

}
