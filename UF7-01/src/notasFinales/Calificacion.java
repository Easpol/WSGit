package notasFinales;

public class Calificacion {
    private String asignatura;
    private int nota; // Valor de 0 a 100

    public Calificacion (String asignatura, int nota) {
    	this.asignatura = asignatura;
    	this.nota = nota;
    	}
    public Calificacion () {
    }
    
	public void setAsignatura(String asignatura) {
		this.asignatura = asignatura;
	}
	public String getAsignatura() {
		return this.asignatura;
	}
	public void setNota(int nota) {
		this.nota = nota;
	}
	public int getNota() {
		return this.nota;
	}

@Override

  public String toString() {
	return this.asignatura + " : " + this.nota ;

                      // Devolver una cadena de tipo: “Lengua: 55”

  }
}
