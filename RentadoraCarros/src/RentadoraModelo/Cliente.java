package RentadoraModelo;

import java.util.ArrayList;
import java.util.Properties;

public class Cliente extends Usuario {
	
	//Attributes
	
	private String numeroDeCelular;
	private String email;
	private MetodoPago medioPago;
	private Licencia licencia;
	private Reserva reservaActual;
		
	//Constructor
	public Cliente(String nombre, String fechaDeNacimiento, String nacionalidad,
			String documentoIdentidad, String imagen, String rol, String numeroDeCelular, String email,
			String tipoPago, String numeroTarjetaCredito, String fechaVencimiento,
			String numeroLicencia, String paisExpedicion, String vencimientoLicencia,boolean estadoTarjeta){
		super(nombre, fechaDeNacimiento, nacionalidad, documentoIdentidad, imagen, rol);
		this.numeroDeCelular = numeroDeCelular;
		this.email = email;
		this.medioPago = new MetodoPago(tipoPago,numeroTarjetaCredito,fechaVencimiento,estadoTarjeta);
		this.licencia = new Licencia(numeroLicencia, paisExpedicion, vencimientoLicencia,imagen);
	}
	
	//Getters y Setters
	public String getNumeroDeCelular() {
		return numeroDeCelular;
	}
	public void setNumeroDeCelular(String numeroDeCelular) {
		this.numeroDeCelular = numeroDeCelular;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public MetodoPago getMedioPago() {
		return medioPago;
	}
	public void setMedioPago(MetodoPago medioPago) {
		this.medioPago = medioPago;
	}
	public Licencia getLicencia() {
		return licencia;
	}
	public void setLicencia(Licencia licencia) {
		this.licencia = licencia;
	}
	
	//Methods
	
	public Reserva iniciarReserva(String fechaLlegada, String horaLlegada,
	String fechaDevolucion, String horaDevolucion, Sede sedeEntrega, 
	OtrosConductores otrosConductores,Categoria categoriaVehiculo){
		
		reservaActual = new Reserva(fechaLlegada,horaLlegada,fechaDevolucion,horaDevolucion,
				otrosConductores,sedeEntrega,categoriaVehiculo);
		
		Vehiculo carroEscogido = reservaActual.obtenerVehiculo(sedeEntrega,categoriaVehiculo);
		//TODO REVISAR NULL
		Properties pReserva = new Properties();
		
		ArrayList<String> listaReserva = new ArrayList<String>(); 
		
		listaReserva.add(fechaLlegada);
		listaReserva.add(horaLlegada);
		listaReserva.add(fechaDevolucion);
		listaReserva.add(horaDevolucion);
		listaReserva.add(sedeEntrega.getNombre());
		listaReserva.add("si");
		listaReserva.add(carroEscogido.getPlaca());

		String registroReserva = String.join(";",listaReserva);
		pReserva.put(reservaActual.getId(), registroReserva);
				
		return reservaActual;
	}	
	
	public void formalizarAlquiler() {
	}
	
	public void registrarOtroConductor(){
	}
	
	public void entregarVehiculo() {
	}
	
}
