
class Cast {
	public static void main(String[] args){
		double d = 10;
		@SuppressWarnings("unused")
		int i = (int)d; //convierte el tipo de dato double a int. "(tipo)nombrevariable".
		char hola = 'c';
		int b = (int)hola; //convierte el char a int en este caso c=99.
		System.out.println(b);
	}
}
