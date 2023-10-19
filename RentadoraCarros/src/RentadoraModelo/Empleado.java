package RentadoraModelo;

public class Empleado extends Usuario {

	private String idEmpleado;
	private String sede;
	private boolean activo;
	
	//Constructor
	
	public Empleado(String idUsuario, String nombre, String fechaDeNacimiento, String nacionalidad,
			String documentoIdentidad, String imagen, String rol, String idEmpleado, String sede, boolean activo) {
		super(idUsuario, nombre, fechaDeNacimiento, nacionalidad, documentoIdentidad, imagen, rol);
		this.idEmpleado = idEmpleado;
		this.sede = sede;
		this.activo = activo;
	}
	
	
	//Getters y Setters
	
	public String getIdEmpleado() {
		return idEmpleado;
	}

	public void setIdEmpleado(String idEmpleado) {
		this.idEmpleado = idEmpleado;
	}

	public String getSede() {
		return sede;
	}

	public void setSede(String sede) {
		this.sede = sede;
	}

	public boolean isActivo() {
		return activo;
	}

	public void setActivo(boolean activo) {
		this.activo = activo;
	}

	//Methods
	
	private void renunciar() {
		System.out.println("RENUNCIO!!");	
	}
	
	
	
}
