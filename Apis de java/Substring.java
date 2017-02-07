
class Substring {

	public Substring(){
	}
	
	/*reciba 3 cadenas de texto y devuelva la cadena de texto combinación de:
	 * las dos primeras letras de la primera cadena, 
	 * seguidas por un espacio en blanco, 
	 * seguidas de las cuatro primeras letras de la segunda cadena, 
	 * seguidas de un guión medio y 
	 * seguido de las 6 primeras letras de la tercera cadena
	 */
	public String suprimirString(String texto1,String texto2, String texto3){
		String texto = texto1.substring(0, 2) + " " + texto2.substring(0,4) + "-" + texto3.substring(0, 7);
		return texto;
	}
}
