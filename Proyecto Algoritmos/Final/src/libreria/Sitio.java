package libreria;
import java.util.*;

public class Sitio {
	private String nombre;
	private static int folio = 0, cuenta = 0;
	private int id;
	private ArrayList<Guardia> plantilla;
	private int [][] asistFaltas;
	private final int MAX = 400;
	private double cobroHora, pagoHora, penalizacion, utilidadNeta, horasCubrir;
	//Se asume una duración de turno de 12 horas.
	
	private Sitio() {
		id = folio;
		folio++;
		plantilla = new ArrayList<Guardia>();
		asistFaltas = new int [MAX][2];
	}
	
	public Sitio(String nombre, double cobroHora, double pagoHora, double penalizacion, double horasCubrir) {
		this();
		this.nombre = nombre;
		this.cobroHora = cobroHora;
		this.pagoHora = pagoHora;
		this.penalizacion = penalizacion;
		this.horasCubrir = horasCubrir;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Guardia getGuardia(int x) {
		return plantilla.get(x);
	}

	//Mejor cambiar a setGuardia;
	public void setGuardia(String unNom, int unA, String unEst, int unT, int unTS) {
		Guardia tempo = new Guardia(unNom, unA, unEst, unT, unTS);
		plantilla.add(tempo);
		if(cuenta < 400) {
			asistFaltas[cuenta][0] = tempo.getId();
			cuenta++;
		}
	}

	public double getCobroHora() {
		return cobroHora;
	}

	public void setCobroHora(double cobroHora) {
		this.cobroHora = cobroHora;
	}

	public double getPagoHora() {
		return pagoHora;
	}

	public void setPagoHora(double pagoHora) {
		this.pagoHora = pagoHora;
	}

	public double getPenalizacion() {
		return penalizacion;
	}

	public void setPenalizacion(double penalizacion) {
		this.penalizacion = penalizacion;
	}

	public int getId() {
		return id;
	}
	
	public void setHorasCubrir(double unasH) {
		this.horasCubrir = unasH;
	}
	
	public double getHorasCubrir() {
		return horasCubrir;
	}

	public double getUtilidadNeta() {
		//usar un for, para saber cuánto se paga en total y cuánto se cobra;
		return utilidadNeta;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Sitio other = (Sitio) obj;
		if (id != other.id)
			return false;
		return true;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		
		sb.append("Sitio [" + nombre + ", ID=" + id + ", cobroHora=" + cobroHora + ", pagoHora=" + pagoHora
				+ ", penalización=" + penalizacion + ", utilidadNeta=" + utilidadNeta + "]\n");
		sb.append("Con plantilla:\n");
		sb.append("ID	Año	Estado	Faltas	Asis.	Turno	T/s\n");
		for (int i = 0; i < plantilla.size(); i++) {
			sb.append(plantilla.get(i).toString() + "\n");
		}
		
		return sb.toString();
	}
	
	public void asistencias (int idGuardia) {
		ArrayList<Integer> aux = new ArrayList<Integer>(); //ArrayList para guardar los IDS's de los guardias e incrementar la asist.
		
		for (int i = 0; i < cuenta; i++) {
			aux.add(asistFaltas[i][0]);
		}			
		int index = MAG.buscaSecuencialOrdenada(aux, idGuardia);
		if (index >= 0)
			asistFaltas[index][1]++;
	}
	
	public void faltas (int idGuardia) {
		ArrayList<Integer> aux = new ArrayList<Integer>(); //ArrayList para guardar los IDS's de los guardias e incrementar la asist.
		
		for (int i = 0; i < cuenta; i++) {
			aux.add(asistFaltas[i][0]);
		}			
		int index = MAG.buscaSecuencialOrdenada(aux, idGuardia);
		if (index >= 0)
			asistFaltas[index][2]++;
	}
	
	/*public void bajasGuardias() {
		int tempoFaltas;
		String tempoEstado;
		
		for (int i = 0; i < plantilla.size(); i++) {
			tempoFaltas = plantilla.get(i).getFaltasAcumuladas();
			tempoEstado = plantilla.get(i).getEstado();
			
			if ((tempoFaltas > 3 && tempoEstado.equalsIgnoreCase("activo")) || tempoEstado.equalsIgnoreCase("baja"))
				plantilla.remove(i);			
		}
		
	}*/
	
	public int suficientesGuardias() {
		int resp;
		
		double sumaHrs = 0;
		
		for (int i = 0; i < plantilla.size(); i++)
			if (plantilla.get(i).getEstado().equalsIgnoreCase("activo"))
				sumaHrs += plantilla.get(i).getTurnoSem() * 12;
		
		if (sumaHrs == horasCubrir)
			resp = 0;
		else {
			if (sumaHrs > horasCubrir)
				resp = 1;
			else
				resp = -1;
		}
		
		return resp;
	}
	

}
