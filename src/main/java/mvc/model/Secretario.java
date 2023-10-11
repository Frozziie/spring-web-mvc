package mvc.model;

public class Secretario implements Empleado {

	private Informe informe;
	
	private String empresa;
	
	private String email;

	@Override
	public String getTareas() {
		return "Tareas de Secretario";
	}

	@Override
	public String getInforme() {
		return "Informe de Secretario: " + informe.getInforme();
	}

	public void setInforme(Informe informe) {
		this.informe = informe;
	}
	
	public String getEmpresa() {
		return empresa;
	}

	public void setEmpresa(String empresa) {
		this.empresa = empresa;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
}
