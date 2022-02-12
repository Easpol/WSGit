package git.entidad;

public class Direccion {
	private String tipoVIa;
	private String nombreVia;
	private String Cp;
	private String Ciudad;
	private String Pais;
	

	
	public String getTipoVIa() {
		return tipoVIa;
	}
	public void setTipoVIa(String tipoVIa) {
		this.tipoVIa = tipoVIa;
	}
	public String getNombreVia() {
		return nombreVia;
	}
	public void setNombreVia(String nombreVia) {
		this.nombreVia = nombreVia;
	}
	public String getCp() {
		return Cp;
	}
	public void setCp(String cp) {
		Cp = cp;
	}

	public String getPais() {
		return Pais;
	}
	public void setPais(String pais) {
		Pais = pais;
	}
	
	public String getCiudad() {
		return Ciudad;
	}
	public void setCiudad(String ciudad) {
		Ciudad = ciudad;
	}
	@Override
	public String toString() {
		return "Direccion [tipoVIa=" + tipoVIa + ", nombreVia=" + nombreVia + ", Cp=" + Cp + ", Pais=" + Pais
				+ ", Ciudad=" + Ciudad + "]";
	}
}
