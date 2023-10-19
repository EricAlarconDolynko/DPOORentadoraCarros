package RentadoraModelo;

public class CarroNoDisponible extends Vehiculo{
	
	//Attributes
	
	private String motivoNoDisponible;
	private String fechaRehabilitado;
	
	//Constructor
	
	public CarroNoDisponible(String placa, String marca, String modelo, String color, String tipoDeTransmision,
			String combustuble, int capacidad, boolean alquilado, String sede, Categoria categoria,
			String motivoNoDisponible, String fechaRehabilitado) {
		super(placa, marca, modelo, color, tipoDeTransmision, combustuble, capacidad, alquilado, sede, categoria);
		this.motivoNoDisponible = motivoNoDisponible;
		this.fechaRehabilitado = fechaRehabilitado;
	}
		

}