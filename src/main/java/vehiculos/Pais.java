package vehiculos;
import java.util.*;

public class Pais {
	private String nombre;
	public int vehiculosVendidos;
	private static List<Pais> paises = new ArrayList<Pais>();
	
	public Pais(String nombre) {
		this.nombre = nombre;
		paises.add(this);
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public static Pais paisMasVendedor() {
		int max = 0;
		Pais paisMasVendedor = null;
		for (Pais pais : paises) {
			if (pais.vehiculosVendidos > max) {
				max = pais.vehiculosVendidos;
				paisMasVendedor = pais;
			}
		}
		return paisMasVendedor;
	}
}
