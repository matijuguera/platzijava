import java.util.Scanner;


class testWhilebreak {
 //Una negrada
	public static void main(String[] args){
		System.out.println("Ingrese una palabra:");
		Scanner scanner = new Scanner(System.in);
		String entradaTeclado;
		entradaTeclado = scanner.nextLine();
		scanner.close();
		int i=1;
		while(true){
			System.out.println(entradaTeclado.substring(i-1,i));
			if(i==entradaTeclado.length()){
				break;
			}
			i++;
		}	
	}
}
