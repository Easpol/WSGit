package git.main;

import git.entidad.Direccion;
import git.entidad.Persona;

public class Main {

	public static void main(String[] args) {
		System.out.println("Bienvenidos a nuestras versiones con Git");
		
		Persona p = new Persona();
		p.setNombre("Steve Rogers");
		p.setEdad (45);
		
		System.out.println (p);
		
		Direccion d = new Dirección();
		d.setNombreVia ("De la plata");
		d.setTipoVIa("Calle");
		d.setPais("Argentina");
		
		
	}

}
