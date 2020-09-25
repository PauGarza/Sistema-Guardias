package libreria;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Controlador2 extends Vista2 {
	
	public class EscuchaGuardar implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent arg0) {
			ControladorSeleccionar cs = new ControladorSeleccionar();
			cs.frame.setVisible(true);
			frame.setVisible(false);
		}
		
	}
	
	public class EscuchaAlta implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent arg0) {
			
		}
		
	}
	
	public class EscuchaBaja implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent arg0) {
			
		}
		
	}
	
	public class EscuchaAsist implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent arg0) {
			
		}
		
	}
	
	public class EscuchaFaltas implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent arg0) {
			
		}
		
	}
	
	public class EscuchaDesplegar implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent arg0) {
			
		}
		
	}

	public Controlador2(int numSitio) {
		super(numSitio);
		btnGuardar.addActionListener(new EscuchaGuardar());
		btnAsistencias.addActionListener(new EscuchaAsist());
		btnBajaGuardia.addActionListener(new EscuchaBaja());
		btnDesplegarGuardias.addActionListener(new EscuchaDesplegar());
		btnFaltas.addActionListener(new EscuchaFaltas());
		btnAltaGuardia.addActionListener(new EscuchaAlta());
	}
}
