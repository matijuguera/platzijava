import java.util.Scanner;
class ContadorDeLetras {
	/* a) Si la cadena introducida tiene menos de 5 caracteres, entre 5 y 15 caracteres o más de 15 caracteres. 
	 * b) Si la cadena introducida comienza por la letra a.
	 * Ejemplo: se pide la entrada y el usuario introduce “vereda”. Por pantalla se debe mostrar: “La cadena introducida tiene entre 5 y 15 caracteres y no comienza por a”.
	 */
	public static void main(String[] args){
		System.out.println("Ingrese una palabra: ");
		String entradaTeclado;
		Scanner scanner = new Scanner(System.in);
		entradaTeclado = scanner.nextLine();
		entradaTeclado = entradaTeclado.toLowerCase();
		scanner.close();
		System.out.println("La palabra que ingreso es:" + entradaTeclado);
		if(entradaTeclado.length() < 5){
			System.out.println("La palabra tiene menos de 5 letras");
		}else if(entradaTeclado.length() < 15){
			System.out.println("La palabra tiene entre 5 y 15 letras");
		}else{
			System.out.println("La palabra tiene mas de 15 letras");
		}
		System.out.println("La palabra empieza con la letra a: " + entradaTeclado.startsWith("a"));
	}
}
