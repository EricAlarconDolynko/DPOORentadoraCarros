package RentadoraModelo;

public class EmpleadoInventario extends Empleado{

	//Constructor 
	
	public EmpleadoInventario(String idUsuario, String nombre, String fechaDeNacimiento, String nacionalidad,
			String documentoIdentidad, String imagen, String rol, String idEmpleado, String sede, boolean activo) {
		super(idUsuario, nombre, fechaDeNacimiento, nacionalidad, documentoIdentidad, imagen, rol, idEmpleado, sede, activo);
	}
	
	//Methods
	
	public void revisarVehículo() {
	}
	
	public void actualizarEstadoVehículo() {
	}
	
	public void avisarMantenimiento() {
	}
	
	
	
	
	
}
