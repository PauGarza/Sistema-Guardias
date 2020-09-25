package libreria;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class VistaGuardia extends JFrame {
	
	protected JFrame frame;
	protected JLabel lblGuardia;
	protected JLabel lblNombre;
	protected JTextField tfNombre;
	protected JLabel lblNaciemiento;
	protected JTextField tfNacimiento;
	protected JLabel lblEstado;
	protected JLabel lblTurno;
	protected JLabel lblTurnoSem;
	protected JTextField tfTurnoSem;
	protected JButton btnGuardar;
	protected JComboBox<String> cbEstado;
	protected JComboBox<String> cbTurno;
	
	public VistaGuardia() {
		frame = new JFrame();
		frame.setBounds(100, 100, 300, 330);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		lblGuardia = new JLabel("Guardia Nuevo");
		lblGuardia.setFont(new Font("Arial", Font.BOLD, 16));
		lblGuardia.setBackground(Color.WHITE);
		lblGuardia.setBounds(30, 11, 147, 29);
		frame.getContentPane().add(lblGuardia);
		
		lblNombre = new JLabel("Nombre");
		lblNombre.setFont(new Font("Arial", Font.PLAIN, 13));
		lblNombre.setBounds(30, 51, 90, 20);
		frame.getContentPane().add(lblNombre);
		
		tfNombre = new JTextField();
		tfNombre.setBounds(130, 52, 86, 20);
		frame.getContentPane().add(tfNombre);
		tfNombre.setColumns(10);
		
		lblNaciemiento = new JLabel("A\u00F1o Nacimeinto");
		lblNaciemiento.setFont(new Font("Arial", Font.PLAIN, 13));
		lblNaciemiento.setBounds(30, 82, 101, 20);
		frame.getContentPane().add(lblNaciemiento);
		
		tfNacimiento = new JTextField();
		tfNacimiento.setBounds(130, 83, 86, 20);
		frame.getContentPane().add(tfNacimiento);
		tfNacimiento.setColumns(10);
		
		lblEstado = new JLabel("Estado:");
		lblEstado.setFont(new Font("Arial", Font.PLAIN, 13));
		lblEstado.setBounds(30, 113, 101, 20);
		frame.getContentPane().add(lblEstado);
		
		lblTurno = new JLabel("Turno:");
		lblTurno.setFont(new Font("Arial", Font.PLAIN, 13));
		lblTurno.setBounds(30, 143, 101, 20);
		frame.getContentPane().add(lblTurno);
		
		lblTurnoSem = new JLabel("Turno por semana:");
		lblTurnoSem.setFont(new Font("Arial", Font.PLAIN, 11));
		lblTurnoSem.setBounds(30, 173, 101, 20);
		frame.getContentPane().add(lblTurnoSem);
		
		tfTurnoSem = new JTextField();
		tfTurnoSem.setColumns(10);
		tfTurnoSem.setBounds(130, 174, 86, 20);
		frame.getContentPane().add(tfTurnoSem);
		
		btnGuardar = new JButton("Guardar");
		btnGuardar.setBounds(30, 230, 208, 23);
		frame.getContentPane().add(btnGuardar);
		
		cbEstado = new JComboBox<String>();
		cbEstado.setBounds(130, 114, 86, 20);
		cbEstado.addItem("Activo");
		cbEstado.addItem("Enfermo");
		cbEstado.addItem("Vacaciones");
		cbEstado.addItem("Baja");
		frame.getContentPane().add(cbEstado);
		
		cbTurno = new JComboBox<String>();
		cbTurno.setBounds(130, 144, 86, 20);
		cbTurno.addItem("Matutino");
		cbTurno.addItem("Vespertino");
		frame.getContentPane().add(cbTurno);
	}
	
	public static void main(String args[]){
		VistaGuardia window = new VistaGuardia();
		window.frame.setVisible(true);
	}

}