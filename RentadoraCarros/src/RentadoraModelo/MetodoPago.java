package RentadoraModelo;

public class MetodoPago {
	
	//Attributes
	
	private String tipoDePago;
	private String numeroTarjetaCredito;
	private String fechaVencimiento;
	
	//Constructors
	
	public MetodoPago(String tipoDePago, String numeroTarjetaCredito, String fechaVencimiento) {
		super();
		this.tipoDePago = tipoDePago;
		this.numeroTarjetaCredito = numeroTarjetaCredito;
		this.fechaVencimiento = fechaVencimiento;
	}
	
	//Getters & Setters
	
	public String getTipoDePago() {
		return tipoDePago;
	}

	public void setTipoDePago(String tipoDePago) {
		this.tipoDePago = tipoDePago;
	}

	public String getNumeroTarjetaCredito() {
		return numeroTarjetaCredito;
	}

	public void setNumeroTarjetaCredito(String numeroTarjetaCredito) {
		this.numeroTarjetaCredito = numeroTarjetaCredito;
	}

	public String getFechaVencimiento() {
		return fechaVencimiento;
	}

	public void setFechaVencimiento(String fechaVencimiento) {
		this.fechaVencimiento = fechaVencimiento;
	}


}