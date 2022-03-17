package notasFinales;
import java.util.ArrayList;

public class Alumno {
	private String nombre;
    private int matricula;
    private ArrayList<Calificacion> calificaciones;

    public Alumno(String nombre, int matricula) {
    	this.nombre = nombre;
    	this.matricula = matricula;
    	this.calificaciones = new ArrayList<Calificacion>(10);
    }
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
    public String getNombre() {
		return this.nombre;
	}
	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}
    public int getMatricula() {
		return this.matricula;
	}

	public void setCalificaciones(ArrayList<Calificacion> calificaciones) {
		this.calificaciones = calificaciones;
	}
	public ArrayList<Calificacion> getCalificaciones() {
		return calificaciones;
	}

	public void calificar(String asignatura, int nota) {
		return this.asignatura + " : " + this.nota;
	}


    @Override
 	public String toString() {
    	return "Alumno matriculado: " + this.matricula + " - " + this.nombre;
    }
}

