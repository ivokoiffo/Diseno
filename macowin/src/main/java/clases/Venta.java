package clases;

import java.util.Date;

public class Venta {
	Prenda prenda;
	public int cantidad;
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
		precioFinal = (valorBase + prenda.getPrecioBase())*cantidad*prenda.getCoeficienteMarca();
		if(prenda.importado) precioFinal *= 1.3;
		return precioFinal;
	}
	
	public Date getFecha()
	{
		return fecha;
	}
}
