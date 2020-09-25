package libreria;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import libreria.ControladorInicio.EscuchaOk;

public class ControladorGuardia extends VistaGuardia {
	
//	protected JLabel lblGuardia;
//	protected JLabel lblNombre;
//	protected JTextField tfNombre;
//	protected JLabel lblNaciemiento;
//	protected JTextField tfNacimiento;
//	protected JLabel lblEstado;
//	protected JLabel lblTurno;
//	protected JLabel lblTurnoSem;
//	protected JTextField tfTurnoSem;
//	protected JButton btnGuardar;
//	protected JComboBox<String> cbEstado;
//	protected JComboBox<String> cbTurno;
	
	public class btnGuardar implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent arg0) {					
			
			//(String unNom, int unA, String unEst, int unT, int unTS)
			String nombre, nacimiento, estado;
			int turno, turnosS;
			int index1, index2;
			
			index1 = cbEstado.getSelectedIndex();
			index2 = cbTurno.getSelectedIndex();
			
			switch(index1) {
				case 0:
					estado = "activo";
					break;
				case 1:
					estado = "enfermo";
					break;
				case 2:
					estado = "vacs";
					break;
				case 3:
					estado = "baja";
					break;
			}
			
			//Falta lo demás. Tiene que haber un sitio s1 tal que:			
			//si.add(new Guardia(...));
			JOptionPane.showMessageDialog(frame, "Guardia guardado correctamente.");	
			frame.setVisible(false);
			
			Controlador2 c2 = new Controlador2(numSitio);
			c2.frame.setVisible(true);
			
		}
		
	}
	
	public ControladorGuardia(int numSitio) {
		super(int numSitio);
		btnGuardar.addActionListener(new btnGuardar());
	}

}
