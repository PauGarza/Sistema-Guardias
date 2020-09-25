package libreria;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;

import javax.swing.JOptionPane;

public class ControladorInicio extends VistaInicio{
	
	public class EscuchaOk implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent arg0) {
			
			char[] password = texto2.getPassword();
			char[] correctPass = new char[] {'s', 'e', 'c', 'r', 'e', 't','o'};
			
			ControladorSeleccionar cs = new ControladorSeleccionar();
			
			if (Arrays.equals(password, correctPass)) {
				JOptionPane.showMessageDialog(miPanel, "¡Bienvenido, " + texto1.getText() + "!");
				miPanel.setVisible(false);
				dispose();
				cs.frame.setVisible(true);

			} else {
				JOptionPane.showMessageDialog(miPanel, "Contraseña incorrecta. Inténtelo de nuevo.");
			}
			Arrays.fill(correctPass, '0');
		}
		
	}
	
	public ControladorInicio() {
		super();
		boton1.addActionListener(new EscuchaOk());
	}

}
