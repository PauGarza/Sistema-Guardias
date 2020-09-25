package libreria;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import javax.swing.*;
import javax.swing.border.*;

public class Vista2 extends JFrame {
	
	JFrame frame;
	protected JTextField tfID, tfCobro, tfPago, tfPena, tfNeto, tfCubrir;
	protected JButton btnGuardar, btnBajaGuardia, btnAltaGuardia, btnAsistencias, btnFaltas, btnDesplegarGuardias, btnNuevo;
	
	public Vista2(int numSitio) {
		
		frame = new JFrame();
		frame.setBounds(100, 100, 300, 420);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblSitio = new JLabel("Sitio " + numSitio);
		lblSitio.setFont(new Font("Arial", Font.BOLD, 16));
		lblSitio.setBounds(30, 11, 394, 29);
		frame.getContentPane().add(lblSitio);
		
		JLabel lblId = new JLabel("ID:");
		lblId.setFont(new Font("Arial", Font.PLAIN, 13));
		lblId.setBounds(30, 51, 36, 20);
		frame.getContentPane().add(lblId);
		
		tfID = new JTextField();
		tfID.setBounds(130, 52, 86, 20);
		frame.getContentPane().add(tfID);
		tfID.setColumns(10);
		
		JLabel lblCobroPorHora = new JLabel("Cobro por Hora:");
		lblCobroPorHora.setFont(new Font("Arial", Font.PLAIN, 13));
		lblCobroPorHora.setBounds(30, 82, 101, 20);
		frame.getContentPane().add(lblCobroPorHora);
		
		tfCobro = new JTextField();
		tfCobro.setBounds(130, 83, 86, 20);
		frame.getContentPane().add(tfCobro);
		tfCobro.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Pago por Hora:");
		lblNewLabel.setFont(new Font("Arial", Font.PLAIN, 13));
		lblNewLabel.setBounds(30, 113, 101, 20);
		frame.getContentPane().add(lblNewLabel);
		
		tfPago = new JTextField();
		tfPago.setColumns(10);
		tfPago.setBounds(130, 114, 86, 20);
		frame.getContentPane().add(tfPago);
		
		JLabel lblPenalizacin = new JLabel("Penalizaci\u00F3n:\r\n");
		lblPenalizacin.setFont(new Font("Arial", Font.PLAIN, 13));
		lblPenalizacin.setBounds(30, 143, 101, 20);
		frame.getContentPane().add(lblPenalizacin);
		
		tfPena = new JTextField();
		tfPena.setColumns(10);
		tfPena.setBounds(130, 144, 86, 20);
		frame.getContentPane().add(tfPena);
		
		JLabel lblUtilidadNeto = new JLabel("Utilidad Neto:");
		lblUtilidadNeto.setFont(new Font("Arial", Font.PLAIN, 13));
		lblUtilidadNeto.setBounds(30, 174, 101, 20);
		frame.getContentPane().add(lblUtilidadNeto);
		
		tfNeto = new JTextField();
		tfNeto.setColumns(10);
		tfNeto.setBounds(130, 175, 86, 20);
		frame.getContentPane().add(tfNeto);
		
		JLabel lblHorasPorCubrir = new JLabel("Horas por Cubrir:");
		lblHorasPorCubrir.setFont(new Font("Arial", Font.PLAIN, 13));
		lblHorasPorCubrir.setBounds(30, 205, 101, 20);
		frame.getContentPane().add(lblHorasPorCubrir);
		
		tfCubrir = new JTextField();
		tfCubrir.setColumns(10);
		tfCubrir.setBounds(130, 206, 86, 20);
		frame.getContentPane().add(tfCubrir);
		
		btnGuardar = new JButton("Guardar Cambios");
		btnGuardar.setBounds(30, 255, 208, 23);
		frame.add(btnGuardar);
		
		btnAltaGuardia = new JButton("Alta");
		btnAltaGuardia.setBounds(30, 289, 101, 20);
		frame.add(btnAltaGuardia);
		
		btnBajaGuardia = new JButton("Baja");
		btnBajaGuardia.setBounds(137, 288, 101, 20);
		frame.add(btnBajaGuardia);
		
		btnAsistencias = new JButton("Asistencias");
		btnAsistencias.setBounds(30, 319, 101, 20);
		frame.add(btnAsistencias);
		
		btnFaltas = new JButton("Faltas");
		btnFaltas.setBounds(137, 319, 101, 20);
		frame.add(btnFaltas);
		
		btnDesplegarGuardias = new JButton("Desplegar Guardias");
		btnDesplegarGuardias.setBounds(30, 350, 208, 20);
		frame.add(btnDesplegarGuardias);
		
		btnNuevo = new JButton("Nuevo");
		btnNuevo.setBounds(185, 16, 89, 23);
		frame.add(btnNuevo);
	}
		
//	public static void main(String args[]){
//		Vista2 window = new Vista2();
//		window.frame.setVisible(true);
//
//	}
}