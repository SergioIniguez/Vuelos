package persona;

import vuelos.Vuelo;

public class Pasajero extends Persona {
	
	public String correo;
	public Vuelo vuelo;

	public Pasajero () {}
	public Pasajero(String nombre, String DNI, String fecha_nac, int edad, String correo, Vuelo vuelo) {
		super(nombre, DNI, fecha_nac, edad);
		this.correo = correo;
		this.vuelo = vuelo;
	}
	
	public String getCorreo() {
		return correo;
	}
	public void setCorreo(String correo) {
		this.correo = correo;
	}
	public Vuelo getVuelo() {
		return vuelo;
	}
	public void setVuelo(Vuelo vuelo) {
		this.vuelo = vuelo;
	}

}
