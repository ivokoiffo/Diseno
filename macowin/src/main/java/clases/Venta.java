package clases;

import java.util.Date;

public class Venta {
	Prenda prenda;
	int cantidad;
	Date fecha;
	
	public Venta(Prenda prenda, int cantidad, Date fecha)
	{
		this.cantidad = cantidad;
		this.prenda = prenda;
		this.fecha = fecha;
	}
	
	public float getTotal(int valorBase)
	{
		float precioFinal;
		precioFinal = (valorBase + prenda.getPrecio())*cantidad;
		if(prenda.getImportado()) precioFinal *= 1.3;
		return precioFinal;
	}
	
	public Prenda getPrenda()
	{
		return prenda;
	}
	public void setPrenda(Prenda nuevaPrenda)
	{
		prenda = nuevaPrenda;
	}
	public int getCantidad()
	{
		return cantidad;
	}
	public void setCantidad(int nuevaCantidad)
	{
		cantidad = nuevaCantidad;
	}
	public Date getFecha()
	{
		return fecha;
	}
	public void setFecha(Date nuevaFecha)
	{
		fecha = nuevaFecha;
	}
	
	
}
