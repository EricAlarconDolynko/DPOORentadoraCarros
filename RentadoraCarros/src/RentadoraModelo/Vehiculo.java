package RentadoraModelo;

public class Vehiculo 
{
	//Attributes
	
	private String placa;
	private String marca;
	private String modelo;
	private String color;
	private String tipoDeTransmision;
	private String combustuble;
	private int capacidad;
	private boolean alquilado;
	private String sede;	
	private Categoria categoria;
	
	//Constructor
	
	public Vehiculo(String placa, String marca, String modelo, String color, String tipoDeTransmision,
			String combustuble, int capacidad, boolean alquilado, String sede, Categoria categoria) {
		super();
		this.placa = placa;
		this.marca = marca;
		this.modelo = modelo;
		this.color = color;
		this.tipoDeTransmision = tipoDeTransmision;
		this.combustuble = combustuble;
		this.capacidad = capacidad;
		this.alquilado = alquilado;
		this.sede = sede;
		this.categoria = categoria;
	}

	//Getters y Setters
	
	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getTipoDeTransmision() {
		return tipoDeTransmision;
	}

	public void setTipoDeTransmision(String tipoDeTransmision) {
		this.tipoDeTransmision = tipoDeTransmision;
	}

	public String getCombustuble() {
		return combustuble;
	}

	public void setCombustuble(String combustuble) {
		this.combustuble = combustuble;
	}

	public int getCapacidad() {
		return capacidad;
	}

	public void setCapacidad(int capacidad) {
		this.capacidad = capacidad;
	}

	public boolean isAlquilado() {
		return alquilado;
	}

	public void setAlquilado(boolean alquilado) {
		this.alquilado = alquilado;
	}

	public String getSede() {
		return sede;
	}

	public void setSede(String sede) {
		this.sede = sede;
	}

	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}	
	
	//Methods
	
	public void getEstado() {
	}
	
	public void getUbicacion() {
	}
	
}
