package clases;

import java.util.List;
import java.util.ArrayList;

public class Prenda {
	int id;
	int precio;
	String descripcion;
	boolean importado;
	
	public static List<Prenda> getPrendasDePrueba()
	{
		//Para que genere una lista de prendas. Se debería llamar Prenda.getPrendasDePrueba()
		List<Prenda> prendas = new ArrayList<Prenda>();
		prendas.add(new Prenda(1,"Remera", 200,false));
		prendas.add(new Prenda(2,"Pantalon", 350,false));
		prendas.add(new Prenda(3,"Saco", 250,false));
		prendas.add(new Prenda(4,"Remera Importada", 200,true));
		prendas.add(new Prenda(5,"Pantalon Importado", 350,true));
		prendas.add(new Prenda(6,"Saco Importado", 250,true));
		return prendas;
	}
	
	public Prenda(int id, String descripcion, int precio, boolean importada)
	{
		this.id = id;
		this.descripcion = descripcion;
		this.precio = precio;
		this.importado = importada;
	}

	//Getters y Setters
	public int getId()
	{
		return id;
	}
	public void setId(int nuevoID)
	{
		id = nuevoID;
	}
	public String getDescripcion()
	{
		return descripcion;
	}
	public void setDescripcion(String nuevaDescripcion)
	{
		descripcion = nuevaDescripcion;
	}
	public int getPrecio()
	{
		return precio;
	}
	public void setPrecio(int nuevoPrecio)
	{
		precio = nuevoPrecio;
	}
	public boolean getImportado()
	{
		return importado;
	}
	public void setImportado(boolean i)
	{
		importado = i;
	}
}