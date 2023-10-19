package RentadoraModelo;
import java.util.ArrayList;

public class Sede {
	
	//Attributes
	
	private String nombre;
	private String ubicacion;
	private String horaApertura;
	private String horaCierre;
	private String horaDeAtencion;
	private ArrayList<CarroNoDisponible> noDisponibles;
	private ArrayList<Vehiculo> disponibles;
	
	//Constructor
	
	public Sede(String nombre, String ubicacion, String horaApertura, String horaCierre, String horaDeAtencion,
			ArrayList<CarroNoDisponible> noDisponibles, ArrayList<Vehiculo> disponibles) {
		super();
		this.nombre = nombre;
		this.ubicacion = ubicacion;
		this.horaApertura = horaApertura;
		this.horaCierre = horaCierre;
		this.horaDeAtencion = horaDeAtencion;
		this.noDisponibles = noDisponibles;
		this.disponibles = disponibles;
	}
	
	
	
	//Getters y Setters

	public String getNombre() {
		return nombre;
	}



	public void setNombre(String nombre) {
		this.nombre = nombre;
	}



	public String getUbicacion() {
		return ubicacion;
	}



	public void setUbicacion(String ubicacion) {
		this.ubicacion = ubicacion;
	}



	public String getHoraApertura() {
		return horaApertura;
	}



	public void setHoraApertura(String horaApertura) {
		this.horaApertura = horaApertura;
	}



	public String getHoraCierre() {
		return horaCierre;
	}



	public void setHoraCierre(String horaCierre) {
		this.horaCierre = horaCierre;
	}



	public String getHoraDeAtencion() {
		return horaDeAtencion;
	}



	public void setHoraDeAtencion(String horaDeAtencion) {
		this.horaDeAtencion = horaDeAtencion;
	}



	public void setNoDisponibles(ArrayList<CarroNoDisponible> noDisponibles) {
		this.noDisponibles = noDisponibles;
	}



	public void setDisponibles(ArrayList<Vehiculo> disponibles) {
		this.disponibles = disponibles;
	}


	//Methods
	
	public int getInventario()
	{
		int nodis = noDisponibles.size();
		int dis = disponibles.size();
		
		return nodis + dis;
	}
	
	public ArrayList<Vehiculo> getDisponibles()
	{
		return disponibles;
	}
	
	public ArrayList<CarroNoDisponible> getNoDisponibles()
	{
		return noDisponibles;
	}
}

