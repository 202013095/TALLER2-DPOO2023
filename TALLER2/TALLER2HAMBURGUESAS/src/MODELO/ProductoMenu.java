package MODELO;

import Procesamiento.Producto;

public class ProductoMenu implements Producto{
	
	/*Attributes*/
	
	private String nombre;
	private int precio;
	private int calorias;
	
	/*Constructor*/
	
	public ProductoMenu(String nombre, int precio, int calorias) {
		
		this.nombre=nombre;
		this.precio=precio;
		this.calorias=calorias;
		
	}
	
	/*Methods*/
	
	public String getNombre() {
		
		return nombre;
	}
	
	public int getPrecio() {
		
		return precio;
	}
	
	public int getCalorias() {
		
		return calorias;
	}
	
	public String generarTextoFactura() {
		
		return nombre+"---------"+precio;
	}

	
}