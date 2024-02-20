package beans;

public class Boton {
	private long id;
	private String forma;
	private double tamanio;
	private String color;
	
	public Boton() {
		super();
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getForma() {
		return forma;
	}

	public void setForma(String forma) {
		this.forma = forma;
	}

	public double getTamanio() {
		return tamanio;
	}

	public void setTamanio(double tamanio) {
		this.tamanio = tamanio;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public String toString() {
		return "Boton [id=" + id + ", forma=" + forma + ", tamanio=" + tamanio + ", color=" + color + "]";
	}
	
	
	
}
