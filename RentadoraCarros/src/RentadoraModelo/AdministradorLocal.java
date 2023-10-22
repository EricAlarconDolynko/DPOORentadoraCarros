package RentadoraModelo;

import java.util.ArrayList;

public class AdministradorLocal extends Empleado{
	
	//Attributes
	private ArrayList<Empleado> listaEmpleados;

	//Constructor
	
	public AdministradorLocal(String nombre, String fechaDeNacimiento, String nacionalidad,
			String documentoIdentidad, String imagen, String rol, String sede, boolean activo) {
		super(nombre, fechaDeNacimiento, nacionalidad, documentoIdentidad, imagen, rol, sede, activo);
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
