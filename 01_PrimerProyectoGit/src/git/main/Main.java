package git.main;

import git.entidad.Direccion;
import git.entidad.Persona;

public class Main {

	public static void main(String[] args) {
		System.out.println("Bienvenidos a nuestras versiones con Git");
		
		Persona p = new Persona();
		p.setNombre("Steve Rogers");
		p.setEdad (45);
		
		Direccion d = new Direccion();
		d.setNombreVia("trece rue del Percebe");
		d.setTipoVIa("Calle");
		d.setCiudad("Madrid");
		d.setPais("España");
		
		
		System.out.println (p);

		System.out.println ("toma yaaaaaa");
	}

}
