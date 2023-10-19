package RentadoraModelo;

public class Tarifa 
{
	//Attributes
	
	private Categoria categoriaVehiculo;
	private String temporada;
	private double precio;
	private boolean mismaSede;
	
	//Constructor
	
	public Tarifa(Categoria categoriaVehiculo, String temporada, double precio, boolean mismaSede) {
		super();
		this.categoriaVehiculo = categoriaVehiculo;
		this.temporada = temporada;
		this.precio = precio;
		this.mismaSede = mismaSede;
	}

	//Getters y Setters
	
	public Categoria getCategoriaVehiculo() {
		return categoriaVehiculo;
	}

	public void setCategoriaVehiculo(Categoria categoriaVehiculo) {
		this.categoriaVehiculo = categoriaVehiculo;
	}

	public String getTemporada() {
		return temporada;
	}

	public void setTemporada(String temporada) {
		this.temporada = temporada;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public boolean isMismaSede() {
		return mismaSede;
	}

	public void setMismaSede(boolean mismaSede) {
		this.mismaSede = mismaSede;
	}	
	
	
	//Method 
	
	public void calcularTarifa() {
	}
	
	
}
