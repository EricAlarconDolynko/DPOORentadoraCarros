package RentadoraModelo;

import java.util.ArrayList;

public class Alquiler {
	
	//Attributes
	
	private ArrayList<Sede> listaSedes;
	private ArrayList<Seguros> listaSeguros;
	private Tarifa tarifa;
	
	//Constructors
	
	public Alquiler(Tarifa tarifa) {
		super();
		this.listaSedes = new ArrayList<Sede>();
		this.listaSeguros = new ArrayList<Seguros>();
		this.tarifa = tarifa;
	}

	//Getters & Setters

	public ArrayList<Sede> getSede() {
		return listaSedes;
	}

	
	public void setSedes(ArrayList<Sede> sedes) {
		this.listaSedes = sedes;
	}
	
	public ArrayList<Seguros> getSeguros() {
		return listaSeguros;
	}

	public void setSeguros(ArrayList<Seguros> seguros) {
		this.listaSeguros = seguros;
	}
	
	public Tarifa getTarifa() {
		return tarifa;
	}

	public void setTarifa(Tarifa tarifa) {
		this.tarifa = tarifa;
	}


	//Methods
	
	public void modificarReserva() {
		
	}

	
	public void formalizarAlquiler() {
		
	}
	
	public void cobroTotal() {
		
	}
	
	public void bloquearTarjeta() {
		
	}
	
	public void ofrecerSeguros() {
		
	}
}