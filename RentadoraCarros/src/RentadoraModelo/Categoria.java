package RentadoraModelo;

public class Categoria 
{
	//Attributes
	
	private String nombre;
	private Categoria mejorCategoria;
	
	//Constructor
	
	public Categoria(String nombre) {
		super();
		this.nombre = nombre;
	}
	
	//Getter y Setters

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Categoria getMejorCategoria() {
		return mejorCategoria;
	}

	public void setMejorCategoria(Categoria mejorCategoria) {
		this.mejorCategoria = mejorCategoria;
	}
	

}
