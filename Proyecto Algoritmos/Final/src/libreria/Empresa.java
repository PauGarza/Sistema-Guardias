package libreria;

import java.io.File;
import java.io.FileInputStream;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.util.*;

public class Empresa {
	
	private String nombre;
	private String password;
	private int guardias;
	private ArrayList<Sitio> sitios;
	
	public Empresa() {
		sitios = new ArrayList<Sitio>();
	}
	
	public Empresa(String nombre, String password) {
		this();
		this.nombre = nombre;
		this.password = password;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	public void altaSitio (Sitio unSitio) {
		sitios.add(unSitio);
	}
	
	public Sitio getSitio (int x) {
		return sitios.get(x);
	}
	
	public void setArchivo () {
		String nombreArchivo = "Guardias.xlsx";
		String rutaArchivo = "D:\\OneDrive\\Documentos\\ITAM\\Primer semestre\\" + nombreArchivo;
		String hoja = "Sitio1";
		String nom;
		int ed;	
		String edo;
		int turno;
		int turnosSem;
		
		Sitio s1 = new Sitio("Pruebas", 100, 80, 250, 5184);
 
		try (FileInputStream file = new FileInputStream(new File(rutaArchivo))) {
			XSSFWorkbook worbook = new XSSFWorkbook(file);
			XSSFSheet sheet = worbook.getSheetAt(0);
			Iterator<Row> rowIterator = sheet.iterator();
 
			Row row;
			row = rowIterator.next();
			while (rowIterator.hasNext()) {
				row = rowIterator.next();
				Iterator<Cell> cellIterator = row.cellIterator();
				Cell cell;
				while (cellIterator.hasNext()) {
					cell = cellIterator.next();
					nom = cell.getStringCellValue();
					
					cell = cellIterator.next();
					ed = (int)cell.getNumericCellValue();
					
					cell = cellIterator.next();
					edo = cell.getStringCellValue();
					
					cell = cellIterator.next();
					turno = (int)cell.getNumericCellValue();
					
					cell = cellIterator.next();
					turnosSem = (int)cell.getNumericCellValue();
					
					s1.setGuardia(nom, ed, edo, turno, turnosSem);
				}
			}	
			
			this.altaSitio(s1);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	//buscar guardia en todos los sitios?
	//Buscar un guardia en un sitio en específico.
	
	public String toString() {
		StringBuilder sb;
		sb = new StringBuilder();
		sb.append("Nombre: "+nombre+"\n");
		sb.append("Guardias: "+guardias+"\n");
		for (int i = 0; i < sitios.size(); i++) {
			sb.append(sitios.get(i).getNombre()+"\n");
		}
		return sb.toString();
	}
	
}