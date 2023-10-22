package RentadoraModelo;

public class EmpleadoMostrador extends Empleado {

	//Constructor
	
	public EmpleadoMostrador(String nombre, String fechaDeNacimiento, String nacionalidad,
			String documentoIdentidad, String imagen, String rol,String sede, boolean activo) {
		super(nombre, fechaDeNacimiento, nacionalidad, documentoIdentidad, imagen, rol, sede, activo);
	}
	
	
	//Methods
	
	public void iniciarReservaRegular() {
	}
	
	public void iniciarReservaEspecial() {
	}
	
	public void entregarVehiculo(){
	}
	
	public void recibirVehiculo() {
	}
	
	public void mandarRevision() {
	}
	
	public void formalizarAlquiler() {
	}

}
