package clases;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;

public class Negocio {
	List<Prenda> listaPrendas; // De prendas que tiene en el local.
	List<Venta> listaVentas;
	int valorBase;
	public Negocio(int valorBase)
	{
		this.valorBase = valorBase;
		listaPrendas = Prenda.getPrendasDePrueba();
		listaVentas = new ArrayList<Venta>();
	}
	
	public void nuevaVenta(Venta nuevaVenta)
	{
		listaVentas.add(nuevaVenta);
	}
	
	public List<Prenda> getlistaPrendas()
	{
		return listaPrendas;
	}
	
	public int getRecaudacion(Date fecha)
	{
		return listaVentas.stream().filter(v -> mismaJornada(fecha, v.getFecha())).mapToInt(v->(int)v.getTotal(valorBase)).sum();
	}
	
	public int getValorBase()
	{
		return valorBase;
	}
	
	
	private boolean mismaJornada(Date f1, Date f2)
	{
		DateFormat formatoFecha = new SimpleDateFormat("dd/MM/yyyy");
		String a,b;
		a = formatoFecha.format(f1);
		b = formatoFecha.format(f2);
		return a.equals(b);
	}
	
	
}

