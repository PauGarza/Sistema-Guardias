package libreria;

public class Guardia implements Comparable<Guardia> {
	private String nombre;
	private static int folio = 0;
	private int id;
	private int aNacimiento;
	private String estado; //activo, enfermo, vacs, baja
	private int turno; //1: matutino; 2: vespertino
	private int turnoSem; //cuántos turnos trabaja a la semana
	
	//constructores
	public Guardia () {
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
	
	public String toString() {
		StringBuilder sb;
		sb = new StringBuilder();
		sb.append(id + "	" + aNacimiento);
		sb.append("	" + estado);
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
}