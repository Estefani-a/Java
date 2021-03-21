package logica;

import java.util.ArrayList;

public class Almacen {
	private ArrayList<Producto>listaProductos = new ArrayList<Producto>();
	public Almacen(){
		
	}
	
	//Consultar precio
	public int consultarPrecio(int indice) {
		return listaProductos.get(indice).getPrecio();
		
				
		
	}
	
	
	
	//Insertar producto
	public boolean insertarProducto(Producto producto) {
		
		boolean exitoso = true;
		for (Producto producto2 : listaProductos) {
			if (producto2.equals(producto)) { //foreach recorre todo el arreglo desde el primero hasta el ultimo elemento
				exitoso = false;
			}
			
		}
		
		if (exitoso) {
			listaProductos.add(producto);
		}
		
		return exitoso;
		
		
	}
	
	
	//Eliminar producto
	public void eliminarProducto(int indice) {
		
		
	    listaProductos.remove(indice);
		
		
		
	}
	
	//Consultar nombre
	public String consultarNombre(int indice) {
		return listaProductos.get(indice).getNombre();//Get devuelve el producto 
		
	}
	
	//Actualizar nombre
	
	public void actualizarNombre(int indice, String nuevoNombre) {
		
		listaProductos.get(indice).actualizarNombre(nuevoNombre);
	}
	
	
	//Modificar precio
	public void modificarPrecio(int indice, int nuevoPrecio) {
		
		/* buscar coca segun el indice
		selecciono y modifico precio indicado en nuevo precio
	    guardar */
		
		listaProductos.get(indice).actualizarPrecio(nuevoPrecio);
		
	}
	
	//Cantidad de productos
	
	public int cantidadProductos() {
		return listaProductos.size();
	}
	
	//Obtener producto
	
	public Producto obtenerProducto(int indice) {
		return listaProductos.get(indice);
	}
	
	

}
