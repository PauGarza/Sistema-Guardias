package libreria;

public class Guardia implements Comparable<Guardia> {
	private String nombre;
	private static int folio = 1000;
	private int id;
	private int aNacimiento;
	private String estado; //activo, enfermo, vacaciones, baja
	private int faltasAcumuladas; //Cuánto ha faltado el guardia, inicia en cero
	private int asistencias;  //inicia en cero
	private int turno; //1: matutino; 2: vespertino
	private int turnoSem; //cuántos turnos trabaja a la semana
	
	//constructores
	public Guardia () {
		faltasAcumuladas = 0;
		asistencias = 0;
		id = folio;
		folio++;
	}
	public Guardia (String unNom, int unA, String unEst, int unT, int unTS) {
		this ();
		nombre = unNom;
		aNacimiento = unA;
		estado = unEst;
		turno = unT;
		turnoSem = unTS;
	}
	
	//sets y gets
	public String getNombre() {
		return nombre;
	}
	public int getId() {
		return id;
	}
	public int getaNacimiento() {
		return aNacimiento;
	}
	public String getEstado() {
		return estado;
	}
	public int getFaltasAcumuladas() {
		return faltasAcumuladas;
	}
	public int getAsistencias() {
		return asistencias;
	}
	public int getTurno() {
		return turno;
	}
	public int getTurnoSem() {
		return turnoSem;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public void setTurno(int turno) {
		this.turno = turno;
	}
	public void setTurnoSem(int turnoSem) {
		this.turnoSem = turnoSem;
	}
	
	//to string
	/*public String toString() {
		StringBuilder sb;
		sb = new StringBuilder();
		sb.append("Nombre: "+nombre+"\nAño de nacimiento: "+aNacimiento+"\nID: "+id+"\n");
		sb.append("Estado: "+estado+"\nFatlas acumuladas: "+faltasAcumuladas+"\nAsistencias: "+asistencias+"\n");
		sb.append("Turno: "+turno+"\nTurnos por semana: "+turnoSem+"\n");
		return sb.toString();
	}*/
	
	public String toString() {
		StringBuilder sb;
		sb = new StringBuilder();
		sb.append(id + "	" + aNacimiento);
		sb.append("	" + estado + "	" + faltasAcumuladas + "	" + asistencias);
		sb.append("	" + turno + "	" + turnoSem);
		return sb.toString();
	}
	
	//equals 
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Guardia other = (Guardia) obj;
		if (id != other.id)
			return false;
		return true;
	}
	
	//comapre to
	public int compareTo(Guardia otroG) {
		int resp;
		if (id== otroG.getId())
			resp = 0;
		else
			if (id> otroG.getId())
				resp = 1;
			else
				resp = -1;
		return resp;
	}
	
	//incrementar falta
	public void incrementarFalta() {
		faltasAcumuladas ++;
	}
	
	//incrementar Asistencia
	public void incrementarAsist() {
		asistencias ++;
	}
	
}
