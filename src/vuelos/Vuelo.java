package vuelos;

public class Vuelo {
	
	public Alianzas Alianza;
	public int id;
	public Aeropuerto saleDe;
	public Aeropuerto llegaA;
	public String horaSale;
	public String horaLlega;
	
	public Vuelo () {}
	public Vuelo(Alianzas Alianza, int id, Aeropuerto saleDe, Aeropuerto llegaA, String horaSale, String horaLlega) {
		this.Alianza = Alianza;
		this.id = id;
		this.saleDe = saleDe;
		this.llegaA = llegaA;
		this.horaSale = horaSale;
		this.horaLlega = horaLlega;
	}
	
	public Alianzas getAlianza() {
		return Alianza;
	}
	public void setAlianza(Alianzas alianza) {
		Alianza = alianza;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Aeropuerto getSaleDe() {
		return saleDe;
	}
	public void setSaleDe(Aeropuerto saleDe) {
		this.saleDe = saleDe;
	}
	public Aeropuerto getLlegaA() {
		return llegaA;
	}
	public void setLlegaA(Aeropuerto llegaA) {
		this.llegaA = llegaA;
	}
	public String getHoraSale() {
		return horaSale;
	}
	public void setHoraSale(String horaSale) {
		this.horaSale = horaSale;
	}
	public String getHoraLlega() {
		return horaLlega;
	}
	public void setHoraLlega(String horaLlega) {
		this.horaLlega = horaLlega;
	}
	
}
