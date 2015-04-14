package clases;

public class Marca{

	String nombre;
	Politica politica;

	public Marca(String nombre, Politica politica)
	{
		this.nombre = nombre;
		this.politica = politica;
	}

	public Float aumento(int valor)
	{
		return politica.aumento(valor);
	}

}