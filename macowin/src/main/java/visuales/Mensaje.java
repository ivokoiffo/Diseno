package visuales;

public class Mensaje {
	//Entrada-Salida
	public static void Mostrar(String unTexto)
	{
		javax.swing.JOptionPane.showMessageDialog(null, unTexto);
	}
	public static String Pedir(String unTexto)
	{
		return javax.swing.JOptionPane.showInputDialog(unTexto);
	}
	public static boolean Confirmar(String unTexto)
	{
		return 0 == javax.swing.JOptionPane.showConfirmDialog(null, unTexto);
	}
	public static int PedirNumero(String unTexto)
	{
		String respuesta = "";
		do{
			respuesta = Pedir(unTexto);
		}while(!esNumerico(respuesta));
		return Integer.valueOf(respuesta);
	}
	
	
	//Validaci�n interna
	private static boolean esNumerico(String s) {
	    int len = s.length();
	    boolean respuesta = true;
	    if(len==0) respuesta = false;
	    for (int i = 0; i < len & respuesta; ++i) {
	        if (!esNumerico(s.charAt(i))) {
	            respuesta = false;
	        }
	    }
	    return respuesta;
	}
	private static boolean esNumerico(char c)
	{
		return "1234567890".contains(String.valueOf(c));
	}
}
