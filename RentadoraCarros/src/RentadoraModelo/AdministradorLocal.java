package RentadoraModelo;

import java.util.ArrayList;

public class AdministradorLocal extends Empleado{
	
	//Attributes
	private ArrayList<Empleado> listaEmpleados;

	//Constructor
	
	public AdministradorLocal(String idUsuario, String nombre, String fechaDeNacimiento, String nacionalidad,
			String documentoIdentidad, String imagen, String rol, String idEmpleado, String sede, boolean activo) {
		super(idUsuario, nombre, fechaDeNacimiento, nacionalidad, documentoIdentidad, imagen, rol, idEmpleado, sede,
				activo);
		this.listaEmpleados = new ArrayList<Empleado>();
	}

	//Getters y Setters
	public ArrayList<Empleado> getListaEmpleados() {
		return listaEmpleados;
	}

	public void setListaEmpleados(ArrayList<Empleado> listaEmpleados) {
		this.listaEmpleados = listaEmpleados;
	}
	
	//Methods
	
	public void crearUsuario() {	
	}
	
	public void registrarTrabajador() {
	}
	
	public void modificarInformacionTrabajador() {	
	}
	
}
