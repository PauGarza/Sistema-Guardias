package libreria;

public class EjecutableGUI {

	public static void main(String[] args) {
		
		Empresa e1 = new Empresa("Pau", "1234");
		
		ControladorInicio miVentana = new ControladorInicio();				
		miVentana.setVisible(true);				

	}

}
