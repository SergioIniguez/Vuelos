package vuelos;

public enum Aeropuerto {
	
	GDL("Guadalajara"), TIJ("Tijuana"), MEX("Ciudad de Mexico"), MTY("Monterrey"), CUN("Cancun");
	
	private String ciudad;
	
	Aeropuerto(String ciudad){
		this.ciudad=ciudad;
	}
	
	public String getCiudad() {
		return ciudad;
	}
	
}
