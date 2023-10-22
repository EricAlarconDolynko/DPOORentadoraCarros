package RentadoraModelo;

import java.util.ArrayList;

public class Reserva {
	
	//Attributes
	private static int id = 0;
	private String fechaLlegadaAgencia;
	private String horaLlegadaAgencia;
	private String fechaDevolucion;
	private String horaDevolucion;
	private OtrosConductores otrosConductores;
	private Sede sedeFinal;
	private Categoria categoriaVehiculo;

	//Constructors
	
	public Reserva(String fechaLlegadaAgencia, String horaLlegadaAgencia, String fechaDevolucion,
			String horaDevolucion, OtrosConductores otrosConductores, Sede sedeFinal, Categoria categoriaVehiculo) {
		super();
		id +=1;
		this.fechaLlegadaAgencia = fechaLlegadaAgencia;
		this.horaLlegadaAgencia = horaLlegadaAgencia;
		this.fechaDevolucion = fechaDevolucion;
		this.horaDevolucion = horaDevolucion;
		this.otrosConductores = otrosConductores;
		this.sedeFinal = sedeFinal;
		this.categoriaVehiculo = categoriaVehiculo;
	}
		
	//Getters & Setters
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFechaLlegadaAgencia() {
		return fechaLlegadaAgencia;
	}

	public void setFechaLlegadaAgencia(String fechaLlegadaAgencia) {
		this.fechaLlegadaAgencia = fechaLlegadaAgencia;
	}

	public String getHoraLlegadaAgencia() {
		return horaLlegadaAgencia;
	}

	public void setHoraLlegadaAgencia(String horaLlegadaAgencia) {
		this.horaLlegadaAgencia = horaLlegadaAgencia;
	}

	public String getFechaDevolucion() {
		return fechaDevolucion;
	}

	public void setFechaDevolucion(String fechaDevolucion) {
		this.fechaDevolucion = fechaDevolucion;
	}

	public String getHoraDevolucion() {
		return horaDevolucion;
	}

	public void setHoraDevolucion(String horaDevolucion) {
		this.horaDevolucion = horaDevolucion;
	}

	public OtrosConductores getOtrosConductores() {
		return otrosConductores;
	}

	public void setOtrosConductores(OtrosConductores otrosConductores) {
		this.otrosConductores = otrosConductores;
	}

	public Sede getSedeFinal() {
		return sedeFinal;
	}

	public void setSedeFinal(Sede sedeFinal) {
		this.sedeFinal = sedeFinal;
	}

	public Categoria getCategoriaVehiculo() {
		return categoriaVehiculo;
	}

	public void setCategoriaVehiculo(Categoria categoriaVehiculo) {
		this.categoriaVehiculo = categoriaVehiculo;
	}
	
	//Methods

	public void guardarReserva() {
		
	}
	
	public void cobrarReserva() {
		
	}
	
	public Vehiculo obtenerVehiculo(Sede sede,Categoria categoria) {
		
		Vehiculo vehiculoRetorno = null;
		ArrayList<Vehiculo> disponibles = sede.getDisponibles();
		
		while (vehiculoRetorno == null) {
			
			for (Vehiculo vehiculoActual:disponibles) {
				Categoria categoriaActual = vehiculoActual.getCategoria();
			
				if (categoriaActual.getNombre().equals(categoria.getNombre())) {
					if(vehiculoActual.isReservado() == false) {
						vehiculoRetorno = vehiculoActual;
					}
				}
				
				if (vehiculoRetorno == null) {
					if (categoriaActual.getMejorCategoria() == null) {
						return null;
					}
					else {
						categoria = categoriaActual.getMejorCategoria();
					}
				}
			}
		}
			
		return vehiculoRetorno;
	}
	
}