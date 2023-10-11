package mvc.model;

public class Jefe implements Empleado {

	private Informe informe;
	
	public Jefe(Informe informe) {
		this.informe = informe;
	}
	
	@Override
	public String getTareas() {
		return "Tareas de Jefe";
	}

	@Override
	public String getInforme() {
		return "Informe de Jefe: " + informe.getInforme();
	}
}
