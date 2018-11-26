
public class Ejercicio {

	public static void main(String[] args) {
		
		//Declaramos e iniciamos las variables
		
		boolean booleano = true;
		
		int entero = 30;
		
		char caracter = 'P';
		
		double decimal = 9.2;
		
		//Las convertimos en cadenas
		
		String btos, itos, ctos, dtos;
		
		btos = String.valueOf(booleano);
		
		itos = String.valueOf(entero);
		
		ctos = String.valueOf(caracter);
		
		dtos = String.valueOf(decimal);
		
		//Por último, mostramos las cadenas por consola a la vez que las concatenamos.
		
		System.out.println(btos + itos + ctos + dtos);

	}

}
