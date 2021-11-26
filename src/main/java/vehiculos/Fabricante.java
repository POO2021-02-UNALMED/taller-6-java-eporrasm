package vehiculos;
import java.util.*;

public class Fabricante {
	private String nombre;
	private Pais pais;
	public int vehiculosVendidos;
	private static List<Fabricante> fabricantes = new ArrayList<Fabricante>();
	
	public Fabricante(String nombre, Pais pais) {
		this.nombre = nombre;
		this.pais = pais;
		fabricantes.add(this);
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Pais getPais() {
		return pais;
	}
	public void setPais(Pais pais) {
		this.pais = pais;
	}
	public static Fabricante fabricaMayorVentas() {
		int max = 0;
		Fabricante fabricaMayorVentas = null;
		for (Fabricante fabricante : fabricantes) {
			if (fabricante.vehiculosVendidos > max) {
				max = fabricante.vehiculosVendidos;
				fabricaMayorVentas = fabricante;
			}
		}
		return fabricaMayorVentas;
	}

}
