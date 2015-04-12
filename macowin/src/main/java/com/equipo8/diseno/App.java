package com.equipo8.diseno;
import visuales.*;
import clases.*;

public class App 
{
    public static void main( String[] args )
    {
    	Negocio negocio = new Negocio (Mensaje.PedirNumero("Ingrese el valor base del negocio:"));
		Principal f = new Principal();
		f.setNegocio(negocio);
		f.setVisible(true);
    }
}