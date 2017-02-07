import java.util.ArrayList;
import java.util.List;


class Listas {
	/*Es como un arreglo, la diferencia esta en que un arreglo no puede crecer, 
	Las listas pueden crecer dinamicamente y almacena objetos(no datos primitivos).
	*/
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String args){
	//Definimos una ArrayList de string (esta es una interfaz)
	List<String> list = new ArrayList<String>();
	// A�adimos elementos
	list.add("Andrea");
	list.add("Amaya");
	list.add("Julio");
	//Otra que puede almacenar objetos de diferentes tipos(No es una buena practica)(esta es la implementacion)
	ArrayList a = new ArrayList();
	a.add("Lenguaje");
	a.add(3);
	a.add('a');
	a.add(23.3);
	//Siempre parametrizar las listas
	ArrayList<Integer> miLista = new ArrayList<Integer>();
	miLista.add(1);
	miLista.add(2);
	miLista.add(3);
	//For each para las listas
	for(Object i: a ){
		System.out.println(i);
	}
	
	}
}
