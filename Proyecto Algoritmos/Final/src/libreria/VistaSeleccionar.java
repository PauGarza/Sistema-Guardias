package libreria;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class VistaSeleccionar extends JFrame{
	
	protected JFrame frame;
	protected JButton btnOk;
	protected JLabel lblSitio;
	JComboBox<String> cbElegir;
	
	public VistaSeleccionar() {
		frame = new JFrame();
		frame.setBounds(100, 100, 300, 200);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		lblSitio = new JLabel("Seleccionar Sitio");
		lblSitio.setFont(new Font("Arial", Font.BOLD, 16));
		lblSitio.setBackground(Color.WHITE);
		lblSitio.setBounds(30, 11, 394, 29);
		frame.getContentPane().add(lblSitio);
		
		cbElegir = new JComboBox<String>();
		cbElegir.setBounds(53, 57, 164, 29);
		cbElegir.addItem("Sitio1");
		cbElegir.addItem("Sitio2");
		cbElegir.addItem("Sitio3");
		cbElegir.addItem("Nuevo Sitio");
		frame.getContentPane().add(cbElegir);
		
		btnOk = new <String>JButton("OK");
		btnOk.setBounds(96, 113, 89, 23);
		frame.getContentPane().add(btnOk);
	
	}
	
//	public static void main(String args[]){
//		VistaSeleccionar window = new VistaSeleccionar();
//		window.frame.setVisible(true);
//	}

}