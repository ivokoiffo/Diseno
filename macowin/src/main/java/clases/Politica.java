package clases;

import java.util.*;

public class Politica{

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
		if(puntosDeCambio == null) return aumentos.get(0);
		for (int i = 0; i < puntosDeCambio.size(); i++ ) 
		{
			int min = puntosDeCambio.get(i);
			int max = puntosDeCambio.get(i+1);
			if(valor > min && valor < max)
			{ 
				return aumentos.get(i);
			}
		}
		return null;
	}

}