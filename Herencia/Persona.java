
public class Persona {
	private String nombre;
	private String apellido;
	private int edad;
	private double altura;
	private String nacionalidad;
	
	public Persona(String nombre, String apellido, int edad, double altura,
			String nacionalidad) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
		this.altura = altura;
		this.nacionalidad = nacionalidad;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public String getNacionalidad() {
		return nacionalidad;
	}

	public void setNacionalidad(String nacionalidad) {
		this.nacionalidad = nacionalidad;
	}
	
	public void mostrarProfesor(){
		System.out.println("Datos Profesor");
	}

	public void mostrarProgramador() {
		System.out.println("Datos Programador");	
	}
	
	
	
}
