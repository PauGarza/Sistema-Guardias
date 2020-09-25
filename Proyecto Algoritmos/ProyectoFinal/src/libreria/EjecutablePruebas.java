package libreria;
import java.util.*;
import java.io.*;

public class EjecutablePruebas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Sitio s1 = new Sitio("Pruebas", 100, 80, 250, 5184);
		
		File entrada = new File("guardiasPrueba.txt");		
		Scanner leeArch;
		
		int n;
		String nom;
		int ed;	
		String edo;
		int turno;
		int turnosSem;
		
		try {
			
			leeArch = new Scanner(entrada);
			
			n = leeArch.nextInt();
						
			
			for (int i = 0; i < n; i++) {
				nom = leeArch.next();
				ed = leeArch.nextInt();
				edo = leeArch.next();
				turno = leeArch.nextInt();
				turnosSem = leeArch.nextInt();								
				
				s1.setGuardia(nom, ed, edo, turno, turnosSem);				
			}
			
			leeArch.close();						
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} 
		
		//__________________________________________________________________________________________________
		File entrada2 = new File("asistencias.txt");		
		Scanner leeArch2;
		int [] asistencias = new int[400];
		
		try {
			
			leeArch2 = new Scanner(entrada2);			
			n = leeArch2.nextInt();
									
			for (int i = 0; i < n; i++) {							
				asistencias[i] = leeArch2.nextInt();
			}
			
			leeArch2.close();					
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		s1.asistencia(asistencias);
		
		//__________________________________________________________________________________________________
		File entrada3 = new File("asistencias.txt");		
		Scanner leeArch3;
		int [] faltas = new int[300];
		
		try {
			
			leeArch3 = new Scanner(entrada2);			
			n = leeArch3.nextInt();
									
			for (int i = 0; i < n; i++) {							
				faltas[i] = leeArch3.nextInt();
			}
			
			leeArch3.close();					
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		s1.inasistencias(faltas);
		System.out.println(s1.toString());
		
		//_______________________________________________________________________________________________
		s1.bajasGuardias();
		System.out.println(s1.toString());
		
		//_______________________________________________________________________________________________
		System.out.println("¿Hay suficientes guardias? " + s1.suficientesGuardias());
	}

}
