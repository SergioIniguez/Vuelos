package persona;

public class Persona {
	
	public String nombre;
	public String DNI;
	public String fecha_nac;
	public int edad;
	
	public Persona () {}
	public Persona (String nombre, String DNI, String fecha_nac, int edad) {
		this.nombre = nombre;
		this.DNI = DNI;
		this.fecha_nac = fecha_nac;
		this.edad = edad;		
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDNI() {
		return DNI;
	}
	public void setDNI(String dNI) {
		DNI = dNI;
	}
	public String getFecha_nac() {
		return fecha_nac;
	}
	public void setFecha_nac(String fecha_nac) {
		this.fecha_nac = fecha_nac;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	

}
