package RentadoraModelo;

public class Categoria 
{
	//Attributes
	
	private String nombre;
	private Categoria mejorCategoria;
	
	//Constructor
	
	public Categoria(String nombre) {
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

	public void setMejorCategoria(Categoria categoriaActual) {
		if (categoriaActual.getNombre().equals("lujo")) {
			this.mejorCategoria = null;
		}
		else if (categoriaActual.getNombre().equals("clasico")) {
			Categoria CategoriaRecursive = new Categoria("lujo");
			setMejorCategoria(CategoriaRecursive);
			this.mejorCategoria = CategoriaRecursive;
		}
		else if (categoriaActual.getNombre().equals("todoterreno")) {
			Categoria CategoriaRecursive = new Categoria("clasico");
			setMejorCategoria(CategoriaRecursive);
			this.mejorCategoria = CategoriaRecursive;
		}
		else if (categoriaActual.getNombre().equals("vans")) {
			Categoria CategoriaRecursive = new Categoria("todoterreno");
			setMejorCategoria(CategoriaRecursive);
			this.mejorCategoria = CategoriaRecursive;
		}
		else if (categoriaActual.getNombre().equals("tractor")) {
			Categoria CategoriaRecursive = new Categoria("vans");
			setMejorCategoria(CategoriaRecursive);
			this.mejorCategoria = CategoriaRecursive;
		}
	}
}