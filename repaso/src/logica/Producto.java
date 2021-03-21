package logica;

public class Producto {

	//imagen img;
	private String nombre;
	private int precio;
	
	
	public Producto(String nombre, int precio){ //Construtor
		this.nombre = nombre;
		this.precio = precio;
		
	}
	
	//cargarImg(imagen){
		
	public void actualizarPrecio(int precio){
		this.precio = precio;
		
	}

	public String getNombre() {
		return nombre;
	}
	

	public void actualizarNombre(String nombre) { //Set para modificar
		this.nombre = nombre;
	}

	public int getPrecio() {//Get para consultar
		return precio;
	}

	

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Producto other = (Producto) obj;
		if (nombre == null) {
			if (other.nombre != null)
				return false;
		} else if (!nombre.equals(other.nombre))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return nombre + " $" + precio;
	}
	
	
	
	


	
	
	
	
	
	
	
	
	
	
}


