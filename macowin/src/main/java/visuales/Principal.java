package visuales;

import java.awt.EventQueue;

import javax.swing.JFrame;

import clases.Negocio;
import clases.Prenda;
import clases.Venta;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.text.ParseException;
import java.util.Date;

import java.awt.Button;

public class Principal extends JFrame {

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Principal frame = new Principal();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	Negocio negocio;
	
	public Negocio getNegocio()
	{
		return negocio;
	}
	public void setNegocio(Negocio n)
	{
		negocio = n;
		this.setTitle("El valor base es: $"+n.getValorBase());
	}
	
	java.awt.List lista;
	
	private void cargarProductos(){
		Prenda.getPrendasDePrueba().forEach(p->lista.add(p.getDescripcion()));
	}
	
	private void registrarVenta()
	{
		Prenda p = negocio.getlistaPrendas().get(lista.getSelectedIndex());
		Venta v = new Venta(p,Mensaje.PedirNumero("Cantidad de prendas:"),new Date());
		if(Mensaje.Confirmar("Por favor, confirmar venta. \nPrenda:"+p.getDescripcion()+"\nCantidad:"+v.cantidad+"\nTOTAL: "+v.getTotal(negocio.getValorBase())))
		{
			negocio.nuevaVenta(v);
		}
	}
	
	private void ganancias() throws ParseException
	{
		int ganancias = negocio.getRecaudacion(new Date());
		Mensaje.Mostrar("Lo recaudado es $"+ganancias);
	}
	
	public Principal() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 325, 199);
		getContentPane().setLayout(null);
		
		lista = new java.awt.List();
		lista.setBounds(10, 10, 292, 118);
		getContentPane().add(lista);
		
		Button btnVenta = new Button("Registrar Venta");
		btnVenta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				registrarVenta();
			}
		});
		btnVenta.setBounds(10, 134, 90, 22);
		getContentPane().add(btnVenta);
		
		Button btnGanacias = new Button("Ver ganancias de hoy");
		btnGanacias.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					ganancias();
				} catch (ParseException e1) {
					
					e1.printStackTrace();
				}
			}
		});
		btnGanacias.setBounds(181, 134, 121, 22);
		getContentPane().add(btnGanacias);
		
		cargarProductos();
	}
}
