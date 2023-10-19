package RentadoraModelo;

public class Cliente extends Usuario {
	
	//Attributes
	
	private String numeroDeCelular;
	private String email;
		
	//Constructor
	public Cliente(String idUsuario, String nombre, String fechaDeNacimiento, String nacionalidad,
			String documentoIdentidad, String imagen, String rol, String numeroDeCelular, String email) {
		super(idUsuario, nombre, fechaDeNacimiento, nacionalidad, documentoIdentidad, imagen, rol);
		this.numeroDeCelular = numeroDeCelular;
		this.email = email;
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
	
	//Methods
	
	public void iniciarReserva() {
	}	
	
	public void formalizarAlquiler() {
	}
	
	public void registrarOtroConductor(){
	}
	
	public void entregarVehiculo() {
	}
	
}
