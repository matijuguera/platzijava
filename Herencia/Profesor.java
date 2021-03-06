import java.util.ArrayList;


class Profesor extends Persona {
	
	private ArrayList<String> profesiones;
	
	public Profesor(String nombre, String apellido, int edad, double altura,String nacionalidad) {
		super(nombre, apellido, edad, altura, nacionalidad);
	}

	public ArrayList<String> getProfesiones() {
		return profesiones;
	}

	public void setProfesiones(ArrayList<String> profesiones) {
		this.profesiones = profesiones;
	}
	
	public void mostrarPersona(){
		super.mostrarProfesor();
	}

}
