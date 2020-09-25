package libreria;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.JTextPane;

public class VistaInicio extends JFrame{
	
	protected JTextField texto1;
	protected JPasswordField texto2;
	protected JButton boton1, boton2;
	protected JPanel miPanel;
	
	public VistaInicio() {
		
		setBounds(50, 20, 280, 180);
		setVisible(true);
	 
		miPanel = new JPanel();
		miPanel.setBackground(Color.black); //color
		setContentPane(miPanel);
		miPanel.setLayout(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		texto1 = new JTextField();
		texto2 = new JPasswordField();
		
		boton1 = new JButton();
		boton2 = new JButton();
		
		texto1.setBounds(50, 10, 160, 25);
		miPanel.add(texto1);
		texto1.setText("usuario");
		 
		texto2.setBounds(50, 40, 160, 25);
		miPanel.add(texto2);
		texto2.setText("secreto");
		
		boton1.setBounds(50, 110, 160, 25);
		miPanel.add(boton1);
		boton1.setText("OK");
	}

	public static void main(String args[]){
		VistaInicio v = new VistaInicio();
		v.setVisible(true);		
	}
}