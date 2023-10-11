package mvc.model;

public class Director implements Empleado {

	private Informe informe;
	
	private String empresa;
	
	private String email;
	
	public Director(Informe informe) {
		this.informe = informe;
	}
	
	@Override
	public String getTareas() {
		return "Tareas de Director";
	}

	@Override
	public String getInforme() {
		return "Informe de Director: " + informe.getInforme();
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
