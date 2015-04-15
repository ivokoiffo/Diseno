package clases;

import java.util.*;

public class Politica{

	/*
	 * SOBRE EL FUNCIONAMIENTO DE ESTA CLASE
	 * Dentro del sistema, las politicas de aumentos por marca estan generalizadas como bandas de aumentos,
	 * en relación al precio del producto. Es decir, de este valor a este valor este aumento. 
	 * Los valores limites de cada tramo estan modelados con la lista 'puntosDeCambio' y los aumentos 
	 * con la lista 'aumentos'.
	 * Convenientemente, a las dos listas se les carga en orden sincronizado.
	 */
	String nombre;
	List<Integer> puntosDeCambio;
	List<Float> aumentos;

	public Politica(String nombre, List<Integer> puntosDeCambio, List<Float> aumentos)
	{

		this.nombre = nombre;
		this.puntosDeCambio = puntosDeCambio;
		this.aumentos = aumentos;

	}

	public Float aumento(int valor)
	{
		if(puntosDeCambio == null) return aumentos.get(0); // Si no hay puntos de cambio, entonces es el mismo aumento para todos.
		for (int i = 0; i < puntosDeCambio.size(); i++ ) 
		{
			int min = puntosDeCambio.get(i);
			int max = puntosDeCambio.get(i+1);
			if(valor > min && valor < max)
			{ 
				return aumentos.get(i); //Aprovecho que estan sincronizadas.
			}
		}
		return null;
	}

}