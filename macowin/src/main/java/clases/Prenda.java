package clases;

import java.util.List;
import java.util.ArrayList;

public class Prenda {
	int id;
	String descripcion;
	boolean importado;
	int valorMinimo;
	int aumento;
	String nombreVariable;
	int valorVariable;
	Marca marca;
	
	
	public static List<Prenda> getPrendasDePrueba()
	{
		//Para que genere una lista de prendas. Se debería llamar Prenda.getPrendasDePrueba()

		List<Integer> puntosSarkany = new ArrayList<Integer>();
		puntosSarkany.add(0);
		puntosSarkany.add(500);
		puntosSarkany.add(Integer.MAX_VALUE);
		List<Float> aumentosArmani = new ArrayList<Float>();
		aumentosArmani.add((float) 1.65);
		List<Float> aumentosSarkany = new ArrayList<Float>();
		aumentosSarkany.add((float)1.1);
		aumentosSarkany.add((float)1.35);
		Marca armani = new Marca("Armani",new Politica("Armani",null,aumentosArmani));
		Marca sarkany = new Marca("Sarkany", new Politica("Sarkany", puntosSarkany,aumentosSarkany));

		List<Prenda> prendas = new ArrayList<Prenda>();
		prendas.add(new Prenda(1,"Camisa", 200,false, armani));
		prendas.add(new Prenda(2,"Camisa Importada", 200,true, sarkany));
		prendas.add(new Prenda(3,"Pantalon grande (200 cm2)", 250,false,"CM2",200,1,armani));
		prendas.add(new Prenda(4,"Pantalon mas chico (150 cm2)", 250,false,"CM2",120,1,sarkany));
		prendas.add(new Prenda(5,"Saco (3 Botones)", 300,false,"BOTONES",3,10,armani));
		prendas.add(new Prenda(6,"Zapatos paton (Talle 45)", 400,false,"TALLE",45,5,sarkany));
		prendas.add(new Prenda(7,"Zapatos nenito (Talle 25)", 400,false,"TALLE",25,5,armani));
		prendas.add(new Prenda(8,"Sombrero chaplin (METROSEXUALIDAD 15)", 150,false,"METROSEXUALIDAD",15,1,sarkany));
		prendas.add(new Prenda(9,"Sombrero sencillo (METROSEXUALIDAD 10)", 150,false,"METROSEXUALIDAD",10,1,armani));
		return prendas;
	}

	public Prenda(int id, String descripcion, int valorMinimo, boolean importada, Marca marca)
	{
		this.id = id;
		this.descripcion = descripcion;
		this.importado = importada;
		this.nombreVariable = "";
		this.valorMinimo = valorMinimo;
		this.valorVariable = 0;
		this.aumento = 0;
		this.marca = marca;
	}
	
	public Prenda(int id, String descripcion, int valorMinimo, boolean importada, String nombreVariable, int valorVariable, int aumento, Marca marca)
	{
		this.id = id;
		this.descripcion = descripcion;
		this.importado = importada;
		this.valorMinimo = valorMinimo;
		this.nombreVariable = nombreVariable;
		this.valorVariable = valorVariable;
		this.aumento = aumento;
		this.marca = marca;
	}

	public int getPrecioBase()
	{
		return valorMinimo+valorVariable*aumento;
	}

	public float getCoeficienteMarca()
	{
		return marca.aumento(this.getPrecioBase());
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
	
	public boolean getImportado()
	{
		return importado;
	}
	public void setImportado(boolean i)
	{
		importado = i;
	}
}