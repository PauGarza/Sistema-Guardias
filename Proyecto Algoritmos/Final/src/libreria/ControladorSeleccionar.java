package libreria;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ControladorSeleccionar extends VistaSeleccionar{

	public class EscuchaOk2 implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent arg0) {
			Controlador2 c2 = new Controlador2();
			
			int seleccion = cbElegir.getSelectedIndex();
			switch(seleccion) {
				case 0:
					//Abrir Vista2
					c2.frame.setVisible(true);
					break;
				case 1:
					//Abrir Vista2
					c2.frame.setVisible(true);
					break;
				case 2:
					//Abrir Vista2
					c2.frame.setVisible(true);
					break;
				case 3:
					//Abrir Nuevo Sitio
					//cnuevo.frame.setVisible(true);
					break;
			}
			
			frame.setVisible(false);
		}
		
	}
	
	public ControladorSeleccionar() {
		super();
		btnOk.addActionListener(new EscuchaOk2());
	}
	
}
