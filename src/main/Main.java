package main;

import java.util.*;
import persona.Pasajero;
import persona.Tripulacion;
import vuelos.*;

public class Main {

	public static void main(String[] args) {

		//Declaración de variables
		int opcion;
		boolean agregarNuevoObjeto;

		LinkedList<Pasajero> listaPasajeros = new LinkedList<Pasajero>();
		LinkedList<Tripulacion> listaTripulantes = new LinkedList<Tripulacion>();
		LinkedList<Vuelo> listaVuelos = new LinkedList<Vuelo>();
		//Inicializamos el scanner		
		Scanner leer = new Scanner(System.in);		

		do {
			System.out.println("*********Bienvendio a Biomedic Travel*********");
			System.out.println("Selecciona una de las opciones de nuestro menú");
			System.out.println("1) Registro de Pasajero");
			System.out.println("2) Registro de Tripulante");
			System.out.println("3) Nuevo vuelo");
			System.out.println("4) Imprime ticket de Pasajero");
			System.out.println("5) Imprime información del Vuelo");
			System.out.println("6) Salir");

			opcion = leer.nextInt();
			
			switch (opcion) {
			case 1: 
				 	agregarNuevoObjeto = true;
				 	while (agregarNuevoObjeto) {
					//Pedimos los datos del Pasajero
					System.out.println("Ingresa los datos del pasajero");
					leer.nextLine();
					System.out.println("Ingresa el nombre: ");
					String nombre = leer.nextLine();
					System.out.println("Ingresa el DNI: ");
					String DNI = leer.nextLine();
					System.out.println("Ingresa la fecha de nacimiento: ");
					String fecha_nac = leer.nextLine();
					System.out.println("Ingresa la edad: ");
					int edad = Integer.parseInt(leer.nextLine());
					System.out.println("Ingresa el correo: ");
					String correo = leer.nextLine();	
					
					System.out.println("Elige un vuelo: ");
					
					int x=1;
					for(Vuelo i:listaVuelos) {
						System.out.println(x + ".- Alianza: " + i.getAlianza() + ", ID: " + i.getId() + ", Aeropuerto de Salida: " + 
								i.getSaleDe() + ", Hora de Salida: " + i.getHoraSale() + ", Aeropuerto de Llegada: " + i.getLlegaA() + ", Hora de Llegada: " + i.getHoraLlega());	
						x++;
					}
					
					int sel = Integer.parseInt(leer.nextLine());
					Vuelo vuelo = listaVuelos.get(sel-1);

		            Pasajero P1 = new Pasajero(nombre, DNI, fecha_nac, edad, correo, vuelo);
		            listaPasajeros.add(P1);
		            
		            agregarNuevoObjeto = false;
				 	}
		            						
				break;
			case 2:
				agregarNuevoObjeto = true;
				while (agregarNuevoObjeto) {
					//Pedimos los datos del Tripulante
					System.out.println("Ingresa los datos del tripulante");
					leer.nextLine();
					System.out.println("Ingresa el nombre: ");
					String nombre = leer.nextLine();
					System.out.println("Ingresa el DNI: ");
					String DNI = leer.nextLine();
					System.out.println("Ingresa la fecha de nacimiento: ");
					String fecha_nac = leer.nextLine();
					System.out.println("Ingresa la edad: ");
					int edad = Integer.parseInt(leer.nextLine());
					System.out.println("Ingresa el NSS: ");
					String NSS = leer.nextLine();
					
					System.out.println("Elige un vuelo: ");
					
					int x=1;
					for(Vuelo i:listaVuelos) {
						System.out.println(x + ".- Alianza: " + i.getAlianza() + ", ID: " + i.getId() + ", Aeropuerto de Salida: " + 
								i.getSaleDe() + ", Hora de Salida: " + i.getHoraSale() + ", Aeropuerto de Llegada: " + i.getLlegaA() + ", Hora de Llegada: " + i.getHoraLlega());	
						x++;
					}
					
					int sel = Integer.parseInt(leer.nextLine());
					Vuelo vuelo = listaVuelos.get(sel-1);

					Tripulacion T1 = new Tripulacion(nombre, DNI, fecha_nac, edad, NSS,vuelo);
		            listaTripulantes.add(T1);
					agregarNuevoObjeto = false;
				}							
				break;
			case 3:
				agregarNuevoObjeto = true;
				Alianzas alianza = null;
				Aeropuerto aeropuertoL = null;
				Aeropuerto aeropuertoS = null;
				while (agregarNuevoObjeto) {
					//Pedimos los datos del Vuelo
					System.out.println("Ingresa los datos del Vuelo");
					leer.nextLine();
					
					System.out.println("Selecciona una alianza: " + "\n" + "1.-Volaris" + "\n" + "2.-Interjet" + "\n" + "3.-Aeromexico");
					int opc = Integer.parseInt(leer.nextLine());
					if(opc==1) {
						alianza = Alianzas.VOLARIS;
					}
					if(opc==2) {
						alianza = Alianzas.INTERJET;
					}
					if(opc==3) {
						alianza = Alianzas.VOLARIS;
					}
					
					System.out.println("Ingrese ID de vuelo: ");
					int ID = Integer.parseInt(leer.nextLine());
					
					System.out.println("Selecciona una Aeropuerto de Salida: " + "\n" + "1.-GDL" + "\n" + "2.-TIJ" + "\n" + "3.-MEX"
							+ "\n" + "4.-MTY" + "\n" + "5.-CUN");
					int opc2 = Integer.parseInt(leer.nextLine());
					if(opc2==1) {
						aeropuertoS = Aeropuerto.GDL;
					}
					if(opc2==2) {
						aeropuertoS = Aeropuerto.TIJ;
					}
					if(opc2==3) {
						aeropuertoS = Aeropuerto.MEX;
					}
					if(opc2==4) {
						aeropuertoS = Aeropuerto.MTY;
					}
					if(opc2==5) {
						aeropuertoS = Aeropuerto.CUN;
					}
					
					System.out.println("Ingrese la hora de salida de " + aeropuertoS.getCiudad() + ": ");
					String horaSale = leer.nextLine();
										
					System.out.println("Selecciona una Aeropuerto de Llegada: " + "\n" + "1.-GDL" + "\n" + "2.-TIJ" + "\n" + "3.-MEX"
							+ "\n" + "4.-MTY" + "\n" + "5.-CUN");
					int opc3 = Integer.parseInt(leer.nextLine());
					if(opc3==1) {
						aeropuertoL = Aeropuerto.GDL;
					}
					if(opc3==2) {
						aeropuertoL = Aeropuerto.TIJ;
					}
					if(opc3==3) {
						aeropuertoL = Aeropuerto.MEX;
					}
					if(opc3==4) {
						aeropuertoL = Aeropuerto.MTY;
					}
					if(opc3==5) {
						aeropuertoL = Aeropuerto.CUN;
					}
					
					System.out.println("Ingrese la hora de llegada a " + aeropuertoL.getCiudad() + ": ");
					String horaLlega = leer.nextLine();
					
					
					Vuelo V1 = new Vuelo(alianza, ID, aeropuertoS, aeropuertoL, horaSale, horaLlega);
		            listaVuelos.add(V1);
					agregarNuevoObjeto = false;

				}
				break;
			case 4:
				int x=1;
				System.out.println("Selecciona el pasajero para imprimir su Ticket");
				for(Pasajero i:listaPasajeros) {
					System.out.println(x+".- "+i.getNombre());
					x++;
				}
				leer.nextLine();
				int sel = Integer.parseInt(leer.nextLine());
				Pasajero pass = listaPasajeros.get(sel-1);
				System.out.println("Nombre: " + pass.getNombre() + "\n" + "DNI: " + pass.getDNI() + "\n" + "Fecha de nacimiento: " + 
						pass.getFecha_nac() + "\n" + "Edad: " + pass.getEdad() + "\n" + "Correo: " + pass.getCorreo());			
				System.out.println("Alianza: " + pass.vuelo.getAlianza() + "\n" + "ID: " + pass.vuelo.getId() + "\n" + "Aeropuerto de Salida: " + 
						pass.vuelo.getSaleDe() + "\n" + "Hora de Salida: " + pass.vuelo.getHoraSale() + "\n" + "Aeropuerto de Llegada: " + pass.vuelo.getLlegaA() 
						+ "\n" + "Hora de Llegada: " + pass.vuelo.getHoraLlega());				
				break;
			case 5://Información del Vuelo
				System.out.println("Lista de Pasajeros");
				for(Pasajero i:listaPasajeros) {
					System.out.println("Nombre: " + i.getNombre());
				}
				
				System.out.println("Lista de Tripulantes");
				for(Tripulacion i:listaTripulantes) {
					System.out.println("Nombre: " + i.getNombre() + "DNI: " + i.getDNI() + "Fecha de nacimiento: " + 
							i.getFecha_nac() + "Edad: " + i.getEdad() + "Correo: " + i.getNSS());	
					System.out.println("Alianza: " + i.vuelo.getAlianza() + "\n" + "ID: " + i.vuelo.getId() + "\n" + "Aeropuerto de Salida: " + 
							i.vuelo.getSaleDe() + "\n" + "Hora de Salida: " + i.vuelo.getHoraSale() + "\n" + "Aeropuerto de Llegada: " + i.vuelo.getLlegaA() 
							+ "\n" + "Hora de Llegada: " + i.vuelo.getHoraLlega());
				}
				
				System.out.println("Lista de Vuelos");
				for(Vuelo i:listaVuelos) {
					System.out.println("Alianza: " + i.getAlianza() + ", ID: " + i.getId() + ", Aeropuerto de Salida: " + 
							i.getSaleDe() + ", Hora de Salida: " + i.getHoraSale() + ", Aeropuerto de Llegada: " + i.getLlegaA() + ", Hora de Llegada: " + i.getHoraLlega());					
				}
				break;
			case 6:
				System.out.println("Gracias por su preferencia!");
				System.exit(0);
			default:
				System.out.println("Opción no válida");
			}
		} while(opcion <= 6 || opcion >= 1);
		leer.close();
	}

	/*private static Vuelo listaVuelos(int i) {
			Vuelo fly = listaVuelos[i];
		return fly;
	}*/
	


}
